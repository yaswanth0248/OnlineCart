package com.example.Utils;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface OnlineRepository<T, ID extends Serializable>
		extends PagingAndSortingRepository<T, Serializable>, QueryByExampleExecutor<T> {
	
	

}
