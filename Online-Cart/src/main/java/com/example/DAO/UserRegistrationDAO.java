package com.example.DAO;

import java.io.Serializable;
import org.springframework.stereotype.Repository;
import com.example.DTO.UserRegistrationDTO;
import com.example.Utils.OnlineRepository;

@Repository
public interface UserRegistrationDAO extends OnlineRepository<UserRegistrationDTO, Serializable> {

}
