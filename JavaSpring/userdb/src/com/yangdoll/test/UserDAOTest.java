package com.yangdoll.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangdoll.dao.UserDAO;
import com.yangdoll.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/userAppContext.xml"})
public class UserDAOTest {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserDAO dao;
	
	UserVO td1, td2, td3;
	
	@Before
	public void dataSetup() {
		td1 = new UserVO("yangdoll", "이대호", "Lee");
		td2 = new UserVO("leedaeho", "한혜민", "Han");
		td3 = new UserVO("AnJunYoung", "안준영", "An");
	}
	
	@After
	public void clearData() {
		dao.delAll(); // 값을 다 지운다
		assertEquals(dao.getCount(), 0); // 값이 다 지어졌는지 확인 
	}
	
	@Test
	public void addAndGet() {
		dao.addUser(td1);
		assertEquals(1, dao.getCount());
	
		dao.addUser(td2);
		assertEquals(2, dao.getCount());
		
		dao.addUser(td3);
		assertEquals(3, dao.getCount());
		
		UserVO rv = null;
		
		rv=dao.getUser(td1.getId());
		resultCheck(rv,td1);
		
		rv=dao.getUser(td2.getId());
		resultCheck(rv,td2);
		
		rv=dao.getUser(td3.getId());
		resultCheck(rv,td3);
	
	}

	private void resultCheck(UserVO rv1, UserVO td) {
		assertEquals(rv1.getName(), td.getName());
		assertEquals(rv1.getPassword(), td.getPassword());
	}
	
	@Test(expected = EmptyResultDataAccessException.class)
	public void getNullDataTest() {
		UserVO rv = dao.getUser("leedaeho");
		
	}
	
}
