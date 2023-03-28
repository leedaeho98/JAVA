package com.yangdoll.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yangdoll.board.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO{
	
//	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private RowMapper<BoardVO> rowMapper = new RowMapper<BoardVO>() {

		public BoardVO mapRow(ResultSet rs, int arg1) throws SQLException {
			BoardVO vo = new BoardVO();
			vo.setBoardContent(rs.getString("boardContent"));
			vo.setBoardDate(rs.getString("boardDate") );
			vo.setBoardFile(rs.getString("boardFile"));
			vo.setBoardName(rs.getString("boardName"));
			vo.setBoardPass(rs.getString("boardPass"));
			vo.setBoardSubject(rs.getString("boardSubject"));		
			vo.setBoardNum( rs.getInt("boardNum"));
			vo.setBoardReRef( rs.getInt("BoardReRef"));
			vo.setBoardReLev( rs.getInt("BoardReLev"));
			vo.setBoardReSeq( rs.getInt("BoardReSeq"));
			vo.setBoardReadCount( rs.getInt("BoardReadCount"));
			
			return vo;
		}
		
	};

	public Integer add(BoardVO vo) {
		
		return jdbcTemplate.update("insert into board values(?,?,?,?,?,?,?,0,0,0,sysdate)",
			vo.getBoardNum(), vo.getBoardName(), vo.getBoardPass(), 
			vo.getBoardSubject(), vo.getBoardContent(), vo.getBoardFile(), vo.getBoardReRef() );
	}
	public int update(BoardVO vo) {
		String query = "update board set boardSubject = ?, boardContent =?, boardName=?, where boardNum=?";
		return jdbcTemplate.update(query , vo.getBoardSubject(), vo.getBoardContent(), vo.getBoardName(), vo.getBoardNum()  );
	}
	
	public Integer del(Integer boardNum) {
		
		return jdbcTemplate.update("delete from board where boardNum = ?", boardNum);
	}
	
	public int getMax() {
		
		return jdbcTemplate.queryForObject("select max(boardNum) from board", Integer.class); // 1행1열로 나오니 인티저로 한다
	}
	
	public int getCount() {
		
		return jdbcTemplate.queryForObject("select count(*) from board", Integer.class);
	}

	public List<BoardVO> getlist(int start, int end) {
		
		return jdbcTemplate.query("select * from board where boardNum >= ? and boardNum <= ?", 
				new Object[] {start, end},
				rowMapper);
	}

	public BoardVO get(int boardNum) {
		
		return jdbcTemplate.queryForObject("select * from board where boardNum = ?", 
				new Object[] {boardNum},
				rowMapper);
	}


}
