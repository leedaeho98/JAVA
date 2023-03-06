package exam03.sample.exam03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import exam03.sample.exam03.dto.BoardVo;

public class BoardDAO {

	public int addBoard(BoardVo vo) { // insert info board value(......)
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}

	public BoardVo getBoard(long boardNum) { // select * from board where boardNum=?
		BoardVo vo = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return vo;
	}


	public List<BoardVo> getAll() {
		List<BoardVo> list = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

	
	
	// 보드테이블의 자료를 수정하는 메소드
	
	// 보드테이블의 자료를 삭제하는 메소드
}
