package com.yangdoll.aopex.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceTraceAdvice {
	
	// 어라운드 유형의 어드바이스를 적용하기 위해 만든 메서드 => 반드시 ProceedingJoinPoint 를 매개값으로 받아야 한다.
	public Object trace(ProceedingJoinPoint jp)throws Throwable   {
		// 선행작업 
		String executeMethodinfoString = jp.getSignature().toShortString();
		System.out.println(executeMethodinfoString+ "시작");
		long start = System.currentTimeMillis();
		
		// target객체의 메서드를 실행시키는 메서드 => 고정
		try {
			Object result = jp.proceed();
			return result;
		}finally {
			long finish = System.currentTimeMillis();
			System.out.println(executeMethodinfoString + "종료");
			long execTime = finish - start; // 최종 종료돠는 시간
			System.out.println(executeMethodinfoString + "실행 시간 : " + execTime + "ms");
		
	}
	}
}

