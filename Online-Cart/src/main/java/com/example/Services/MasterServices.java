package com.example.Services;

import java.util.List;

import com.example.Masters.DistrictDTO;
import com.example.Masters.MandalDTO;
import com.example.Masters.StateDTO;

public interface MasterServices {

	List<StateDTO> showAllStates();

	List<DistrictDTO> showAllDistricts(String stateId, String status);
	
	List<MandalDTO> showAllMandals(String districtId,String status);

}
