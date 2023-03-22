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

public class BoardDAOImpl implements BoardDAO{
	DataSource ds;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public BoardDAOImpl() {
		try {
			ds = (DataSource)(new InitialContext().lookup("java:comp/env/jdbc/OracleDB"));
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int insertBoard(BoardVO vo) {
		int result = 0;
		String query = "insert into board values(?, ?, ?, ?, ? ,? , ?, 0, 0, 0, sysdate)";
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, vo.getBoardNum());
			ps.setString(2, vo.getBoardName());
			ps.setString(3, vo.getBoardPass());
			ps.setString(4, vo.getBoardSubject());
			ps.setString(5, vo.getBoardContent());
			ps.setString(6, vo.getBoardFile());
			ps.setInt(7, vo.getBoardNum());
			result= ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
	}
		return result;
	}

	

	@Override
	public int deleteBoard(int boardNum) {
		int result = 0;
		String query = "delete from board where boardNum = ?";
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, boardNum);
			result= ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
		}
		return result;
	}

	@Override
	public int updateBoard(BoardVO vo) {
		String query = "update board set boardSubject= ?, boardContent = ? where boardNum = ?";
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, vo.getBoardSubject());
			ps.setString(2, vo.getBoardContent());
			ps.setInt(3, vo.getBoardNum());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
		}
		return 0;
	}

	@Override
	// 게시글 한개만 조회
	public BoardVO getBoard(int boardNum) {
		BoardVO vo = null;
		try {
			con = ds.getConnection();
			ps = con.prepareStatement("select * from board where boardNum = ?");
			ps.setInt(1, boardNum);
			rs = ps.executeQuery();
			
			while( rs.next()) {
				vo = new BoardVO();
				vo.setBoardNum( rs.getInt("boardNum"));
				vo.setBoardContent(rs.getString("BoardContent"));
				vo.setBoardDate(rs.getString("BoardDate"));
				vo.setBoardFile(rs.getString("BoardFile"));
				vo.setBoardName(rs.getString("BoardName"));
				vo.setBoardPass(rs.getString("BoardPass"));
				vo.setBoardReadCount(rs.getInt("BoardReadCount"));
				vo.setBoardReLev(rs.getInt("BoardReLev"));
				vo.setBoardReRef(rs.getInt("BoardReRef"));
				vo.setBoardReSeq(rs.getInt("BoardReSeq"));
				vo.setBoardSubject(rs.getString("BoardSubject"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
	}
		return vo;
	}

	@Override
	// 게시글목록들을 조회
	public List<BoardVO> getList(int pageStart, int pageLast) {
		List<BoardVO> list = null;
		String query = "select * from(select rownum num , selone.* from (select * from board order by boardReRef desc, boardReSeq asc) selone) where num between ? and ?"; // 게시글 목록 페이지수
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, pageStart);
			ps.setInt(2, pageLast);
			rs = ps.executeQuery();
			list = new ArrayList<BoardVO>();
			
			while( rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNum( rs.getInt("boardNum"));
				vo.setBoardContent(rs.getString("BoardContent"));
				vo.setBoardDate(rs.getString("BoardDate"));
				vo.setBoardFile(rs.getString("BoardFile"));
				vo.setBoardName(rs.getString("BoardName"));
				vo.setBoardPass(rs.getString("BoardPass"));
				vo.setBoardReadCount(rs.getInt("BoardReadCount"));
				vo.setBoardReLev(rs.getInt("BoardReLev"));
				vo.setBoardReRef(rs.getInt("BoardReRef"));
				vo.setBoardReSeq(rs.getInt("BoardReSeq"));
				vo.setBoardSubject(rs.getString("BoardSubject"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
		}
		return list;
	}

	@Override
	public int getCount() { // select max(boardNum) from board
		int result = 0;
		String query = "select count(*) as boardCount from board";
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while( rs.next()) {
				result = rs.getInt("boardCount");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
		}
		return result;
	}

	@Override
	public int getMaxNum() { // select max(boardNum) from board
		int result = 0;
		try {
			con = ds.getConnection();
			ps = con.prepareStatement("select max(boardNum)as maxNum from board");
			rs = ps.executeQuery();
			
			while( rs.next()) {
				result = rs.getInt("maxNum"); // maxNum은 컬럼명이다
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
	}
		return result;
}

	@Override
	public int updateCount(int boardNum) {
		int result = 0;
		String query = "update board set boardReadCount = boardReadCount+1 where boardNum = ?";
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, boardNum);
			result= ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
		}
		return result;
	}

	@Override
	public int boardReply(BoardVO vo) {
		int result = 0;
		String maxQuery = "select max(boardNum) from board";
		String query = "";
		
		int insertBoardNum = 0;
		int reRef = vo.getBoardReRef();
		int reLev = vo.getBoardReLev();
		int reSeq = vo.getBoardReSeq();
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(maxQuery);
			rs = ps.executeQuery();
			
			if (rs.next()) insertBoardNum = rs.getInt(1) + 1; // 값이 있으면
			else insertBoardNum = 1;
			query = "update board set boardReSeq = boardReSeq +1 where boardReRef =? and boardReSeq >?";
			ps = con.prepareStatement(query);
			ps.setInt(1, reRef);
			ps.setInt(2, reSeq);
			ps.executeUpdate();
			
			reLev = reLev + 1;
			reSeq = reSeq + 1;
			
			query = "insert into board values( ?,?,?,?,?,?,?,?,?,0,sysdate)";
			ps = con.prepareStatement(query);
			ps.setInt(1, insertBoardNum);
			ps.setString(2, vo.getBoardName() );
			ps.setString(3, vo.getBoardPass());
			ps.setString(4, vo.getBoardSubject());
			ps.setString(5, vo.getBoardContent());
			ps.setString(6, "");
			ps.setInt(7, reRef);
			ps.setInt(8, reLev);
			ps.setInt(9, reSeq);
			result = ps.executeUpdate(); 			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
		}
		
		return result;
	}
	@Override
	public boolean isBoardWriterCheck(int boardNum, String boardPass) {
		String query = "select * from board where boardNum =?";
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, boardNum);
			rs = ps.executeQuery();
			String repPass = null;
			while(rs.next()) {
				repPass = rs.getString("boardPass");
			}
			if (boardPass.equals(repPass) ) return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if ( rs != null) try{rs.close(); } catch(Exception e) {}
			if ( con != null)try{con.close();} catch(Exception e) {}
			if ( ps != null)try{ps.close();} catch(Exception e) {}
		}
		return false;
	}
}
