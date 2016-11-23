package edu.cn.service;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("edu/cn/service/beans.xml");
		PersonService personService=(PersonService) ac.getBean("personService");
		personService.sayHi();
		
		//通过beanFactory的运行周期。
		/*ClassPathResource resource = new ClassPathResource("edu/cn/service/beans.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		PersonService personService=(PersonService) factory.getBean("personService");
		personService.sayHi();*/
		
	}
	
}
