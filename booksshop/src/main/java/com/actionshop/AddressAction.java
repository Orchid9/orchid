package com.actionshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.impl.Address;
import com.dao.impl.BaseDao;
import com.opensymphony.xwork2.ActionContext;

public class AddressAction {
	
	public String execute(){
		Map<String ,Object> session=ActionContext.getContext().getSession();
        String username=(String) session.get("username");
        System.out.println(username+"this is 29 line it's AddressInterceptor.java");
		System.out.println("this is AddressInterceptor.java's intercept method and the line is 21");
		String sql = "select * from address where(user_account=?)";
		BaseDao basedao = new BaseDao();
		System.out.println(username+"username");
		boolean bo = basedao.query(sql, username);
		if (bo){
			List<Address> address = new ArrayList<Address>();
			address = basedao.queryAddress(sql, username);
			ActionContext actioncontext = ActionContext.getContext();
			Map<String, Object> application = actioncontext.getApplication();
			System.out.println("address.size() is111111 " + address.size());
			application.put("address", address);
			return "oldPlace";
		}else {
			return "newPlace";
		}

	}
}
