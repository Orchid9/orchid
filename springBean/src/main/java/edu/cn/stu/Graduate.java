package edu.cn.stu;

public class Graduate extends Student{

	private String degree;

	public String getDegree() {
		return degree;
	}

	@Override
	public String toString() {
		return "Graduate [degree=" + degree + "]";
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
}
