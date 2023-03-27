package com.yangdoll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import com.yangdoll.vo.UserVO;

public class UserDAOImpl implements UserDAO {
	@Autowired
	DataSource ds;
	
	
	@Override
	public UserVO getUser(String id)throws EmptyResultDataAccessException {
	UserVO vo = null;
	Connection c= null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
		c=ds.getConnection();
		ps=c.prepareStatement(UserDAOQuery.getUser);
		ps.setString(1, id);
		rs=ps.executeQuery();
		while(rs.next()) {
			vo = new UserVO(); // 객체를 생성해 멤버변수 사용가능
			vo.setId(rs.getString("id"));
			vo.setName(rs.getString("name"));
			vo.setPassword(rs.getString("password"));
			
			return vo;
		}
	} catch (Exception e) {
	
	}finally {
		if (rs !=  null ) {try {rs.close();} catch (SQLException e) { } }
		if (ps !=  null ) {try {ps.close();} catch (SQLException e) { } }
		if (c !=  null ) {try {c.close();} catch (SQLException e) { } }
	}
	if(vo == null) {
		throw new EmptyResultDataAccessException(1);
	}
		return vo;
	}

	@Override
	public List<UserVO> getAllUser() {
		List<UserVO> list = null;
		Connection c= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.getAllUser);
			rs=ps.executeQuery();
			list = new ArrayList<UserVO>();
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				list.add(vo);
				return list;
			}
		} catch (Exception e) {
		
		}finally {
			if (rs !=  null ) {try {rs.close();} catch (SQLException e) { } }
			if (ps !=  null ) {try {ps.close();} catch (SQLException e) { } }
			if (c !=  null ) {try {c.close();} catch (SQLException e) { } }
		}
		return list;
	}

	@Override
	public Integer getCount() {
		Integer result = null;
		Connection c= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.getCount);
			rs=ps.executeQuery();
			while(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (Exception e) {
		
		}finally {
			if (ps !=  null ) {try {ps.close();} catch (SQLException e) { } }
			if (c !=  null ) {try {c.close();} catch (SQLException e) { } }
		}
		
		return result;
	}

	@Override
	public void addUser(UserVO vo) {
		Connection c = null;
		PreparedStatement ps = null;
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.addUser);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPassword());
			ps.executeUpdate();
		} catch (Exception e) {
		
		}finally {
			if (ps !=  null ) {try {ps.close();} catch (SQLException e) { } }
			if (c !=  null ) {try {c.close();} catch (SQLException e) { } }
		}
	}

	@Override
	public void delUser(String id) { 
		Connection c = null;
		PreparedStatement ps = null;
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.delUser);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
		
		}finally {
			if (ps !=  null ) {try {ps.close();} catch (SQLException e) { } }
			if (c !=  null ) {try {c.close();} catch (SQLException e) { } }
		}
		
	}

	@Override
	public void delAll() {
		Connection c = null;
		PreparedStatement ps = null;
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.delAll);
			ps.executeUpdate();
		} catch (Exception e) {
		
		}finally {
			if (ps !=  null ) {try {ps.close();} catch (SQLException e) { } }
			if (c !=  null ) {try {c.close();} catch (SQLException e) { } }
		}
		
	}

	@Override
	public void updateUser(UserVO vo) {
		Connection c = null;
		PreparedStatement ps = null;
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.updateUser);
			ps.setString(1, vo.getName());
			ps.setString(1, vo.getPassword());
			ps.setString(1, vo.getId());
		} catch (Exception e) {
		
		}finally {
			if (ps !=  null ) {try {ps.close();} catch (SQLException e) { } }
			if (c !=  null ) {try {c.close();} catch (SQLException e) { } }
		}
		
	}


	
}
