package com.yangdoll.board.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/boardbeans.xml"} )
public class BoardTest {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	BoardDAO dao;
	
	BoardVO data1, data2, data3;
	
	@Test
	@Ignore
	public void contextTest() {
		assertNotNull(context);
	}
	
	@Before
	public void init() {
		data1 = new BoardVO("홍길동1", "1111", "test Subject 1111", "Test content1111");
		data2 = new BoardVO("홍길동2", "2222", "test Subject 2222", "Test content2222");
		data3 = new BoardVO("홍길동3", "3333", "test Subject 3333", "Test content3333");
	}
	
	@Test
	public void addTest() {
		int max = dao.getMax();
		data1.setBoardNum(max+1);
		data1.setBoardReRef(max+1);
		assertEquals(dao.add(data1), 1);
		
		max = dao.getMax();
		data2.setBoardNum(max+1);
		data2.setBoardReRef(max+1);
		assertEquals(dao.add(data2), 1);
		
		max = dao.getMax();
		data3.setBoardNum(max+1);
		data3.setBoardReRef(max+1);
		assertEquals(dao.add(data3), 1);
		
		Integer result = dao.del(data1.getBoardNum());
		assertEquals(result, 1);
		
		result = dao.del(data2.getBoardNum());
		assertEquals(result, 1);
		
		result = dao.del(data3.getBoardNum());
		assertEquals(result, 1);
		
	}
	
	@Test
	public void getListTest() {
		List<BoardVO> list = dao.getlist(6, 10);
		assertEquals(list.size(), 4);
		for (BoardVO boardVO : list) {
			System.out.println(boardVO);
		}
	}
	

}
