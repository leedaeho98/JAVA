package com.yangdoll.dao;

import java.util.List;

import com.yangdoll.vo.UserVO;

public interface UserDAO {
	public UserVO getUser(String id); // 반환되는 타입이 레코드니까 UserVO를 넣는다
	
	public List<UserVO> getAllUser() ;
	
	public Integer getCount() ;
	
	public void addUser(UserVO vo) ;
	
	public void delUser(String id) ;
	
	public void delAll() ;
	
	public void updateUser(UserVO vo) ;
}
