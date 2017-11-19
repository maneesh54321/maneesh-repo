package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.VO.ResourceVO;
import com.spring.service.ResourceServiceImpl;

@Controller
@RequestMapping("/resourceController")
public class ResourceController {
	
	@Autowired
	private ResourceServiceImpl resourceServiceImpl;
	
	@RequestMapping(value = "/getPageOfResources", method = RequestMethod.GET)
	public ResponseEntity<Page<ResourceVO>> retrievePageOfResources(@RequestParam int page, @RequestParam int size){
		Pageable pageable=new PageRequest(page,size);
		Page<ResourceVO> pageOfResources=resourceServiceImpl.retrieveAllResources(pageable);
		ResponseEntity<Page<ResourceVO>> response=new ResponseEntity<Page<ResourceVO>>(pageOfResources, HttpStatus.OK);
		return response;
	}
	
	@RequestMapping(value="/getResourceById", method=RequestMethod.GET)
	public ResponseEntity<ResourceVO> getResourceById(@RequestParam Integer id){
		return new ResponseEntity<ResourceVO>(resourceServiceImpl.getResourceById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/getResourceByName", method=RequestMethod.GET)
	public ResponseEntity<ResourceVO> getResourceByName(@RequestParam String name){
		return new ResponseEntity<ResourceVO>(resourceServiceImpl.getResourceByName(name), HttpStatus.OK);
	}
}
