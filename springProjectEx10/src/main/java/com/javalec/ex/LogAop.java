package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	// 공통 기능으로 사용 할 클래스
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString(); // 어떤 메서드인지 보기 쉽게 로그찍기.
		System.out.println(signatureStr + " is start.");
		long st = System.currentTimeMillis(); // 공통기능.

		try {
			Object obj = joinpoint.proceed(); // joinpoint - 실제 핵심기능. 실제 핵심기능 실행.
			return obj;
		} finally { // exception이 나던 안나던 무조건 들어옴.
			long et = System.currentTimeMillis(); // 공통기능. 
			System.out.println(signatureStr + "is finished."); 
			System.out.println(signatureStr + " 경과시간 : " + (et - st)); 
		}
	}
}
