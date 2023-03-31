package com.leedaeho.memberjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.leedaeho.memberjdbc.vo.MemberVO;

@Repository
public class MemberJDBCTempDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private RowMapper<MemberVO> mapper = new RowMapper<MemberVO>() {

		@Override
		public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberVO vo = new MemberVO();
			vo.setAddress(rs.getString("Address"));
			vo.setEmail(rs.getString("Email"));
			vo.setGender(rs.getString("Gender"));
			vo.setMemId(rs.getString("memId"));
			vo.setMemName(rs.getString("memName"));
			vo.setMemPwd(rs.getString("memPwd"));
			vo.setPhone(rs.getString("phone"));
			vo.setRegDate(rs.getString("regDate"));
			vo.setStateCode(rs.getInt("stateCode"));
			return vo;
		}
	};

	public int addMember(MemberVO member) {
		return jdbcTemplate.update("insert into members values(? ,? ,? ,? ,? ,? ,? ,1 ,sysdate)",
				member.getMemId(), member.getMemName(), member.getMemPwd(), member.getEmail(),
				member.getPhone(), member.getAddress(), member.getGender() );
	}

	public int delMember(String memId) {
		return jdbcTemplate.update("delete from members where memId=?",memId);
	}

	public MemberVO getMember(String memId) {
		return jdbcTemplate.queryForObject("select * from members where memId=?",
				new Object[] {memId}, mapper);
	}

	public int updateMember(MemberVO vo) {
		return jdbcTemplate.update("update members set memPwd=?, email=?, phone=?, address=? where memId=?",
				vo.getMemPwd(), vo.getEmail(),vo.getPhone(), vo.getAddress(), vo.getMemId() 
				); 
	}
}
