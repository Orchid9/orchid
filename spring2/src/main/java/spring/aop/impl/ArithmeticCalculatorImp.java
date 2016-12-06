package spring.aop.impl;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImp implements ArithmeticCalculator{

	public int add(int i, int j) {
		int result=i+j;
		return result;
	}

	public int sub(int i, int j) {
		int result=i-j;
		return result;
	}

	public int mul(int i, int j) {
		int result=i*j;
		return result;
	}

	public int del(int i, int j) {
		int result=i/j;
		return result;
	}

}
