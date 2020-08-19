package com.example.Masters;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Utils.OnlineRepository;

@Repository
public interface StateDAO extends OnlineRepository<StateDTO, Serializable> {

	List<StateDTO> findByIsEnableTrue();

	StateDTO findByStateId(String stateId);

}
