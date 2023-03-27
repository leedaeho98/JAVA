package com.leedaeho.dao;

import java.util.List;

import com.leedaeho.vo.UserVO;

public interface UserDAOInter {

	public Integer insert(UserVO vo);
	public void deleteAll();
	public Integer Update(UserVO vo);
	public List<UserVO> list();
	public Integer getCount();
}
