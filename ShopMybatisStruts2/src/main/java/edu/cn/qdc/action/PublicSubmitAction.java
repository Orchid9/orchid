package edu.cn.qdc.action;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import edu.cn.qdc.Contents;
import edu.cn.qdc.GetDataInf;

public class PublicSubmitAction {
	
	private String title;// 标题
	private String summary; // 概要
	private String image;
	private String detail; // 正文
	private double price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String execute() {
		String resource = "conf.xml";
		InputStream is = PublicSubmitAction.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
			GetDataInf getContentInfo = session.getMapper(GetDataInf.class);
			getContentInfo.addContent(new Contents(price, title, image, summary, detail));
			System.out.println(new Contents(price, title, image, summary, detail));
			return "publicSubmitSuccess";
		} finally {
			session.close();
		}
	}
	
}
