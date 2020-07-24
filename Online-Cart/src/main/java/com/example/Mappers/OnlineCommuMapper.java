package com.example.Mappers;

import org.springframework.stereotype.Component;

import com.example.DTO.CommunicationDTO;
import com.example.Utils.OnlineBaseMapper;
import com.example.VO.CommunicationVO;
@Component
public class OnlineCommuMapper extends OnlineBaseMapper<CommunicationVO, CommunicationDTO> {

	@Override
	public CommunicationVO convertDTO(CommunicationDTO dto) {
		CommunicationVO vo = new CommunicationVO();
		funPoint(dto.getEmail(), vo::setEmail);
		funPoint(dto.getPhoneno(), vo::setPhoneno);
		
		return vo;
	}

	@Override
	public CommunicationDTO convertVO(CommunicationVO vo) {
		CommunicationDTO dto = new CommunicationDTO();
		dto.setEmail(vo.getEmail());
		dto.setPhoneno(vo.getPhoneno());
		
		return dto;
	}

}
