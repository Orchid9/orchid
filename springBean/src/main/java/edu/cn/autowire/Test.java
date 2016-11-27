package edu.cn.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("edu/cn/autowire/beans.xml");
		Master master=(Master) ac.getBean("master");
		System.out.println(master.getName()+master.getDog().getName());
	}
}
