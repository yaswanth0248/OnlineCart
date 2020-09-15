package com.example.Mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.DTO.UserRegistrationDTO;
import com.example.Utils.OnlineBaseMapper;
import com.example.VO.UserRegistrationVO;
@Component
public class UserSignUpMappers extends OnlineBaseMapper<UserRegistrationVO, UserRegistrationDTO>{

	@Autowired
	private OnlineAddressMapper onlineAddressMapper;
	
	@Autowired
	private OnlineCommuMapper onlineCommuMapper;
	
	@Override
	public UserRegistrationVO convertDTO(UserRegistrationDTO dto) {
		UserRegistrationVO vo = new UserRegistrationVO();
		vo.setUserId(dto.getUserId());
		vo.setName(dto.getName());
		vo.setFatherName(dto.getFatherName());
		vo.setAge(dto.getAge());
		vo.setUserName(dto.getUserName());
		vo.setPassword(dto.getPassword());
		vo.setGender(dto.getGender());
		if(dto.getAddressDTO()!=null) {
			funPoint(onlineAddressMapper.convertDTO(dto.getAddressDTO()), vo::setAddressVO);
			
		}
		if(dto.getCommunicationDTO()!=null) {
			funPoint(onlineCommuMapper.convertDTO(dto.getCommunicationDTO()), vo::setCommunicationVO);
			
		}
		
		return vo;
	}

	@Override
	public UserRegistrationDTO convertVO(UserRegistrationVO vo) {
		UserRegistrationDTO dto = new UserRegistrationDTO();
		funPoint(vo.getUserId(), dto::setUserId);
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.getFatherName(), dto::setFatherName);
		funPoint(vo.getUserName(), dto::setUserName);
		funPoint(vo.getAge(), dto::setAge);
		funPoint(vo.getPassword(), dto::setPassword);
		funPoint(vo.getGender(), dto::setGender);
		if(vo.getAddressVO()!=null) {
			funPoint(onlineAddressMapper.convertVO(vo.getAddressVO()), dto::setAddressDTO);
		}
		if(vo.getCommunicationVO()!=null) {
			funPoint(onlineCommuMapper.convertVO(vo.getCommunicationVO()), dto::setCommunicationDTO);
		}	
		return dto;
	}

}
