package dbuser.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Before;
// import org.junit.Test
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dbuser.dao.UserDao;
import dbuser.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"beans.xml"})
public class UserDaoTest {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserDao dao;
	UserVO vo1, vo2, vo3;
	
	

	@Before // 중복을 제거하는 명령어
	public void init() {
		vo1 = new UserVO("aaaa","김길동","aaaa1234"); 
		vo2 = new UserVO("bbbb","나일등","bbbb1234"); 
		vo3 = new UserVO("cccc","호두가기","cccc1234"); 
		dao.deleteAll();
		assertEquals(dao.getCount(), 0); 
	}

	@Test
	public void addAndGet(){

		assertEquals(1, dao.addUser(vo1));
		assertEquals(dao.getCount(), 1);
		
		assertEquals(1, dao.addUser(vo2));
		assertEquals(dao.getCount(), 2);
		
		assertEquals(1, dao.addUser(vo3));
		assertEquals(dao.getCount(), 3);
		
		UserVO rstVO1 = dao.getUser(vo1.getId());
		UserVO rstVO2 = dao.getUser(vo2.getId());
		UserVO rstVO3 = dao.getUser(vo3.getId());

		fieldEqualsCheck(vo1, rstVO1);
		fieldEqualsCheck(vo2, rstVO2);
		fieldEqualsCheck(vo3, rstVO3);
	
	}
		private void fieldEqualsCheck(UserVO vo, UserVO eqVo) {
			assertEquals(vo.getName(), eqVo.getName());
			assertEquals(vo.getPassword(), eqVo.getPassword());
	}
	@Test
	public void getUserFailure() {
		
		assertThrows(EmptyResultDataAccessException.class,() -> {
		dao.getUser("leedaeho");
		});
	}
}

