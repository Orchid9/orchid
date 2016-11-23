package com.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/inter/beans.xml");
//		LowerLetter lowerLetter= (LowerLetter) ac.getBean("lowerLetter");
//		System.out.println(lowerLetter.change());
//		UpperLetter upperLetter=(UpperLetter) ac.getBean("upperLetter");
//		System.out.println(upperLetter.change());
		ChangeLetter changeLetter=(ChangeLetter) ac.getBean("lowerLetter");
		System.out.println(changeLetter.change());
		ChangeLetter changeLetter2=(ChangeLetter) ac.getBean("upperLetter");
		System.out.println(changeLetter2.change());
		
	}
	
}
