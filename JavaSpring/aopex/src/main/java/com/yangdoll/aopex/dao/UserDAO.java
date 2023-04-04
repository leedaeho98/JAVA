package com.yangdoll.aopex.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.yangdoll.aopex.vo.UserVO;

@Repository
public class UserDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	RowMapper<UserVO> rm = (ResultSet rs, int rowNum) -> {
			UserVO vo = new UserVO();
			vo.setAddress(rs.getString("address"));
			vo.setUserId(rs.getString("userId"));
			vo.setUserName(rs.getString("userName"));
			vo.setUserPassword(rs.getString("userPassword"));
			return vo;
		};

		
	public int createUser(UserVO vo) {
		return jdbcTemplate.update("insert into users values(?,?,?,?)",
		vo.getUserId() , vo.getUserPassword(), vo.getUserName(), vo.getAddress()
		);
	}
	
	public int updateUser(UserVO vo) {
		return jdbcTemplate.update("update users set userPassword = ?, userName = ?, address=? where userId = ?"
		,vo.getUserPassword() , vo.getUserName(), vo.getAddress(), vo.getUserId()
		);
	}
	public int deletUser(String userId) {
		return jdbcTemplate.update("delete from users where userId = ?",
				userId);
	}
	
	public UserVO readUser(String userId){
		return jdbcTemplate.queryForObject("select * from users where userId = ? ",new Object[] {userId} , rm);
	}
		
	public List<UserVO> readUserList(){
		return jdbcTemplate.query("select * from users", rm);
	}
	
	public int readUserCount(){
		return jdbcTemplate.queryForObject("select count(*) from users", Integer.class);
	}
		

}
