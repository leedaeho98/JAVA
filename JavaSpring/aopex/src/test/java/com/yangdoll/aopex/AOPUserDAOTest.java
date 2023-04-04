package com.yangdoll.aopex;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangdoll.aopex.dao.UserDAO;
import com.yangdoll.aopex.vo.UserVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class AOPUserDAOTest {
	@Autowired
	UserDAO dao;
	
	UserVO user1, user2, user3;
	
	@Before
	public void dataSetup() {
		user1 = new UserVO("aaaa","aaaadsar","aaaarewghfd","aaaaress");
		user2 = new UserVO("bbbb","bbbbdsar","bbbbrewghfd","bbbbress");
		user3 = new UserVO("cccc","ccccdsar","ccccrewghfd","ccccress");
	}
		
	@Test
	public void createUserTest() {
		dao.createUser(user1);
		System.out.println("==== 입력작업이 이루어져 완료 되었습니다...");
		UserVO rtnVO = dao.readUser(user1.getUserId());
		System.out.println(rtnVO);
		
		dao.deletUser(user1.getUserId());
		System.out.println("==== 삭제작업이 이루어져 완료 되었습니다");
	}
	
	private void dataCompare(UserVO src, UserVO tar) {
		assertEquals(src.getAddress(), tar.getAddress());
		assertEquals(src.getUserName(), tar.getUserName());
		assertEquals(src.getUserPassword(), tar.getUserPassword());
	}
	
	@Test
	public void updateUserTest() {
		dao.createUser(user1);
		dao.createUser(user2);
		dao.createUser(user3);
		user2.setAddress("서울 코레아");
		user2.setUserPassword("seoulKorea");
		user2.setUserName("대한민국");
		log.info("수정후 ==> " + dao.readUser(user2.getUserId()));
		assertEquals(1,  dao.updateUser(user2));
		dataCompare(user2, dao.readUser(user2.getUserId()));
		dataCompare(user1, dao.readUser(user1.getUserId()));
		dataCompare(user3, dao.readUser(user3.getUserId()));
		
	}
	
	/*
	 * @After public void afterInit() { dao.deletUser(user1.getUserId());
	 * dao.deletUser(user2.getUserId()); dao.deletUser(user3.getUserId());
	 * assertEquals(0, dao.readUserCount()); }
	 */	

}
