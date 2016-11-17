package edu.cn.qdc;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) {
		method1();
		
	}
	
	//the first method
	private static void method1() {
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			CourseInf courseinf = session.getMapper(CourseInf.class);
			Course course = courseinf.getCourse("o");
			System.out.println(course);
		} finally {
			session.close();
		}
	}
	private static void method2() {
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			String name="o";
			CourseInf courseinf = session.getMapper(CourseInf.class);
			Course course = courseinf.getCourse("%"+name+"%");
			System.out.println(course);
		} finally {
			session.close();
		}
	}
	
}
