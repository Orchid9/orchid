package edu.cn.qdc.action;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionContext;

import edu.cn.qdc.Contents;
import edu.cn.qdc.GetDataInf;

public class ShowAction {
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute(){
		String resource = "conf.xml";
		InputStream is = EditSubmitAction.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);

		try {
			GetDataInf getContents = session.getMapper(GetDataInf.class);
			Contents content = (Contents) getContents.getContent(id);
			
			ActionContext actioncontext = ActionContext.getContext();
			/*ValueStack valueStack = actioncontext.getValueStack();
			valueStack.push(content);*/
			Map<String, Object> application = actioncontext.getApplication();
			application.remove("content");
			application.put("content", content);
			return "ShowActionSuccess";

		} finally {
			session.close();
		}
	}
	
}
