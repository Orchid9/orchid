package edu.cn.qdc;

import java.io.InputStream;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) {
		
		String resource="conf.xml";
		
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		
		Configuration conf=sessionFactory.getConfiguration();
		conf.addMapper(GetUserInfo.class);
		
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
	}
}
