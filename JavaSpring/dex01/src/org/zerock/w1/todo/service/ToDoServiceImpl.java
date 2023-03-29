package org.zerock.w1.todo.service;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.repository.TodoRepository;

public class ToDoServiceImpl implements ToDoService{
	TodoRepository repository;
	
	
	public void setRepository(TodoRepository repository) {
		this.repository = repository;
	}

	@Override
	public int add(TodoDTO dto) {
		// 필요한 선행 작업들이 들어갈 수 있다
		// 넘겨받은 자료의 유효성을 검사한다거나.. 넘겨받은 자료의 부족한 부분을 처리해준다거나...
		dto.setDueDate(new Date().toString());
		dto.setTitle("sample todo title");
		dto.setTno(2);
		return repository.add(dto);
	}


	@Override
	public int delAll() {
		// 필요한 선행 작업들이 들어갈 수 있다
		return repository.delAll();
	}

}
