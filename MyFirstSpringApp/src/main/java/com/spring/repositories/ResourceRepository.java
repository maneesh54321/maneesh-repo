package com.spring.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.spring.model.Resource;

public interface ResourceRepository extends PagingAndSortingRepository<Resource, Integer>{
	
	@Query("select r from Resource r where r.resourceName= :resourceName and r.resourceType='process'")
	public Resource getResourceByResourceName(@Param("resourceName") String resourceName);
	
	public Resource getResourceByResourceId(Integer id);
}
