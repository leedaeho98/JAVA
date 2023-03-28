package com.yangdoll.board.dao;

import java.util.List;

import com.yangdoll.board.vo.BoardVO;

public interface BoardDAO {
	
	Integer add(BoardVO vo);
	int update(BoardVO vo);
	Integer del(Integer boardNum);
	
	int getMax();
	int getCount();
	List<BoardVO> getlist(int start, int end);
	BoardVO get(int boardNum);

}
