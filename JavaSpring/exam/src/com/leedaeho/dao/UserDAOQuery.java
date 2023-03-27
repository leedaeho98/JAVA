package com.leedaeho.dao;

public interface UserDAOQuery {

	String insert="inset into users values(?,?,?)";
	String deleteAll="delete from users";
	String update="update users set id=?, password=? where name=?";
	String selectAll="select * from users";
	String Count ="select count(*) from users";
}
