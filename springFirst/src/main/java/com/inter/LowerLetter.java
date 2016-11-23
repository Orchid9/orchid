package com.inter;

public class LowerLetter implements ChangeLetter {
	
	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String change() {
		// TODO Auto-generated method stub
		str=str.toLowerCase();
		return str;
	}

}
