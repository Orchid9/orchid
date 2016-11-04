package com.actionshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.dao.impl.BaseDao;
import com.dao.impl.Order;
import com.dao.impl.ShopcarBean;
import com.opensymphony.xwork2.ActionContext;

public class DizhiAction {
	private String tel;
	private String pos;
	private String adr;
	private String addressid;
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getAddressid() {
		return addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}

	public String execute() {
		Map<String ,Object> session=ActionContext.getContext().getSession();
		String username=(String) session.get("username");
		BaseDao basedao = new BaseDao();
		System.out.println(username+"username");
		System.out.println("this is DizhiAction and the line is 51");
		String sql = "insert into address(user_account,address_telephone,address_postcode,address_live,address_id)values(?,?,?,?,?)";
		System.out.println("this is DizhiAction and the line is 53");
		basedao.insert(sql, username, tel, pos, adr,addressid);
		System.out.println("this is DizhiAction and the line is 53");
		// 3.搜索shopcar中的数据。
		String sql1="select * from shopcar where account = ?";
		List<ShopcarBean> scb=new ArrayList<ShopcarBean>();
		scb=basedao.getShopcarBean(sql1, username);
		// 4.将数据插入order中。
				for(ShopcarBean shopcar:scb){
					System.out.println(shopcar.getAccount()+"this is OldAddressAction.java 53 line");
						//1)定义orderid,具有唯一性
						int r1=(int)(Math.random()*(10));
						int r2=(int)(Math.random()*(10));
						long now=System.currentTimeMillis();
						String orderid=String.valueOf(r1)+String.valueOf(r2)+String.valueOf(now);
						String sql3="insert into `order`(order_id,user_account,telephone,user_address,user_postcode,book_number,book_id,book_name)values(?,?,?,?,?,?,?,?)";
						basedao.insert(sql3, orderid,username,tel,adr,pos,shopcar.getBooknumber(),shopcar.getBookid(),shopcar.getBookname());
					}

		//5.查询订单中的数据。
		String sql4="select * from order where user_account = ?";
		List<Order> order=new ArrayList<Order>();
		order=basedao.getOrder(sql4,username);
		ActionContext actioncontext=ActionContext.getContext();
		Map<String , Object> application=actioncontext.getApplication();
		application.put("order", order);
		// 6.返回newAdd,跳转到订单页面
		return "newAdd";
	}

	
}
