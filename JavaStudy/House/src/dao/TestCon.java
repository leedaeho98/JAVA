package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import vo.DbTest;

public class TestCon implements interCon {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	// DB연결 객체
	public void conn() {
			 try {
				String loder = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "leedaeho";
				String pwd = "leedaeho";
				 
				Class.forName(loder);
				con=DriverManager.getConnection(url,id,pwd);
				System.out.println("데이타베이스에 연결되었습니다");
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		 }

	// 삽입
	@Override
	public int insert(DbTest db) {
		return 0;
	}
	
	// 삭제
	@Override
	public int delete(int DbNumber) {
		return 0;
	}
	
	// 수정
	@Override
	public int update(DbTest db) {
		return 0;
	}
	// 한개만 조회
	@Override
	public DbTest getlist(int Dbnum) {
		return null;
	}
	// 전체 조회
	@Override
	public List<DbTest> list() {
		return null;
	}

}
