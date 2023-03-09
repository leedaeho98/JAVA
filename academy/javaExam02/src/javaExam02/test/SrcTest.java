package javaExam02.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import javaExam02.src.Big;
import javaExam02.src.Middle;
import javaExam02.src.Small;

public class SrcTest {
	
//	scan.nextInt(); // 숫자 반환
//	scan.nextDouble(); //실수 반환 
	Big obj = new Small(); // 객체생성
	
	@Test // 테스트하는 메소드인걸 알려준다
	public void objTest() {
	assertNotNull(obj); // obj에 객체가생성이 안되있으면 true
//	assertEquals(obj.getMoney(),100); // money의 값이 500을 만족 못하기 때문에 false
	}
	@Test
	public void rtnValueTest() {
		assertEquals(  (   (Small)obj   ).getMoney(), 300); //
	}
}
