package com.sample.exam01.dto;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
	//필드(전역변수)
	private String 	mem_id;
	private String	mem_pwd;
	private String	mem_name; 
	private String	mem_phone;
	private String	mem_addr;

	
	
	
	
	
//		    constraint mem_id_pk primary key (mem_id) -- 아웃라인 제약조건 부여 <= 실무용
//		    );
}
