package com.actionshop;

import java.util.Map;

import com.dao.impl.BaseDao;
import com.dao.impl.Books;
import com.opensymphony.xwork2.ActionContext;

public class ItemAction {
	private String id;
	private String picture;
	private String price;
	private String bookname;
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	
	
	public String execute(){
		Books book=new Books();
		String sql="select * from books where book_id=?";
		BaseDao basedao=new BaseDao();
		book=basedao.querybook(sql, id);
		this.picture=book.getPicture();
		this.price=book.getPrice();
		this.setBookname(book.getName());
		return "item";
	}

}
