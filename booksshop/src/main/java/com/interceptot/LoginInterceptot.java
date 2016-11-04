package com.interceptot;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptot extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map session=ActionContext.getContext().getSession();
        String username=(String) session.get("username");
        if(username != null){
        	return invocation.invoke();
        }
		return "login";
	}

}
