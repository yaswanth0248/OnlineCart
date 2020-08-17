package com.example.Mappers;

import org.springframework.stereotype.Component;

import com.example.DTO.AddressDTO;
import com.example.Utils.OnlineBaseMapper;
import com.example.VO.AddressVO;
@Component
public class OnlineAddressMapper extends OnlineBaseMapper<AddressVO, AddressDTO> {

	@Override
	public AddressVO convertDTO(AddressDTO dto) {
		AddressVO vo = new AddressVO();
		funPoint(dto.getDoorNo(), vo::setDoorNo);
		funPoint(dto.getStreetName(), vo::setStreetName);
		funPoint(dto.getMandalName(), vo::setMandalName);
		funPoint(dto.getDistrictName(), vo::setDistrictName);
		funPoint(dto.getCity(), vo::setCity);
		funPoint(dto.getPinCode(), vo::setPinCode);
		funPoint(dto.getState(), vo::setState);
		funPoint(dto.getCountry(), vo::setCountry);
		
		return vo;
	}

	@Override
	public AddressDTO convertVO(AddressVO vo) {
		AddressDTO dto = new AddressDTO();
		dto.setDoorNo(vo.getDoorNo());
		dto.setStreetName(vo.getStreetName());
		dto.setMandalName(vo.getMandalName());
		dto.setDistrictName(vo.getDistrictName());
		dto.setPinCode(vo.getPinCode());
		dto.setCity(vo.getCity());
		dto.setState(vo.getState());
		dto.setCountry(vo.getCountry());
		
		return dto;
	}

	
}
