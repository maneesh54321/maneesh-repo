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

import com.spring.VO.TransactionVO;
import com.spring.service.TransactionDataServiceImpl;

@Controller
@RequestMapping(value="/txnDataController")
public class TransactionDataController {
	
	@Autowired
	private TransactionDataServiceImpl service;
	
	@RequestMapping(value="/getAllTransactions", method=RequestMethod.GET)
	public ResponseEntity<Page<TransactionVO>> getAllTransactions(@RequestParam int page, @RequestParam int size){
		Pageable pageable=new PageRequest(page, size);
		return new ResponseEntity<Page<TransactionVO>>(service.getAllTransactions(pageable),HttpStatus.OK);
	}
}
