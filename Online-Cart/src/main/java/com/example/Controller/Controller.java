package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.UserRegistrationService;
import com.example.Utils.MappingUrls;
import com.example.Utils.OnlineBadRequestException;
import com.example.Utils.OnlineResponse;
import com.example.VO.UserRegistrationVO;

@RestController
@RequestMapping(MappingUrls.online_cart_url)
public class Controller {
	@Autowired
	private UserRegistrationService userRegistrationService;

	@GetMapping("/test")
	public String test() {
		return "Hai ......";
	}

	@PostMapping(value = "/saveUserDetails", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public OnlineResponse<?> SavingTheData(@RequestBody UserRegistrationVO userRegistrationVO) {
		try {
			if (!StringUtils.isEmpty(userRegistrationVO)) {
				userRegistrationService.SaveUserDetails(userRegistrationVO);
				return new OnlineResponse<>(true, HttpStatus.ACCEPTED, "Successfully Saved");
			} else {
				throw new OnlineBadRequestException("Please pass all the Mandatory Fields");
			}
		} catch (OnlineBadRequestException o) {
			return new OnlineResponse<>(HttpStatus.BAD_REQUEST, o.getMessage());
		} catch (NullPointerException n) {
			return new OnlineResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, n.getMessage());
		} catch (Exception e) {
			return new OnlineResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}

	}

}
