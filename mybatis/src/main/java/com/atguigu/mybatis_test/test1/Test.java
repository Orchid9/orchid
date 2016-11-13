package com.atguigu.mybatis_test.test1;

import java.io.InputStream; 
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder; 
public class Test {

	public static void main(String[] args) {
		//1. 声明配置⽂文件的⺫⽬目录渎职
				String resource = "conf.xml";
				//2. 加载应⽤用配置⽂文件
				InputStream is = Test.class.getClassLoader()
				.getResourceAsStream(resource);
				// 3. 创建SqlSessonFactory
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
				.build(is);
				// 4. 获取Session
				SqlSession session = sessionFactory.openSession();
				
				String statement = "com.atguigu.mybatis_test.test1.userMapper.getUser";
				User user=session.selectOne(statement, 1);
				System.out.println(user);
				
	}

}
