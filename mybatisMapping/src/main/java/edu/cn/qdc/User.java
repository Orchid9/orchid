package edu.cn.qdc;

public class User {
	private int id;
	private String username;
	private String corp;
	public User(int id, String username, String corp) {
		super();
		this.id = id;
		this.username = username;
		this.corp = corp;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", corp=" + corp + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCorp() {
		return corp;
	}
	public void setCorp(String corp) {
		this.corp = corp;
	}
	public User(String username, String corp) {
		super();
		this.username = username;
		this.corp = corp;
	}
}
