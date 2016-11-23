package com.cn.qdc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.util.ApplicationContextUtil;

public class test {
	public static void main(String[] args) {
		// User user=new User("Mr zhang");
		// user.sayHello();

		// 1. ac代表applicationContext容器
		// BeyService beyService=(BeyService) ac.getBean("beyService");
		// beyService.sayBey();
		
		// ApplicationContext 当我们实例化bean.xml,该文件配置的bean被实例化
		
		/**
		 * 1. 使用ClassPathXmlApplicationContext 通过类路径获取ApplicationContext对象,()中放的是相对路径。
		 * 2. 使用FileSystemXmlApplicationContext通过文件路径获取ApplicationContext对象,()中放的是绝对路径。
		 * 
		 */
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/cn/qdc/beans.xml");
		//ApplicationContext ac=new FileSystemXmlApplicationContext("E:\\javaee\\workspace\\springFirst\\src\\main\\java\\com\\cn\\qdc\\beans.xml");
		
		/**
		 * bean中scope 使用的是single,或者是prototype创建对象的个数
		 * 
		 */
		 //beans.xml中的scope 使用prototype 只创建一个对象。
		 User user1=(User)ac.getBean("user");
		 User user2=(User)ac.getBean("user");
		 System.out.println(user1+" "+user2);
		
		//beans.xml中的scope 使用single 只创建一个对象。
//		 BeyService beyService=(BeyService) ac.getBean("beyService");
//		 BeyService beyService2=(BeyService) ac.getBean("beyService");
//		 System.out.println(beyService+" "+beyService2);
		 
		 
		/**
		 * 利用接口获取bean
		 */
		 //	((User)ApplicationContextUtil.getApplicationContext().getBean("user")) .sayHello();
		 
		
		/**
		 * BeanFactory创建实例
		 * 
		 */

		// BeanFactory 获取getBean()是创建实例。取
		// BeanFactory beanFactory=new XmlBeanFactory(new
		// ClassPathResource("beans.xml"));
		// XmlBeanFactory(new ClassPathResource("beans.xml"))此方法已经被废弃。

		// 这个过程与XmlBeanFactory是一样的，不过XmlBeanFactory把XmlBeanDefinitionReader私有化
		/*ClassPathResource resource = new ClassPathResource("com/cn/qdc/beans.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		User user = (User) factory.getBean("user");
		user.sayHello();*/
		
	}
}
