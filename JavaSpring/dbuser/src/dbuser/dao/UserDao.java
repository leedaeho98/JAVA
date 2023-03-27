package dbuser.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.dao.EmptyResultDataAccessException;

import com.sun.net.httpserver.Authenticator.Result;

import dbuser.vo.UserVO;

public class UserDao {
	@Autowired
	DataSource dataSource;


//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}

	public Integer addUser(UserVO vo) {
		Connection c = null;
		PreparedStatement ps = null; 
		try {
			c = dataSource.getConnection();
			ps=c.prepareStatement("insert into users values(?,?,?)");
			ps.setString(1,  vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPassword());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			try {c.close();} catch (SQLException e) {e.printStackTrace();}
		}
		return 0;
	}
	
	public UserVO getUser(String id) throws EmptyResultDataAccessException {
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserVO rtnVO = null;
		try {
			c = dataSource.getConnection();
			ps=c.prepareStatement("select * from users where id=?");
			ps.setString(1,  id);
			rs = ps.executeQuery();
			if(rs.next()) { // 조회되는 자료가 있다면
				rtnVO = new UserVO();
				rtnVO.setId(rs.getString("id"));
				rtnVO.setId(rs.getString("name"));
				rtnVO.setId(rs.getString("password"));
				
			}
			if(rtnVO == null) {
				throw new EmptyResultDataAccessException(1); // 익센셥을 발생시킨다
			}
			return rtnVO;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			try {c.close();} catch (SQLException e) {e.printStackTrace();}
			try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		}
		return null;
	}

	public Integer getCount() {
		Connection c = null;
		PreparedStatement ps = null; 
		ResultSet rs = null;
		try {
			c = dataSource.getConnection();
			ps=c.prepareStatement("select count(*) from users");
			rs= ps.executeQuery();
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			try {c.close();} catch (SQLException e) {e.printStackTrace();}
		}
		return null;
	}
	
	public void deleteAll() {
		Connection c = null;
		PreparedStatement ps = null; 
		try {
			c = dataSource.getConnection();
			ps=c.prepareStatement("delete from users");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			try {c.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	}

