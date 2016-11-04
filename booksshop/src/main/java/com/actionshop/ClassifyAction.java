package com.actionshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.impl.BaseDao;
import com.dao.impl.Books;
import com.opensymphony.xwork2.ActionContext;

public class ClassifyAction {
	private String style;
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String execute(){
		int s=Integer.parseInt(style);
		String sty="";
		switch (s) {
		    case 1:	sty="教育";   break;
		    case 2:	sty="企业";   break;
		    case 3:	sty="科技";   break;
		    case 4:	sty="青春";   break;
		    case 5:	sty="建筑";   break;
		    case 6:	sty="育儿";   break;		    
		}
		List<Books> lists=new ArrayList<Books>();
		String sql="select * from books where book_type=?";
		BaseDao basedao=new BaseDao();
		lists=basedao.querylist(sql, sty);
		Map<String,Object> application=ActionContext.getContext().getApplication();
		application.put("booklist4", lists);
		System.out.println("lists size() 为"+lists.size());
		return "fenleicx";
	}
}
