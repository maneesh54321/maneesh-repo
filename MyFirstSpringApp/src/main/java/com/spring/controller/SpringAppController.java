package com.spring.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.SpringAppService;

@Controller
@RequestMapping("/controller")
public class SpringAppController {

	@Qualifier("springAppService")
	private SpringAppService springAppService;

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public String getData() {
		Logger.getLogger("MyFirstSpringApp").log(Level.INFO, "Entered the Controller");
		return "controllerHome";
	}
}
