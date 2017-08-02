package com.spring.config;

public class DBConfig {

	private String host;
	private String port;
	private String name;
	public DBConfig(String host, String port, String name) {
		super();
		this.host = host;
		this.port = port;
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DBConfig [host=" + host + ", port=" + port + ", name=" + name + "]";
	}
	
	
	
}
