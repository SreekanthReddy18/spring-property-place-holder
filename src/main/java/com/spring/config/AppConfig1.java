package com.spring.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("db.properties")
@Component
public class AppConfig1 {

	@Value("${db.host1}")
	private String dbHost;
	@Value("${db.name1}")
	private String dbName;
	@Value("${db.port1}")
	private String dbPort;

	
	@Bean("dbConfig1")
	public DBConfig getDBConfig() {
		return new DBConfig(dbHost, dbPort, dbName);
	}

}
