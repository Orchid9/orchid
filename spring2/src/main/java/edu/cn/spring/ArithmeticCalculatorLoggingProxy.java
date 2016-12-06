package edu.cn.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ArithmeticCalculatorLoggingProxy {
	
	//要代理的对象
	private AtithmeticCalculator target;
	 
	public ArithmeticCalculatorLoggingProxy(AtithmeticCalculator target) {
		this.target=target;
	}
	
	
	public AtithmeticCalculator getLoggingProxy(){
		AtithmeticCalculator proxy=null;
		
		//代理对象由哪一类加载器负责加载
		ClassLoader loader=target.getClass().getClassLoader();
		//代理对象的类型，即其中有哪些方法
		Class[] interfaces=new Class[]{AtithmeticCalculator.class};
		//当调用代理对象其中的方法时，该执行的代码
		InvocationHandler invocationHandler=new InvocationHandler() {
			/**
			 * proxy:正在返回的那个代理对象，一般情况下，在invoke 方法中都不使用该对象。
			 * method:正在被调用的方法
			 * args: 调用方法时，传入的参数
			 */
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				String methodName=method.getName();
				//日志
				System.out.println("the method is "+methodName+"ArithmeticCalculatorLoggingProxy getLoggingProxy invoke...");
				//执行方法
				Object result=method.invoke(target, args);
				//日志
				System.out.println("the method "+methodName+" end with "+result);
				return 0;
			}
		};
		proxy=(AtithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, invocationHandler);
		
		return proxy;
	}
	
}
