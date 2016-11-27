package edu.cn.stu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("edu/cn/stu/beans.xml");
		Graduate graduate=(Graduate) ac.getBean("graduate");
		System.out.println(graduate.getAge()+" "+graduate.getName()+" "+graduate.getDegree());
		
	}
	
}
