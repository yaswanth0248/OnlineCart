package com.example.SaveMasters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Utils.MappingUrls;
import com.example.Utils.OnlineResponse;

@RestController
@CrossOrigin
@RequestMapping(MappingUrls.save_master_data_url)
public class SaveMastersController {

	@Autowired
	SaveMastersService saveMastersService;

	@PostMapping(value = "/saveMasterDistricts")
	public OnlineResponse<?> SaveMasterDistricts(@RequestParam(value = "sid") String StateId,
			@RequestParam int endPoint, @RequestParam String StateName) {
		try {
			String str = saveMastersService.SaveDistrictMasters(StateId, endPoint, StateName);
			return new OnlineResponse<>(true, HttpStatus.ACCEPTED, str);
		} catch (NullPointerException ne) {
			return new OnlineResponse<>(false, HttpStatus.INTERNAL_SERVER_ERROR, ne.getMessage());
		} catch (Exception e) {
			return new OnlineResponse<>(false, HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}

	@PostMapping(value = "/saveMasterMandals")
	public OnlineResponse<?> SaveMasterMandals(@RequestParam(value = "did") String DistrictId,
			@RequestParam int endPoint, @RequestParam String MandalId) {
		try {
			String str = saveMastersService.SaveMandalMasters(DistrictId, endPoint, MandalId);
			return new OnlineResponse<>(true, HttpStatus.ACCEPTED, str);
		} catch (NullPointerException ne) {
			return new OnlineResponse<>(false, HttpStatus.INTERNAL_SERVER_ERROR, ne.getMessage());
		} catch (Exception e) {
			return new OnlineResponse<>(false, HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}
}
