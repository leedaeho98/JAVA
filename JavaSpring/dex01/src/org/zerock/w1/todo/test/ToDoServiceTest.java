package org.zerock.w1.todo.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.repository.TodoRepository;
import org.zerock.w1.todo.service.ToDoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/todobeans.xml"})

public class ToDoServiceTest {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	ToDoService service;
	
	@Test
	@Ignore
	public void context() {
		assertNotNull(context);
		assertNotNull(service);
		
	}
	@Test
	public void addTest() {
	TodoDTO dto = new TodoDTO();
		dto.setDueDate("2023/03/29");
		dto.setFinished(0);
		dto.setTitle("test todo 111111");
		dto.setTno(1);
		int resultDel = service.delAll();
		
		int result = service.add(dto);
	}
	
	

}
