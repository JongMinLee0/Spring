package com.javalec.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCT.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Myinfo myinfo = ctx.getBean("myinfo", Myinfo.class);
		myinfo.getinfo();
		ctx.close();
	}
}
