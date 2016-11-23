package com.inter;

public class UpperLetter implements ChangeLetter {

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String change() {
		// TODO Auto-generated method stub
		//将小写字母转化为大写字母
		str=str.toUpperCase();
		return str;
	}

}
