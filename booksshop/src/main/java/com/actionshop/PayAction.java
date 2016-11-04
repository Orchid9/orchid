package com.actionshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.impl.BaseDao;
import com.dao.impl.ShopcarBean;
import com.opensymphony.xwork2.ActionContext;

public class PayAction {
	
	public String execute(){
		//用户已确认付款，删除购物车数据。
		//1.删除用户为usename的用户购物车数据
		//1)获取用户名。
		Map<String ,Object> session=ActionContext.getContext().getSession();
		String username=(String) session.get("username");
		System.out.println(username+"username");
		//2)删除用户为usename的数据
		String sql1="DELETE FROM shopcar WHERE account ='"+username+"'";
		BaseDao basedao = new BaseDao();
		basedao.update(sql1);
		//2.客户付款成功,客户付款成功,返回paysuccess。
		return "success";
	}
}
