package com.aop.ex1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		String signatureStr = joinpoint.getSignature().toShortString(); // method이름 가져오기.
		System.out.println(signatureStr + " is start");
		long st = System.currentTimeMillis(); // method가 시작됬다.(공통기능)
		
		try {
			Object obj = joinpoint.proceed(); //핵심기능 실행(proxy)
			return obj;
		}finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished");
			System.out.println(signatureStr + " 경과시간 : "+ (et-st));
		}
	}
}
