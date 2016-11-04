package com.actionshop;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.impl.Books;
import com.dao.impl.UserDao;
import com.opensymphony.xwork2.ActionContext;

public class SelectAllBooksAction {
	private String pageNos;
	private List<Books> books;
	
	public String getPageNos() {
		return pageNos;
	}

	public void setPageNos(String pageNos) {
		this.pageNos = pageNos;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}
	
	public String execute(){
		int pageNo = 1;
		UserDao userdao=new UserDao();
		List<Books> lists=new ArrayList<Books>();
		if(pageNos != null){
			pageNo=Integer.parseInt(pageNos);
		}
		lists=userdao.listUser(pageNo);
		Map<String, Object> application=(Map<String, Object>) ActionContext.getContext().getApplication();
		application.put("recordCount", userdao.getPage());
		System.out.println(userdao.getPage());
		application.put("listss", lists);
		application.put("pageNos", pageNo);
		return "execute";
	}

	
}
