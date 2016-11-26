package edu.cn.qdc.action;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import edu.cn.qdc.GetDataInf;

public class DeleteContentsAvction {
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute(){

		String resource = "conf.xml";
		InputStream is = EditSubmitAction.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
			GetDataInf getContentInfo = session.getMapper(GetDataInf.class);
			getContentInfo.deleteContent(id);
			return "deleteSuccess";
		} finally {
			session.close();
		}
	}
}
