package edu.cn.qdc.action;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionContext;

import edu.cn.qdc.GetDataInf;
import edu.cn.qdc.User;

public class PublicAction {

	
	public String execute(){
		String resource = "conf.xml";
		InputStream is = PublicSubmitAction.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
			
			Map<String ,Object> sessionMap=ActionContext.getContext().getSession();
			String username=(String) sessionMap.get("username");
			GetDataInf getContentInfo = session.getMapper(GetDataInf.class);
			User user=null;
			user = getContentInfo.getUser(username);
			System.out.println(user);
			if(user==null){
				return "pleaselogin";
			}else{
			String s=String.valueOf(user.getUsertype());
			if(s.equals("1")){
				return "publicSuccess";
			}else {
				return "publicError";
			}
			}
		} finally {
			session.close();
		}
	}
	
}
