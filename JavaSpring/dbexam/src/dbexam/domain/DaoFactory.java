package dbexam.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dbexam.vo.repository.ConnectionMaker;
import dbexam.vo.repository.NConnectionMaker;
import dbexam.vo.repository.OConnectionMaker;
import dbexam.vo.repository.UserDao;

@Configuration
public class DaoFactory { // 스프링에서 객체생성정보를 담고있는 클래스
//	public static UserDao userDaoSt() {
//		return new UserDao(new OConnectionMaker());
//	}
	
	@Bean // 빈이 붙어있는 이 메소드를 우리는 객체를 생성해서 가지고있다
	public UserDao userDao() {
		UserDao dao = new UserDao();
		dao.ConnectionMaker(conMaker());
		return dao;
	}


	
	/* 
	public MemberDao userDao() {
		return new UserDao(new NConnectionMaker());	
	}
	
	public SangpumDao userDao() {
		return new UserDao(new NConnectionMaker());	
	}
	
	public BoardDao userDao() {
		return new UserDao(new NConnectionMaker());	
	}
	 
	 */
	@Bean
	public ConnectionMaker conMaker() {
		return new NConnectionMaker();
	}

	}

