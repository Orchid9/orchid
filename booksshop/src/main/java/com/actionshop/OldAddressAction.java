package com.actionshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.impl.Address;
import com.dao.impl.BaseDao;
import com.dao.impl.Order;
import com.dao.impl.ShopcarBean;
import com.opensymphony.xwork2.ActionContext;


public class OldAddressAction {
	private String liveplace;
	private String addressid;
	
	
	public String getLiveplace() {
		return liveplace;
	}

	public void setLiveplace(String liveplace) {
		this.liveplace = liveplace;
	}

	public String getAddressid() {
		return addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}
	
	public String execute() {
		//获取用户名。
		Map<String ,Object> session=ActionContext.getContext().getSession();
		String username=(String) session.get("username");
		System.out.println(username+"username");
		BaseDao basedao = new BaseDao();
		//1.搜索shopcar中的数据。
		String sql1="select * from shopcar where account = ?";
		List<ShopcarBean> scb=new ArrayList<ShopcarBean>();
		scb=basedao.getShopcarBean(sql1, username);
		
		
		//2.搜索address中的数据。
		System.out.println("addressid is "+addressid);
		String sql2="select * from address where user_account = ? and address_id = ? ";
		List<Address> addr=new ArrayList<Address>();
		addr=basedao.queryAddress(sql2, username,addressid);
		
		//3.将数据插入order中。	
		for(ShopcarBean shopcar:scb){
			System.out.println(shopcar.getAccount()+"this is OldAddressAction.java 53 line");
			for(Address address:addr){
				//1)定义orderid,具有唯一性
				int r1=(int)(Math.random()*(10));
				int r2=(int)(Math.random()*(10));
				long now=System.currentTimeMillis();
				String orderid=String.valueOf(r1)+String.valueOf(r2)+String.valueOf(now);
				System.out.println(address.getUsername()+"this is OldAddressAction.java 60 line");
				String sql3="insert into `order`(order_id,user_account,telephone,user_address,user_postcode,book_number,book_id,book_name)values(?,?,?,?,?,?,?,?)";
				basedao.insert(sql3, orderid,username,address.getTelephone(),address.getLiveplace(),address.getPostcode(),shopcar.getBooknumber(),shopcar.getBookid(),shopcar.getBookname());
				
			}
		}
		String sql4="select * from `order` where user_account = ?";
		List<Order> order=new ArrayList<Order>();
		order=basedao.getOrder(sql4,username);
		System.out.println("this is OldAddress and the liene 72 "+order.size());
		ActionContext actioncontext=ActionContext.getContext();
		Map<String , Object> application=actioncontext.getApplication();
		application.put("order", order);
		System.out.println("7411111");
		String sql5="DELETE FROM shopcar WHERE account ='"+username+"'";
		basedao.update(sql5);
		//4.返回oldAdd,跳转到订单页面。
		return "oldAdd";
	}

	
}
