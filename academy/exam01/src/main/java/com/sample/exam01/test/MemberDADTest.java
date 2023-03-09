package com.sample.exam01.test;

import com.sample.exam01.dao.MemberDAO;
import com.sample.exam01.dto.Member;

public class MemberDADTest {

	public static void main(String[] args) throws Exception {
		/*
		// 입력 테스트하기 => 데이터를 만들고 데이터를 주면서 입력하라고 한다.
		// 1. 테스트용 데이터 만들기
		Member samData1 = new Member("gildong","gil1234","서자홍길동","010111111","seoul");
		// 2 만들어준 데이터를 넘겨주면서 일을 시킨다
		
		MemberDAO dao = new MemberDAO();
		dao.insert(samData1);
		*/
		
		MemberDAO dao = new MemberDAO();
		Member mem =dao.selectOne("leedaeho");
		System.out.println(mem);
	}

}
