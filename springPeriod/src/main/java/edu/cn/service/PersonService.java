package edu.cn.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sayHi(){
		System.out.println("hi "+name);
	}
	public PersonService(){
		super();
		System.out.println("PersonService构造函数被调用");
	}
	
	//该放过可以给arg0表示正在别实例化得bean id
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName 被调用值为 "+name);
	}
	//该方法可以传递beanFactory
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory "+beanFactory);
	}
	//该方法传递ApplicationContext
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext "+arg0);
	}
	
	public void init(){
		System.out.println("我自己定义的init()方法");
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet 被调用");
	}

	public void destroy() throws Exception {
		// 我们可以关闭数据连接，socket,文件流,释放该bean的资源。//这个与接口绑定了，可以不用，自己再写一个。
	}
	
	//定制我们的销毁方法。
	public void mydestroy(){
		System.out.println("释放各种资源");//这个话打印不出，容器已经被关闭
	}
	
}
