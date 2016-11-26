package edu.cn.qdc.action;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionContext;

import edu.cn.qdc.Contents;
import edu.cn.qdc.GetDataInf;

public class getContentsAvction {

	public String execute() {
		String resource = "conf.xml";
		InputStream is = EditSubmitAction.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
			GetDataInf getContents = session.getMapper(GetDataInf.class);
			List<Contents> contents = (List<Contents>) getContents.getContents();
			System.out.println(contents);

			ActionContext actioncontext = ActionContext.getContext();
			Map<String, Object> application = actioncontext.getApplication();
			application.put("contents", contents);
			return "getContentsAvctionSuccess";
		} finally {
			session.close();
		}
	}
}