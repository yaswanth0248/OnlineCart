package com.example.Masters;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.example.Utils.OnlineRepository;
@Repository
public interface DistrictDAO extends OnlineRepository<DistrictDTO, Serializable> {

}
