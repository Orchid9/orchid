package edu.cn.qdc;

import java.util.List;

public interface GetUserInfo {
	
	public User getUser(int id);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public int deleteUser(int id);
	
	public List<User> getAll();
	
}
