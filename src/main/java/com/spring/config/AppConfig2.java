package com.spring.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig2 {
	@Autowired
	Environment env;

	@Bean("dbConfig2")
	public DBConfig getDBConfig() {
		return new DBConfig(env.getProperty("db.host"), env.getProperty("db.port"), env.getProperty("db.name"));
	}

}
