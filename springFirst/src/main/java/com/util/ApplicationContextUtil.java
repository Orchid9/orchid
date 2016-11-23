package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//禁止别人外写这个类，使用final
final public class ApplicationContextUtil {

	private static ApplicationContext ac=null;
	//构造函数为私有，别人无法构建
	private ApplicationContextUtil(){
		
	}
	static{
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	public static ApplicationContext getApplicationContext(){
		return ac;
	}
}
