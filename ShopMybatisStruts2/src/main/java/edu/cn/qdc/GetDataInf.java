package edu.cn.qdc;

import java.util.List;

public interface GetDataInf {

	public User getUser(String username,String password);

	public User getUser(String username);
	
	public List<Contents> getContents();
	
	public void addContent(Contents content);
	
	public void updateContent(Contents content);
	
	public void deleteContent(int id);
	
	public Contents getContent(int id);
	
	public void addTrx(Trx trx);
	
	public List<Trx> getTrx();
	
	
}
