package edu.cn.qdc;

public interface GetDataInf {

	public User getUser(String username,String password);

	public User getUser(String username);
	
	public void addContent(Contents content);
	
	public void updateContent(Contents content);
	
}
