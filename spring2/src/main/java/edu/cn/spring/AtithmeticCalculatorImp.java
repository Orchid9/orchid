package edu.cn.spring;

public class AtithmeticCalculatorImp implements AtithmeticCalculator{

	public int add(int i, int j) {
//		System.out.println("the method add begins with["+i+","+j+"]");
		int result=i+j;
//		System.out.println("the method add end with["+result+"]");
		return result;
	}

	public int sub(int i, int j) {
//		System.out.println("the method sub with["+i+","+j+"]");
		int result=i-j;
//		System.out.println("the method sub end with["+result+"]");
		return result;
	}

	public int mul(int i, int j) {
//		System.out.println("the method mul begins with["+i+","+j+"]");
		int result=i*j;
//		System.out.println("the method mul end with["+result+"]");
		return result;
	}

	public int del(int i, int j) {
//		System.out.println("the method del begins with["+i+","+j+"]");
		int result=i/j;
//		System.out.println("the method del end with["+result+"]");
		return result;
	}

}
