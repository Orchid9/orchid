package com.actionshop;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.impl.ShopcarBean;
import com.opensymphony.xwork2.ActionContext;

public class GoAction {
	public String insert(){
		List<ShopcarBean> shopmap=null;
		shopmap=new ArrayList<ShopcarBean>();
		for(String key: ActionContext.getContext().getSession().keySet()){
			if(!key.equals("username")){
				shopmap.add((ShopcarBean) ActionContext.getContext().getSession().get(key));
			}
		}
		ActionContext actioncontext=ActionContext.getContext();
		Map<String , Object> application=actioncontext.getApplication();
		application.put("shopmap", shopmap);
		return "i";
	}
	public String delete(){
		ActionContext actioncontext=ActionContext.getContext();
		Map<String , Object> parameters=actioncontext.getParameters();
		String bookid=((String[]) parameters.get("bookid"))[0];
		ActionContext.getContext().getSession().remove(bookid);
		System.out.println(bookid);
		return "r";
	}
}
