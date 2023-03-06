package exam03.sample.exam03.dto;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BoardVo {
	// 접근제어자
	private long boardNum; // 게시글 일련번호
	private String title; // 게시글 제목
	private String writer; // 작성자
	private String content; // 게시글 내용
	private String regDate; // 게시일
	private String password;

	
}
