package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.UserRegistrationDAO;
import com.example.DTO.UserRegistrationDTO;
import com.example.Mappers.UserSignUpMappers;
import com.example.VO.UserRegistrationVO;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserSignUpMappers userSignUpMappers;
	@Autowired
	private UserRegistrationDAO userRegistrationDAO;

	@Override
	public String SaveUserDetails(UserRegistrationVO userRegistrationVO) {
		UserRegistrationDTO dto = null;
		dto = userSignUpMappers.convertVO(userRegistrationVO);		
		userRegistrationDAO.save(dto);
		return "Success";
	}

}
