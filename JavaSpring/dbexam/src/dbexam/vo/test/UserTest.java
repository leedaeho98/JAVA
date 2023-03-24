package dbexam.vo.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dbexam.domain.DaoFactory;
import dbexam.vo.User;
import dbexam.vo.repository.NConnectionMaker;
import dbexam.vo.repository.UserDao;


public class UserTest {
	@Test
	public void addTest() throws Exception {
		// 테스트할 데이터2개 만들기
		User user1 = new User("gildong","honggildong","gildong1234");
		User user2 = new User("gilnam","parkgilnam","1472gilnam");
		
//		UserDao dao = new DaoFactory().userDao();
//		UserDao dao = DaoFactory.userDaoSt();
		
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		ApplicationContext context = new GenericXmlApplicationContext("applicationcontext.xml");
		UserDao dao = context.getBean("userDao" , UserDao.class);
		dao.add(user1);
		dao.add(user2);
		
	}
}
