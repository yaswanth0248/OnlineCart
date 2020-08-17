package com.example.SaveMasters;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Masters.DistrictDAO;
import com.example.Masters.DistrictDTO;
import com.example.Masters.MandalDAO;
import com.example.Masters.MandalDTO;

@Service
public class SaveMastersServiceImpl implements SaveMastersService {
	@Autowired
	MandalDAO mandalDAO;
	@Autowired
	DistrictDAO districtDAO;
	
	@Override
	public String SaveDistrictMasters(String StateId, int endPoint, String StateName) {
		// To Save Master District Data
		LocalDateTime a = LocalDateTime.of(1956, Month.NOVEMBER, 1, 00, 10, 30);
		DistrictDTO dto = new DistrictDTO();
		for (int i = 1; i <= endPoint; i++) {
			dto.setDistrictId("AP0");
			dto.setDistrictName("");
			dto.setStateName(StateName);
			dto.setStateId(StateId);
			dto.setCreatedDate(a);
			dto.setCreatedBy("YASWANTH");
			dto.setStatus("Y");
			dto.setIsEnable(true);
		}
		
		return "Success";
	}

	@Override
	public String SaveMandalMasters(String DistrictId,int endPoint,String MandalId) {
		// To Save Master Mandal Data
		LocalDateTime a = LocalDateTime.of(1956, Month.NOVEMBER, 1, 00, 10, 30);
		MandalDTO dto = new MandalDTO();
		for (int i = 1; i <= endPoint; i++) {			
			dto.setCreatedBy("YASWANTH");
			dto.setIsEnable(true);
			dto.setDistrictId(DistrictId);
			dto.setMandalId(MandalId);
			dto.setStatus("Y");
			dto.setStateId("1");
			dto.setMandalName("");
			dto.setCreatedDate(a);
			mandalDAO.save(dto);
		}		
		return "Success";
	}

}
