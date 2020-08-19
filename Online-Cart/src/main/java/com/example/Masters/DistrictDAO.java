package com.example.Masters;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Utils.OnlineRepository;
@Repository
public interface DistrictDAO extends OnlineRepository<DistrictDTO, Serializable> {

	List<DistrictDTO> findByStateIdAndStatus(String stateId,String status);
	List<DistrictDTO> findByStateNameAndIsEnableTrue(String stateName);
}
