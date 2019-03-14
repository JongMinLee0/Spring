package com.javalec.ex4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCT3.xml");
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		
		ctx.close();
	}
}
