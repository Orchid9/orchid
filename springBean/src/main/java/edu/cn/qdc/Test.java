package edu.cn.qdc;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("edu/cn/qdc/beans.xml");
		Department department=(Department) ac.getBean("department");
		System.out.println(department.getName());
		//遍历去除empName
		System.out.println("遍历取出empName");
		for(String  empName:department.getEmpName()){
			System.out.println(empName);
		}
		
		System.out.println("通过list集合取出数据，有顺序，允许重复对象");
		//通过list集合取出数据，有顺序
		for(Employee employeelist:department.getEmployeelist()){
			System.out.println(employeelist.getId()+" "+employeelist.getName());
		}
		
		System.out.println("通过set集合去除数据,无顺序，对象重复覆盖");
		//通过set集合取出数据,无顺序
		for(Employee employeeset:department.getEmployeeset()){
			System.out.println(employeeset.getId()+" "+employeeset.getName());
		}
		
		//通过map集合取出数据
		//(1). 简单方法
		System.out.println("通过map集合取出数据，简单方法");
		for(Entry<String,Employee> entry1:department.getEmployeemap().entrySet()){
			System.out.println(entry1.getKey()+" "+entry1.getValue().getName());
		}
		
		//(2). 迭代器
		System.out.println("通过map集合取出数据，迭代器");
		Map<String,Employee> employeemap=department.getEmployeemap();
		Iterator it=employeemap.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Employee empmap=employeemap.get(key);
			System.out.println(key+" "+empmap.getName()+" "+empmap.getId());
		}
		
		//通过Properties取出数据
		System.out.println("通过Properties取出数据");
		Properties pp=department.getPp();
//		System.out.println(pp.get("pp2").toString());
		for(Entry<Object, Object> entry:pp.entrySet()){
			System.out.println(entry.getKey().toString()+" "+entry.getValue().toString());
		}
		
		//通过枚举Enumeration取出
		System.out.println("通过枚举Enumeration取出");
		Enumeration en=pp.keys();
		while(en.hasMoreElements()){
			String key=(String) en.nextElement();
			pp.keySet();
			System.out.println(pp.getProperty(key)+key);
		}
	}
}
