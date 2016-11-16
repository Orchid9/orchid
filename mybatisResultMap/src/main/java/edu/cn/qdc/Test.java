package edu.cn.qdc;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) {
		/*String resource = "conf.xml";
		InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
		UserInfo userOp = session.getMapper(UserInfo.class);
		User user = userOp.getUser(1);
		System.out.println(user.getId() + " " + user.getUsername() + " ");
		System.out.println(user.getCourses().get(0).getCoursename() + " ");
		System.out.println(user.getCourse().get(0).getTeacher().getTeachername());
		} finally {
		session.close();
		}*/
		
		String resource="conf.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession();
		try {
			UserInfo getUserInfo=session.getMapper(UserInfo.class);
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
