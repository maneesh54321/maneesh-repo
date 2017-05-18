package com.spring.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("springAppDao")
@Scope("singleton")
public class SpringAppDao {
	public String getAppName() {
		return "FirstSpringApp";
	}
}
