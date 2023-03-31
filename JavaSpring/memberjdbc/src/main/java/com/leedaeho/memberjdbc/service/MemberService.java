package com.leedaeho.memberjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.leedaeho.memberjdbc.dao.MemberJDBCTempDao;
import com.leedaeho.memberjdbc.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberJDBCTempDao dao;

	public int addMember(MemberVO member) {
		return dao.addMember(member);
	}

	public int delMember(String memId) {
		return dao.delMember(memId);
	}

	public MemberVO getMember(String memId) {
		try {
			return dao.getMember(memId);			
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public int updateMember(MemberVO member) {
		return dao.updateMember(member);
	}

}
