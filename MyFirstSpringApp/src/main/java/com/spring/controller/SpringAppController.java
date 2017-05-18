package com.spring.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.SpringAppService;

@Controller
@RequestMapping("/controller")
public class SpringAppController {
	
	@Qualifier("springAppService")
	private SpringAppService springAppService;
}
