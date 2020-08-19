package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Masters.DistrictDTO;
import com.example.Masters.MandalDTO;
import com.example.Services.MasterServices;
import com.example.Utils.MappingUrls;
import com.example.Utils.OnlineBadRequestException;
import com.example.Utils.OnlineResponse;

@RestController
@CrossOrigin
@RequestMapping(MappingUrls.masters_data_url)
public class MasterController {
	@Autowired
	private MasterServices masterServices;

	@GetMapping(value = "/showAllStates")
	public OnlineResponse<?> GetAllStates() {
		try {

			return new OnlineResponse<>(true, HttpStatus.ACCEPTED, "Success", masterServices.showAllStates());
		} catch (OnlineBadRequestException o) {
			return new OnlineResponse<>(HttpStatus.BAD_REQUEST, o.getMessage());
		} catch (Exception e) {
			return new OnlineResponse<>(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@GetMapping(value = "/showAllDistricts")
	public OnlineResponse<?> GetAllDistricts(@RequestParam String stateId, @RequestParam String status) {
		try {
			if (StringUtils.isEmpty(stateId) || StringUtils.isEmpty(status)) {
				throw new OnlineBadRequestException("Pass StateId & Status");
			}
			List<DistrictDTO> districtDTO = masterServices.showAllDistricts(stateId, status);
			return new OnlineResponse<>(true, HttpStatus.ACCEPTED, "Success", districtDTO);
		} catch (OnlineBadRequestException o) {
			return new OnlineResponse<>(HttpStatus.BAD_REQUEST, o.getMessage());
		} catch (NullPointerException ne) {
			return new OnlineResponse<>(HttpStatus.NO_CONTENT, ne.getMessage());
		} catch (Exception e) {
			return new OnlineResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}

	@GetMapping(value = "/showAllMandals")
	public OnlineResponse<?> GetAllMandals(@RequestParam String districtId, @RequestParam String status) {
		try {
			if (StringUtils.isEmpty(districtId) || StringUtils.isEmpty(status)) {
				throw new OnlineBadRequestException("Pass DistrictId & Status");
			}
			List<MandalDTO> mandalDTO = masterServices.showAllMandals(districtId, status);
			return new OnlineResponse<>(true, HttpStatus.ACCEPTED, "Success", mandalDTO);
		} catch (OnlineBadRequestException o) {
			return new OnlineResponse<>(HttpStatus.BAD_REQUEST, o.getMessage());
		} catch (NullPointerException ne) {
			return new OnlineResponse<>(HttpStatus.NO_CONTENT, ne.getMessage());
		} catch (Exception e) {
			return new OnlineResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}
}
