package org.zerock.w1.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {
	Integer tno;
	String title;
	String dueDate;
	Integer finished;
}
