package com.leedaeho.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.leedaeho.vo.UserVO;

public class UserDAO implements UserDAOInter {
	@Autowired
	DataSource ds;
	
	Connection c = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	

	@Override
	public Integer insert(UserVO vo) {
		Integer result = null;
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.insert);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPassword());
			return ps.executeUpdate();
		} catch (SQLException e) {
		}finally 
		{ try { c.close();} catch (SQLException e)  { } }
		{ try { ps.close();} catch (SQLException e)  { } }
		
		return null;
	}

	@Override
	public void deleteAll() {
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.deleteAll);
			ps.executeUpdate();
		} catch (SQLException e) {
		}finally 
		{ try { c.close();} catch (SQLException e)  { } }
		{ try { ps.close();} catch (SQLException e)  { } }
		
	}

	@Override
	public Integer Update(UserVO vo) {
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.insert);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPassword());
			return ps.executeUpdate();
		} catch (SQLException e) {
		}finally 
		{ try { c.close();} catch (SQLException e)  { } }
		{ try { ps.close();} catch (SQLException e)  { } }
		
		return null;
	}

	@Override
	public List<UserVO> list() {
		List<UserVO> list = new ArrayList<UserVO>();
		try {
			c=ds.getConnection();
			ps=c.prepareStatement(UserDAOQuery.selectAll);
			rs=ps.executeQuery();
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				list.add(vo);
				return list;
			}
		} catch (SQLException e) {
		}finally 
		{ try { c.close();} catch (SQLException e)  { } }
		{ try { ps.close();} catch (SQLException e)  { } }
		
		return null;
	}

	@Override
	public Integer getCount() {
		return null;
	}

}
