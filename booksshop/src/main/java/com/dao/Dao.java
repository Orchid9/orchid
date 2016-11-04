package com.dao;

import java.sql.ResultSet;
import java.util.List;

import com.dao.impl.Books;
import com.dao.impl.ShopcarBean;


public interface Dao<T> {
	
	
	void insert(String sql, Object ... args);
	
	boolean  query(String sql, Object ... args);
	
	List<Books> querylist(String sql,Object ... args);
	
	Books querybook(String sql, Object ... args);
	
	List<ShopcarBean> getShopcarBean(String sql,Object... args);
	
}


