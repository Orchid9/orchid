package com.cn.qdc;

public class User {

	private String username;
	private BeyService beyService;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public BeyService getBeyService() {
		return beyService;
	}

	public void setBeyService(BeyService beyService) {
		this.beyService = beyService;
	}

	public void sayHello() {
		System.out.println("hello " + username);
		beyService.sayBey();
	}

	public User() {
		super();
		System.out.println("user 被创建");
	}

}
