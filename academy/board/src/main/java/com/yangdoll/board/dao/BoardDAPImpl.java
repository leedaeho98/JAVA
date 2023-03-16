package com.yangdoll.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.yangdoll.board.vo.BoardVO;

public class BoardDAPImpl implements BoardDao{
	// DB를 연결하기전에
	DataSource ds; // DB를 연ㄱ
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	// DB연결코드
	public BoardDAPImpl() {
		try {
			ds = (DataSource)(new InitialContext().lookup("java:comp/env/jdbc/OracleDB"));  // java:comp/env/라는 접두어를 고정으로 붙여줘야한다
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int insertBoard(BoardVO vo) {
		return 0;
	}

	@Override
	public int deleteBoard(int boardNumber) {
		return 0;
	}

	@Override
	public int updateBoard(BoardVO vo) {
		return 0;
	}

	@Override
	public BoardVO getBoard(int boardNum) {
		return null;
	}

	@Override
	public List<BoardVO> getList() {
		List<BoardVO> list = null;
		try {
			con = ds.getConnection(); // DB연결코드
			ps = con.prepareStatement("select * from board"); // 전체출력
			rs = ps.executeQuery();
			list = new ArrayList<BoardVO>();
			
			while (rs.next()) { // 자료가 없을떄까지
				BoardVO vo = new BoardVO();
				vo.setBoardNum (rs.getInt("boardNum"));
				vo.setBoardContent (rs.getString("BoardContent"));
				vo.setBoardDate (rs.getString("BoardDate"));
				vo.setBoardFile(rs.getString("boardFile"));
				vo.setBoardName(rs.getString("boardName"));
				vo.setBoardPass(rs.getString("boardPass"));
				vo.setBoardReadCount(rs.getInt("boardCount"));
				vo.setBoardReLev(rs.getInt("boardReLev"));
				vo.setBoardReRef(rs.getInt("boardReRef"));
				vo.setBoardReSeq(rs.getInt("boardReSeq"));
				vo.setBoardSubject(rs.getString("boardSubject"));
				list.add(vo);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public int getMaxNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
