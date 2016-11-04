package com.actionshop;

import java.util.Map;

import com.dao.impl.BaseDao;
import com.dao.impl.ShopcarBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class CarAction implements ModelDriven<ShopcarBean>{
	private ShopcarBean shopcar;
	private static Map<String, Object> sessionMap = ActionContext.getContext().getSession();
	@Override
	public ShopcarBean getModel() {
		if(shopcar==null){
			shopcar=new ShopcarBean();
		}
		return shopcar;
	}
	public void setShopcar(ShopcarBean shopcar) {
		this.shopcar = shopcar;
	}
	public ShopcarBean getShopcar() {
		return shopcar;
	}
	
	public String insert() {
		System.out.println(sessionMap.keySet());
		System.out.println(sessionMap.size());
		if(sessionMap.size()!=0){
		for(String id : sessionMap.keySet()){
			System.out.println("56");
			if(id.equals(shopcar.getBookid())){
				ShopcarBean shopcars=(ShopcarBean)sessionMap.get(shopcar.getBookid());
				sessionMap.remove(shopcar.getBookid());
				shopcars.setBooknumber(shopcar.getBooknumber());
				sessionMap.put(shopcar.getBookid(), shopcars);
				System.out.println("57");
				System.out.println(sessionMap.size());
			}else{
				sessionMap.put(shopcar.getBookid(), shopcar);		
				System.out.println("58");
				System.out.println(sessionMap.size());
			}
		}
		}else{
			sessionMap.put(shopcar.getBookid(), shopcar);
		}
		System.out.println(sessionMap.size());
		
		return "insert"; 
	}


	public String insertcu(){
		Map<String , Object> sessionmap=ActionContext.getContext().getSession();
		BaseDao basedao = new BaseDao();
		String sql1="select * from shopcar where account=? and book_id=?";
		for(String key: sessionmap.keySet()){
			if(!key.equals("username")){
				if(basedao.query(sql1,sessionmap.get("username"),key)){
					System.out.println("11");
					ShopcarBean shopcar=(ShopcarBean) sessionmap.get(key);
					System.out.println("22");
					String sql = "update shopcar set book_number = ? where account=? and book_id=? ";
					System.out.println("33");
					basedao.insert(sql,shopcar.getBooknumber(),sessionmap.get("username"),shopcar.getBookid());
					System.out.println("44");
					System.out.println("书的数量"+shopcar.getBooknumber());
					System.out.println("55");
					System.out.println("66");
				}else{
					ShopcarBean shopcar=(ShopcarBean) sessionmap.get(key);
					System.out.println(sessionmap.get("username")+"this is 73 line");
					String sql2="insert into shopcar(account,book_id,book_number,book_picture,book_price,book_name)values('"+sessionmap.get("username")+"','"+shopcar.getBookid()+"','"+shopcar.getBooknumber()+"','"+shopcar.getBookpicture()+"','"+shopcar.getBookprice()+"','"+shopcar.getBookname()+"')";
					System.out.println(sessionmap.get("username")+"this is 73 line");
					basedao.insert(sql2);
					System.out.println(sessionmap.get("username")+"this is 73 line");
				}	
			}
		}
		return "insert";
	}
	
}