package dbexam.vo.test;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dbexam.vo.User;
import dbexam.vo.repository.UserDao;
import dbexam.vo.repository.UserDaoTwo;

public class UserDaoTwoTest {
	// 테스트할 데이터2개 만들기
	ApplicationContext context ;
	UserDaoTwo dao;
	
	User user1 = new User("gildong","honggildong","gildong1234");
	User user2 = new User("gilnam","parkgilnam","1472gilnam");
	
	@BeforeEach
	public void tetsInit() {
		context =new GenericXmlApplicationContext("applicationcontext.xml");
		dao = context.getBean("userDaoTwo" , UserDaoTwo.class);
	}
	
	@Test
	public void userDaoTwoAdd() throws ClassNotFoundException, SQLException {
		ApplicationContext context = new GenericXmlApplicationContext("applicationcontext.xml");
		UserDaoTwo dao = context.getBean("userDaoTwo" , UserDaoTwo.class);
		dao.add(user1);
		dao.add(user2);
		
	}
	
	@Test
	public void userDaoTwoDel() throws ClassNotFoundException, SQLException {
		ApplicationContext context = new GenericXmlApplicationContext("applicationcontext.xml");
		UserDaoTwo dao = context.getBean("userDaoTwo" , UserDaoTwo.class);
		dao.del(user1.getId());
		dao.del(user2.getId());
		
	}
}
