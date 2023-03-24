package dbexam.vo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import dbexam.vo.User;
import lombok.Setter;
@Setter
public class UserDao {
	private DataSource dataSource;
	
	
	public void add(User user) throws Exception {
		Connection c =  dataSource.getConnection();
		PreparedStatement ps = c.prepareStatement("insert into users(id , name, password) values(?,?,?)");
		ps.setString(1,  user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		ps.executeUpdate();
		ps.close();
		c.close();
	}

	public User get(String id) throws Exception {
		Connection c = dataSource.getConnection();
		PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		ps.close();
		c.close();
		rs.close();
		return user;

	}


}
