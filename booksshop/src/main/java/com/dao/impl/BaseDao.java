package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Dao;
import com.db.JDBCUtil;
import com.actionshop.CarAction;
import com.dao.impl.ShopcarBean;

public class BaseDao implements Dao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rest = null;

	@Override
	public void insert(String sql, Object... args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		JDBCUtil jdbc = new JDBCUtil();
		conn = jdbc.getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			jdbc.close(conn, pstmt, null);
		}
	}

	@Override
	public boolean query(String sql, Object... args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rest = null;
		JDBCUtil jdbc = new JDBCUtil();
		conn = jdbc.getConnection();
		boolean f = false;
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			rest = pstmt.executeQuery();
			if (rest.next()) {
				f = true;
			} else {
				f = false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			jdbc.close(conn, pstmt, null);
		}
		return f;
	}

	public List<ShopcarBean> getShopcarBean(String sql, Object... args) {
		JDBCUtil jdbc = new JDBCUtil();
		conn = jdbc.getConnection();
		List<ShopcarBean> shopcarbean = new ArrayList<ShopcarBean>();
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			rest = pstmt.executeQuery();
			while (rest.next()) {
				ShopcarBean scb = new ShopcarBean();
				scb.setAccount(rest.getString(1));
				scb.setBookid(rest.getString(2));
				scb.setBooknumber(rest.getString(5));
				scb.setBookname(rest.getString(6));
				shopcarbean.add(scb);
			}
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("this is Base.java's getShopcarBean method is error");
		}
		jdbc.close(conn, pstmt, rest);
		return shopcarbean;
	}

	
	@Override
	public List<Books> querylist(String sql, Object... args) {
		// TODO Auto-generated method stub
		List<Books> list = new ArrayList<Books>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rest = null;
		JDBCUtil jdbc = new JDBCUtil();
		conn = jdbc.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			rest = pstmt.executeQuery();
			while (rest.next()) {
				Books book = new Books();
				book.setId(rest.getString(1));
				book.setName(rest.getString(2));
				book.setPrice(rest.getString(3));
				book.setPicture(rest.getString(4));
				book.setShoper(rest.getString(5));
				book.setSummary(rest.getString(6));
				book.setSale(rest.getString(7));
				book.setType(rest.getString(8));
				list.add(book);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			jdbc.close(conn, pstmt, rest);
		}
		return list;
	}

	@Override
	public Books querybook(String sql, Object... args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rest = null;
		JDBCUtil jdbc = new JDBCUtil();
		conn = jdbc.getConnection();
		Books book = new Books();
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			rest = pstmt.executeQuery();
			while (rest.next()) {
				book.setId(rest.getString(1));
				book.setName(rest.getString(2));
				book.setPrice(rest.getString(3));
				book.setPicture(rest.getString(4));
				book.setShoper(rest.getString(5));
				book.setSummary(rest.getString(6));
				book.setSale(rest.getString(7));
				book.setType(rest.getString(8));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			jdbc.close(conn, pstmt, rest);
		}
		return book;
	}
	public List<Address> queryAddress(String sql, Object... args) {
		List<Address> list = new ArrayList<Address>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rest = null;
		JDBCUtil jdbc = new JDBCUtil();
		conn = jdbc.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			rest = pstmt.executeQuery();
			while (rest.next()) {
				Address address=new Address();
				address.setUsername(rest.getString(1));
				address.setTelephone(rest.getString(2));
				address.setPostcode(rest.getString(3));
				address.setLiveplace(rest.getString(4));
				address.setAddressid(rest.getString(5));
				list.add(address);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("this is BaseDao's method is <list> error 192");
		} finally {
			jdbc.close(conn, pstmt, rest);
		}
		return list;
	}

	public List<Order> getOrder(String sql, Object... args) {
		List<Order> list = new ArrayList<Order>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rest = null;
		JDBCUtil jdbc = new JDBCUtil();
		conn = jdbc.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			rest = pstmt.executeQuery();
			while (rest.next()) {
				Order order=new Order();
				order.setOrderid(rest.getString(1));
				order.setUsername(rest.getString(2));
				order.setTelephone(rest.getString(3));
				order.setAddress(rest.getString(4));
				order.setPostcode(rest.getString(5));
				order.setBooknumber(rest.getString(6));
				order.setBookid(rest.getString(7));
				order.setBookname(rest.getString(8));
				list.add(order);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("this is BaseDao's method is <list> error 227");
		} finally {
			jdbc.close(conn, pstmt, rest);
		}
		return list;
	}
	public void update(String sql) {
		JDBCUtil jdbc = new JDBCUtil();
		conn = jdbc.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO 鑷姩鐢熸垚鐨�catch 鍧�
			e.printStackTrace();
			System.out.println("haha");
		}
		jdbc.close(conn, pstmt, rest);
	}
}
