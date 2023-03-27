package com.yangdoll.dao;

public interface UserDAOQuery {
	String getUser="select * from users where id=?";
	String getAllUser="select * from users";
	String getCount="select count(*) from users";
	String addUser="insert into users values(?,?,?)";
	String delUser="delete from users where id=?";
	String delAll="delete from users";
	String updateUser="update users set name=?, password=? where id=?";
	
}
