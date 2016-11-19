package edu.cn.qdc;

public class User {
	private int id;
	private String username;
	private String password;
	private String nickname;
	private short usertype;
	public User(int id, String username, String password, String nickname, short usertype) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.usertype = usertype;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", usertype=" + usertype + "]";
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public short getUsertype() {
		return usertype;
	}
	public void setUsertype(short usertype) {
		this.usertype = usertype;
	}
	
}
