package com.example.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Utils.MappingUrls;
import com.example.Utils.OnlineResponse;

@RestController
@CrossOrigin
@RequestMapping(MappingUrls.masters_data_url)
public class MasterController {
	
	@GetMapping(value="/getAllDistricts")
	public OnlineResponse<?> GetAllDistricts(){
		
		String result ="ok";
		
		return new OnlineResponse<>(true, HttpStatus.ACCEPTED, result);
	}

}
