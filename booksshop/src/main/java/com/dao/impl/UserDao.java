package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.*;

public class UserDao {
	
	public int getPage(){
		int recordCount=0,t1=0,t2=0;
		PreparedStatement pstmt=null;
		ResultSet result=null;
		JDBCUtil jdbc=new JDBCUtil();
		Connection conn=jdbc.getConnection();
		String sql="select count(*) from books";
		try {
			pstmt=conn.prepareStatement(sql);
			result=pstmt.executeQuery();
			result.next();
			recordCount=result.getInt(1);
			t1=recordCount%12;
			t2=recordCount/12;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			jdbc.close(conn, pstmt, result);
		}
		if(t1 != 0){
			t2=t2+1;
		}
		
		return t2;
	}
	
	
	public List<Books> listUser(int pageNo){
		PreparedStatement pstmt=null;
		ResultSet result=null;
		List<Books> list=new ArrayList<Books>();
		int pageSize=12;//
		int page=(pageNo-1)*12;
		BaseDao basedao=new BaseDao();
		String sql="select * from books order by book_id limit ?,?";
		list=basedao.querylist(sql, page,pageSize);
		return list;
	}

}
