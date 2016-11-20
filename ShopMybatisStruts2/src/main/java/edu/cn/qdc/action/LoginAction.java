package edu.cn.qdc.action;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionContext;

import edu.cn.qdc.GetDataInf;
import edu.cn.qdc.User;

public class LoginAction {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		
		String resource="conf.xml";
		InputStream is=LoginAction.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession(true);
		try {
			GetDataInf userInfo = session.getMapper(GetDataInf.class);
			User user=null;
			user = userInfo.getUser(username,password);
			System.out.println(user);
			boolean b=user != null;
			if(b){
				//将验证已经存在的用户username的值赋给sessionMap,作为全局session
				Map<String,Object> sessionMap=(Map) ActionContext.getContext().getSession();
				sessionMap.clear();
				sessionMap.put("username", user.getUsername());
				return "querysuccess";
			}else {
				return "queryerror";
			}
		} finally {
			session.close();
		}
	}
}
