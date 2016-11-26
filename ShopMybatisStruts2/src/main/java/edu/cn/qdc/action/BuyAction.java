package edu.cn.qdc.action;

import java.io.InputStream;
import java.util.Date;
import java.util.Map;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionContext;

import edu.cn.qdc.Contents;
import edu.cn.qdc.GetDataInf;
import edu.cn.qdc.Trx;
import edu.cn.qdc.User;

public class BuyAction {
	private User user;
	private Contents content;
	private Trx trx;
	public String execute(){
		String resource = "conf.xml";
		InputStream is = EditSubmitAction.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
			GetDataInf getTrx = session.getMapper(GetDataInf.class);
			ActionContext actioncontext = ActionContext.getContext();
			Map<String, Object> application = actioncontext.getApplication();
			Map<String, Object> sessionMap = actioncontext.getSession();
			content=(Contents) application.get("content");
			String username=(String) sessionMap.get("username");
			if(username==null){
				return "pleaselogin";
			}else{
			user = getTrx.getUser(username);
			String s=String.valueOf(user.getUsertype());
			if(!s.equals("1")){
				trx=new Trx(content.getId(),(int) sessionMap.get("userid") , content.getPrice(), new Date());
				getTrx.addTrx(trx);
				return "buySuccess";
			}else{
				return "buyError";
			}
			}
		} finally {
			session.close();
		}
	}
	
}
