package com.example.Services;

import org.springframework.stereotype.Service;

import com.example.VO.UserRegistrationVO;
@Service
public interface UserRegistrationService {

	String SaveUserDetails(UserRegistrationVO userRegistrationVO);
}
