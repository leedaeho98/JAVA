package com.leedaeho.member;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leedaeho.member.dao.MemberDao;
import com.leedaeho.member.vo.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberDaoTest {
		
		@Autowired
		ApplicationContext context;
	
		@Autowired
		MemberDao dao;
		
		@Test
		public void beanTest() {
			System.out.println(dao.getMember("leedaeho") );
		}
		
		@Test
		public void delMemberTest() {
			int result = dao.delMember("leedaeho");
			assertEquals(result, 1);
		}
		
		@Test
		public void addAndUpdateMemberTest() {
			Member member = new Member();
			member.setMemId("leedaeho");
			member.setAddress("수원시 권선구 세류동");
			member.setEmail("gildong@daum.net");
			member.setGender("남");
			member.setMemName("홍길동");
			member.setMemPwd("gildong1111");
			member.setPhone("01012345678");
			dao.addMember(member);
			System.out.println("입력 결과" + dao.getMember(member.getMemId()));
			
			member.setStateCode(2);
			member.setAddress("수원시 권선구 권선동");
			dao.updateMember(member);
			assertEquals(member, dao.getMember(member.getMemId()));
		}
		
		
		
		
		

}
