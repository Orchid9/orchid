package spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		//1. 创建 Spring 的 IOC 容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/aop/impl/beans.xml");
		//2. 从IOC容器中获取 bean 的实例
		ArithmeticCalculator atithmeticCalculator=ctx.getBean(ArithmeticCalculator.class);
		//3. 使用 bean
		int result=atithmeticCalculator.add(1, 2);
		System.out.println("result = "+result);
		result=atithmeticCalculator.del(3, 2);
		System.out.println("result = "+result);
	}

}
