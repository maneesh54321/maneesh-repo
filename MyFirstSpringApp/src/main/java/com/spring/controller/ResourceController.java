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
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.VO.ResourceVO;
import com.spring.service.ResourceServiceImpl;

@Controller
@RequestMapping("/resourceController")
public class ResourceController {
	
	@Autowired
	private ResourceServiceImpl resourceServiceImpl;
	
	@RequestMapping(value = "/getPageOfResources", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Page<ResourceVO>> retrievePageOfResources(){
		Pageable pageable=new PageRequest(1, 10);
		Page<ResourceVO> page=resourceServiceImpl.retrieveAllResources(pageable);
		ResponseEntity<Page<ResourceVO>> response=new ResponseEntity<Page<ResourceVO>>(page, HttpStatus.OK);
		System.out.println(page.getSize());
		return response;
	}
}
