package com.yangdoll.board.dao;

import java.util.List;

import com.yangdoll.board.vo.BoardVO;

public interface BoardDao {
	int insertBoard(BoardVO vo); // insert into board values(
	int deleteBoard(int boardNumber); // delete from board where where boardNum = ?
	int updateBoard(BoardVO vo); // update board set 항목 ... where boardNum = ? 
	// 여러개의 자료를 넘어와야하므로
	
	BoardVO getBoard(int boardNum); 
	List<BoardVO> getList();
	int getCount(); // select count(*) rfom board;
	int getMaxNum(); // select max(boardNum) from board;
}
