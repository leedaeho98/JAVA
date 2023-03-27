package com.leedaeho.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leedaeho.dao.UserDAOInter;
import com.leedaeho.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = {"userAppContext.xml"})
public class UserTest {
	@Autowired
	ApplicationContext context;
	UserDAOInter dao;
	UserVO vo1,vo2,vo3;
	
	@Before
	public void method() {
		vo1 = new UserVO("tlkj1633", "이대호", "1234567");
		vo2 = new UserVO("han", "한혜민", "1234");
		vo3 = new UserVO("An", "안준영", "1222");
	}
	
	@Test
	public void insez() {
	dao.insert(vo1);	
	dao.insert(vo2);	
	dao.insert(vo3);
		
	}
	
	
	
	

	
}
