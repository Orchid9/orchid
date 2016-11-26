package edu.cn.qdc.action;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionContext;

import edu.cn.qdc.GetDataInf;
import edu.cn.qdc.Trx;
import edu.cn.qdc.User;

public class AccountAction {
	
	private List<Trx> trx;
	private User user;
	private double sum=0;
	public String execute(){
		String resource = "conf.xml";
		InputStream is = EditSubmitAction.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
			GetDataInf getTrx = session.getMapper(GetDataInf.class);
			ActionContext actioncontext = ActionContext.getContext();
			Map<String, Object> sessionMap = actioncontext.getSession();
			String username=(String) sessionMap.get("username");
			if(username==null){
				return "pleaselogin";
			}else{
			user = getTrx.getUser(username);
			String s=String.valueOf(user.getUsertype());
			if(s.equals("1")){
				trx=(List<Trx>) getTrx.getTrx();
				//遍历求购物车总钱数
				for(Trx trx2:trx){
					double price=((Trx)trx2).getPrice();
					//或者double price=((Trx)trx2).getContents().getPrice();
					sum=price+sum;
				}
				System.out.println(sum);
				sessionMap.put("sum", sum);
				System.out.println("trx "+trx);
				sessionMap.put("trx", trx);
				return "accountSuccess";
			}else{
				return "accountError";
			}
			}
		} finally {
			session.close();
		}
	}
	
}
