package com.bristelcone;

public class DatabaseProperties {
	private String username;
	private String password;
	private String url;
	public DatabaseProperties() {
		super();
		System.out.println("DatabaseProperties()");
	}
	public DatabaseProperties(String username, String password, String url) {
		super();
		this.username = username;
		this.password = password;
		this.url = url;
		System.out.println("DatabaseProperties(String, String, String)");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
