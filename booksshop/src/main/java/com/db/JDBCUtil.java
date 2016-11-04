package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rest;
	
	/**
	 * jdbc 建立数据库的连接
	 * @return
	 */
	public Connection getConnection(){
		String driverName="com.mysql.jdbc.Driver";
		String userName="root";
		String userPwd="1234";
		String dbName="bookshopping";
		String url1="jdbc:mysql://localhost:3306/"+dbName;
		String url2="?user="+userName+"&password="+userPwd;
		String url3="&useUnicode=true&characterEncoding=utf-8";
		String url=url1+url2+url3;
		
		try {
			Class.forName(driverName);
			conn=DriverManager.getConnection(url);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * close 关闭数据库
	 * @param conn
	 * @param pstmt
	 * @param rest 
	 */
	public void close(Connection conn,PreparedStatement pstmt,ResultSet rest){
		if(rest != null){
			try {
				rest.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
