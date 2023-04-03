package com.yangdoll.conex0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangdoll.conex0.dao.MemberDAO;
import com.yangdoll.conex0.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDAO dao;
	
	@Override
	public MemberVO getMember(String id) {
		// 선행작업이 있으면 이곳에서 선행 작업을 처리한다
		return dao.findMember(id);
	}

}
