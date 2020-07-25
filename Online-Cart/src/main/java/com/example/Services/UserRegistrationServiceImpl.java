package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.DAO.UserRegistrationDAO;
import com.example.DTO.UserRegistrationDTO;
import com.example.Mappers.OnlineMappers;
import com.example.VO.UserRegistrationVO;


public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private OnlineMappers onlineMappers;
	@Autowired
	private UserRegistrationDAO userRegistrationDAO;

	@Override
	public String SaveUserDetails(UserRegistrationVO userRegistrationVO) {
		UserRegistrationDTO dto = null;
		dto = onlineMappers.convertVO(userRegistrationVO);		
		userRegistrationDAO.save(dto);
		return "Success";
	}

}
