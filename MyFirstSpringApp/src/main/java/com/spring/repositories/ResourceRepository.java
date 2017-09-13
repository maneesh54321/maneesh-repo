package com.spring.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.model.Resource;

public interface ResourceRepository extends PagingAndSortingRepository<Resource, Integer>{
	
}
