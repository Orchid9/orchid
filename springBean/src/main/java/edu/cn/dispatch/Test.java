package edu.cn.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("edu/cn/dispatch/beans.xml");
		DBUtil dbutil=(DBUtil) ac.getBean("dbutil");
		System.out.println(dbutil);
	}
}
