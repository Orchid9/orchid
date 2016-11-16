package edu.cn.qdc;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) {
		
		testSelect();
		/*testAdd();*/
		/*testUpdate();*/
		/*testDelete();*/
		/*testAll();*/

	}
	
	public static void testSelect(){
		
		//1. the first method
		
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession();
		try {
			GetUserInfo getUserInfo=session.getMapper(GetUserInfo.class);
			User user=getUserInfo.getUser(1);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		//2. the second method
		
		/*String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			String statement = "edu.cn.qdc.getUser";
			User user = session.selectOne(statement, 1);
			System.out.println(user);
		} finally {
			session.close();
		}*/
	}
	
	
	public static void testAdd(){
		
		//1. the first method
		
		/*String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			GetUserInfo getUserInfo = session.getMapper(GetUserInfo.class);
			User user = new User("hange", "123");
			getUserInfo.addUser(user);
			System.out.println(user);
		} finally {
			session.close();
		}*/
		
		//2. the second method
		
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			String statement = "edu.cn.qdc.addUser";
			User user = new User("hange", "123");
			int ins=session.insert(statement, user);
			System.out.println(ins);
		} finally {
			session.close();
		}
	}
		
	
	public static void testUpdate(){
		
		//1. the first method
		
		/*String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			GetUserInfo getUserInfo = session.getMapper(GetUserInfo.class);
			User user = getUserInfo.getUser(2);
			System.out.println(user);
			user.setUsername("shiwode");
			getUserInfo.updateUser(user);
			System.out.println(user);
		} finally {
			session.close();
		}*/
		
		//2. the second method
		
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			String statement = "edu.cn.qdc.getUser";
			User user = session.selectOne(statement, 2);
			System.out.println(user);
			String statement2="edu.cn.qdc.updateUser";
			user.setUsername("shiwode");
			System.out.println(user);
			int upd=session.update(statement2, user);
			System.out.println(upd);
		} finally {
			session.close();
		}
	}
	
	public static void testDelete(){
		
		//1. the first method
		
		/*String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			GetUserInfo getUserInfo = session.getMapper(GetUserInfo.class);
			int del = getUserInfo.deleteUser(11);
			System.out.println(del);
		} finally {
			session.close();
		}*/
		
		//2. the second method
		
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			String statement = "edu.cn.qdc.deleteUser";
			int upd=session.delete(statement, 2);
			System.out.println(upd);
		} finally {
			session.close();
		}
		
		
	}
	
	public static void testAll(){
		
		//1. the first method
		
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		GetUserInfo getUserInfo=session.getMapper(GetUserInfo.class);
		List<User> user = getUserInfo.getAll();
		System.out.println(user);
		
		//2. the second method
		
		/*String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			String statement = "edu.cn.qdc.getAll";
			List<User> user=session.selectList(statement);
			System.out.println(user);
		} finally {
			session.close();
		}*/
	}
}
