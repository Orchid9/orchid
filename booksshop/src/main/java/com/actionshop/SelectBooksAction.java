package com.actionshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.impl.BaseDao;
import com.dao.impl.Books;
import com.opensymphony.xwork2.ActionContext;

public class SelectBooksAction {
	private String bookname;
	
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String execute(){
		String booknames="%"+bookname+"%";
		List<Books> lists=new ArrayList<Books>();
		String sql="select * from books where book_name like ?";
		BaseDao basedao=new BaseDao();
		lists=basedao.querylist(sql, booknames);
		ActionContext actioncontext=ActionContext.getContext();
		Map<String , Object> application=actioncontext.getApplication();
		application.put("booklist3", lists);
		return "dccx";
	}
	
	
}
