package com.javalec.ex3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationcCT2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		StudentInfo studentinfo = ctx.getBean("studentinfo",StudentInfo.class);
		studentinfo.getStudentInfo();
		
		Student student2 = ctx.getBean("student2", Student.class);
		studentinfo.setStudent(student2);
		studentinfo.getStudentInfo();
		
		ctx.close();
	}
}
