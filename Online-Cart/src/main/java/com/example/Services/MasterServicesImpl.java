package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Masters.DistrictDAO;
import com.example.Masters.DistrictDTO;
import com.example.Masters.MandalDAO;
import com.example.Masters.MandalDTO;
import com.example.Masters.StateDAO;
import com.example.Masters.StateDTO;

@Service
public class MasterServicesImpl implements MasterServices {
	
	@Autowired
	private StateDAO stateDAO;
	@Autowired
	private DistrictDAO districtDAO;
	@Autowired
	private MandalDAO mandalDAO;

	@Override
	public List<StateDTO> showAllStates() {
		return stateDAO.findByIsEnableTrue();
	}

	@Override
	public List<DistrictDTO> showAllDistricts(String stateId,String status) {
		return districtDAO.findByStateIdAndStatus(stateId,status);
	}

	@Override
	public List<MandalDTO> showAllMandals(String districtId, String status) {
		return mandalDAO.findByDistrictIdAndStatus(districtId, status);
	}

}
