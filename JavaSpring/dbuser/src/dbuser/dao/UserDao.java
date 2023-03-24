package dbuser.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sun.net.httpserver.Authenticator.Result;

import dbuser.vo.UserVO;

public class UserDao {
	DataSource dataSource;


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void addUser(UserVO vo) {
		Connection c = null;
		PreparedStatement ps = null; 
		try {
			c = dataSource.getConnection();
			ps=c.prepareStatement("insert into users values(?,?,?)");
			ps.setString(1,  vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			try {c.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}

	public Integer count() {
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
	

	}

