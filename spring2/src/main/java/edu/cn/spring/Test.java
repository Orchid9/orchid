package edu.cn.spring;

public class Test {
	public static void main(String[] args) {
//		AtithmeticCalculator arAtithmeticCalculator=null;
//		arAtithmeticCalculator=new AtithmeticCalculatorImp();
		
		AtithmeticCalculator target=new AtithmeticCalculatorImp();
		
		AtithmeticCalculator proxy=new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		int result=proxy.add(1, 2);
		System.out.println(result);
		System.out.println("-------------");
		
		int result2=proxy.del(2, 1);
		System.out.println(result2);
		System.out.println("-------------");
		
		int result3=proxy.mul(1, 2);
		System.out.println(result3);
		System.out.println("-------------");
		
		int result4=proxy.sub(1, 2);
		System.out.println(result4);
		System.out.println("-------------");
	}
}
