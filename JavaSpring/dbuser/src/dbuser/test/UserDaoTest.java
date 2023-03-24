package dbuser.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dbuser.dao.UserDao;
import dbuser.vo.UserVO;

public class UserDaoTest {

	UserVO vo1 = new UserVO("aaaa","kim aaaa","aaaa1234"); 
	UserVO vo2 = new UserVO("bbbb","bbk im aaaa","bbbb1234"); 
	
	@Test
	public void userAdd() {
		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);
		dao.addUser(vo1);
		dao.addUser(vo2);
		assertEquals(dao.count(), 2);
	}
	
}
