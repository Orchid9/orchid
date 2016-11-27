package edu.cn.dispatch;

public class DBUtil {
	private String driver;
	private String username;
	private String url;
	private String password;
	@Override
	public String toString() {
		return "DBUtil [driver=" + driver + ", username=" + username + ", url=" + url + ", password=" + password + "]";
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
