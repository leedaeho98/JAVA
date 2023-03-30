package com.yangdoll.mbex01.dao;

import java.util.List;

import com.yangdoll.mbex01.vo.UserVO;

public interface UserDAO {
	
	public void insert(UserVO user);
	
	public UserVO selectOne(String id);
	
	public int delUser(String id);
	
	public List<UserVO> getAll();
}
