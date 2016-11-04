package com.actionshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.dao.impl.BaseDao;
import com.dao.impl.Books;
import com.opensymphony.xwork2.ActionContext;

public class IndexAction {
	

	public String execute(){
		List<Books> booklist1=null;
		List<Books> booklist2=null;
		booklist1=new ArrayList<Books>();
		booklist2=new ArrayList<Books>();
		String sql="select * from books where book_type=?";
		String sty1="青春";
		String sty2="教育";
		BaseDao basedao=new BaseDao();
		booklist1=basedao.querylist(sql, sty1);
		booklist2=basedao.querylist(sql, sty2); 
		ActionContext actioncontext=ActionContext.getContext();
		Map<String , Object> application=actioncontext.getApplication();
		application.put("booklist1", booklist1);
		application.put("booklist2", booklist2);
		System.out.println("this is IndexAction class and account is"+actioncontext.getSession().get("account"));
		return "index2";
	}
}
