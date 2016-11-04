package com.actionshop;
import java.util.Map;

import com.dao.impl.BaseDao;
import com.dao.impl.UserDao;
import com.dao.impl.Users;
import com.opensymphony.xwork2.ActionContext;
public class loginAction{
	private BaseDao basedao=new BaseDao();
	private String username;
	private String password;
	private Map session;
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
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public String execute(){
		System.out.println("login登录用户为"+username);
		String sql="select * from users where(user_account=? and user_password=?)";
		 boolean b=basedao.query(sql, username,password);
		 if(b){
			 session=(Map) ActionContext.getContext().getSession().put("username", username);//此处将username进行传递。
			 CarAction caraction=new CarAction();
			 caraction.insertcu();
			 return "index";
		 }
		 else{
			 return "login";
		 }
	}
}