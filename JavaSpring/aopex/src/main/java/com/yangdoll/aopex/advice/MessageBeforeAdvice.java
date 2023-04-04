package com.yangdoll.aopex.advice;

import org.springframework.stereotype.Component;

@Component("messageBeforeAdvice")
public class MessageBeforeAdvice {
	public void beforeMessage() {
		System.out.println("조회 작업을 실행할 때 나타나는 before 어드바이스 Message!!!");
	
	}
	public void afterMessage() {
		System.out.println("조회 작업을 실행하고 난 후에 무조건 실행되는 after 어드바이스 Message!!!");
		
	}
	public void afterRtnMessage() {
		System.out.println("조회 작업을 실행하고 난 후에 정상적으로 문제없이 실행되었을 때 after 어드바이스 Message!!!");
		
	}
	public void afterThrowMessage() {
		System.out.println("조회 작업을 실행하는 데 문제가 발생되었을 때  afterThrowing 어드바이스 Message!!!");
		
	}
}
