package dbexam.vo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbexam.vo.User;

public class UserDaoTwo {
	ConnectionMaker connectionMarker;
	
	
	

	public void add(User user)throws ClassNotFoundException, SQLException {
		Connection c =  connectionMarker.getConnection();
		PreparedStatement ps = c.prepareStatement("insert into users(id , name, password) values(?,?,?)");
		ps.setString(1,  user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		ps.executeUpdate();
		
		ps.close();
		c.close();
	}
	

	public void del(String id)throws ClassNotFoundException, SQLException {
		Connection c =  connectionMarker.getConnection();
		PreparedStatement ps = c.prepareStatement("insert into users(id , name, password) values(?,?,?)");
		ps.setString(1,  id);
		ps.executeUpdate();
		
		ps.close();
		c.close();
	}


}
