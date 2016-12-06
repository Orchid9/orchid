package com.atguigu.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorLoggingProxy {
	
	//Ҫ����Ķ���
	private ArithmeticCalculator target;
	
	public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
		super();
		this.target = target;
	}

	//���ش������
	public ArithmeticCalculator getLoggingProxy(){
		ArithmeticCalculator proxy = null;
		
		ClassLoader loader = target.getClass().getClassLoader();
		Class [] interfaces = new Class[]{ArithmeticCalculator.class};
		InvocationHandler h = new InvocationHandler() {
			/**
			 * proxy: ������� һ�㲻ʹ�øö���
			 * method: ���ڱ����õķ���
			 * args: ���÷�������Ĳ���
			 */
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				String methodName = method.getName();
				//��ӡ��־
				System.out.println("[before] The method " + methodName + " begins with " + Arrays.asList(args));
				
				//����Ŀ�귽��
				Object result = null;
				
				try {
					//ǰ��֪ͨ
					result = method.invoke(target, args);
					//����֪ͨ, ���Է��ʵ������ķ���ֵ
				} catch (NullPointerException e) {
					e.printStackTrace();
					//�쳣֪ͨ, ���Է��ʵ��������ֵ��쳣
				}
				
				//����֪ͨ. ��Ϊ���������ܻ���쳣, ���Է��ʲ��������ķ���ֵ
				
				//��ӡ��־
				System.out.println("[after] The method ends with " + result);
				
				return result;
			}
		};
		
		/**
		 * loader: �������ʹ�õ���������� 
		 * interfaces: ָ��������������. �������������п�������Щ����. 
		 * h: ��������ô������ķ���ʱ, Ӧ����ν�����Ӧ, ʵ���Ͼ��ǵ��� InvocationHandler �� invoke ����
		 */
		proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		
		return proxy;
	}
}
