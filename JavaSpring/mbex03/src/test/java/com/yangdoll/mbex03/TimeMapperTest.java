package com.yangdoll.mbex03;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangdoll.mapper.TimeMapper;
import com.yangdoll.mapper.UserMapper;
import com.yangdoll.vo.UserVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTest {
	@Autowired
	private ApplicationContext con;
	
	@Autowired
	private TimeMapper timeMapper;
	
	@Autowired
	private UserMapper userMap;
	
	@Test
//	@Ignore
	public void beanConfigTest() {
		assertNotNull(con);
		String[] beanList = con.getBeanDefinitionNames();
		for( String beanName : beanList) {
			System.out.println("=============" + beanName);
		}
	}
	
	@Test
	public void getTimeTest() {
		log.info(timeMapper.getTime() );
		log.info("마이바티스가 만든 구현체 정보 : " + timeMapper.getClass() );
		
	}
	
	@Test
	public void getUserAllTest() {
			List<UserVO> list = userMap.getAllUser();
			log.info("마이바티스가 만든 구현체 정보 : " + userMap.getClass().getName() );
			for (UserVO vo : list) {
				log.info("data list ==> " + vo.toString());
			}
	}
	
	@Test
	public void getUserTest() {
			UserVO vo = userMap.getUser("leedaeho");
			log.info("마이바티스가 만든 구현체 정보 : " + userMap.getClass().getName() );
				log.info("data list ==> " + vo.toString());
	}
	
	@Test
	public void getUserConTest() {
		UserVO vo = userMap.getUserCon("leedaeho", "이대호");
		log.info("마이바티스가 만든 구현체 정보 : " + userMap.getClass().getName() );
			log.info("data list ==> " + vo.toString());
}

}
