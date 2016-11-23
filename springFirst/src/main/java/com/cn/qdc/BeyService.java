package com.cn.qdc;

public class BeyService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayBey(){
		System.out.println("bey "+name);
	}

	public BeyService() {
		super();
		System.out.println("beyservice 被创建");
	}
	
}
