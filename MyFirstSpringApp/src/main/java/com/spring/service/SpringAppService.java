package com.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring.dao.SpringAppDao;

@Service("springAppService")
@Scope("singleton")
public class SpringAppService {
	
	@Qualifier("springAppDao")
	private SpringAppDao springAppDao;
	
	public String getAppName() {
		return springAppDao.getAppName();
	}
}
