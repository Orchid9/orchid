package edu.cn.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("edu/cn/constructor/beans.xml");
		Employee ee=(Employee) ac.getBean("employee");
		System.out.println(ee.getName()+ee.getAge());
	}
}
