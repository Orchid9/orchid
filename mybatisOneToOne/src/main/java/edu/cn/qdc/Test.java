package edu.cn.qdc;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) {
		/*test1();*/
		/*test2();*/
	}
	// 1. the first method
	private static void test1() {
		// TODO Auto-generated method stub
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			String statement = "edu.cn.qdc.getCourse";
			Course user = session.selectOne(statement, 1);
			System.out.println(user);
		} finally {
			session.close();
		}
	}
	// 1. the second method
	private static void test2() {
		// TODO Auto-generated method stub
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			UserInfo userInfo = session.getMapper(UserInfo.class);
			Course course = userInfo.getCourse(1);
			System.out.println(course);
		} finally {
			session.close();
		}
	}
}
