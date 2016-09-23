package edu.cn;

public class loginAction {
	private String username;
	private String password;
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
	public String execute(){
		String str=null;
		if("admin".equals(username)&&(password).equals("123456")){
			str="success";
			return str;
		}else {
			str="error";
			return str;
		}
	}
}
