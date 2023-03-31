package com.leedaeho.memberjdbc.vo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor @RequiredArgsConstructor
public class MemberVO {
			@NonNull private String memId;
			@NonNull private String memName;
			@NonNull private String memPwd;
			private String email;
			private String phone;
			private String address;
			private String gender;
			private Integer stateCode;
			private String regDate;
		}

