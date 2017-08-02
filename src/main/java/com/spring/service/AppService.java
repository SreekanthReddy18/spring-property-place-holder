package com.spring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.config.DBConfig;

@Service
public class AppService implements InitializingBean {

	@Autowired
	@Qualifier("dbConfig1")
	DBConfig config1;
	
	@Autowired
	@Qualifier("dbConfig2")
	DBConfig config2;


	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AppConfig1");
		System.out.println(config1);
		
		System.out.println("AppConfig2");
		System.out.println(config2);
	}
	
	
}
