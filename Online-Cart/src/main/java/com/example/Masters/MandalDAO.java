package com.example.Masters;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Utils.OnlineRepository;
@Repository
public interface MandalDAO extends OnlineRepository<MandalDTO, Serializable> {

	
	List<MandalDTO> findByDistrictIdAndStatus(String districtId,String status);
}
