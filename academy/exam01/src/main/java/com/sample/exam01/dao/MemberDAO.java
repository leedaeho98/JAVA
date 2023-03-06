package com.sample.exam01.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sample.exam01.dto.Member;

//자바와 db연결
// 쿼리 생성

// 데이터베이스에 삽입 (4개의 자료는 무조건 만들어야한다)
// C(생성)  , U(수정) , D(삭제) 는 테이블의 내용이 변한다 => void 대신 int를 쓰는게 유용하다
// S(읽기)

public class MemberDAO {
	
	public Connection getConnection() throws Exception {
		// 자바와 DB를 연결해주는 명령어
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "leedaeho", "leedaeho");
		return con;
	}
	
	//
	public int insert(Member member) throws Exception { // Create
		
		int result = 0;
		Connection con = getConnection(); // 위에서 함수를 받아 con에 넣는다
		
		// 문자열이 들어오므로 setString , 실수가 들어오면 setDouble , 정수가 들어오면 setIntager
		// 쿼리문의 ?와 매칭시키는 작업
		PreparedStatement pstmt = con.prepareStatement("insert into members values(?,?,?,?,?)"); 
		pstmt.setString(1, member.getMem_id()); pstmt.setString(2, member.getMem_pwd()); pstmt.setString(3, member.getMem_name());
		pstmt.setString(4, member.getMem_phone()); pstmt.setString(5, member.getMem_addr());
		
		result = pstmt.executeUpdate();
		
		return result;
	}
	
	public int updateOne(Member member) throws Exception { // U
		int result = 0;
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("update members set password=?, mem_name=?, phone=?, address=?   where mem_id = ?" );
		// 쿼리문의 ?와 매칭(Setting)시키는 작업(?의 개수만큼)
		pstmt.setString(1, member.getMem_id() );   
		pstmt.setString(2, member.getMem_name() );		
		pstmt.setString(3, member.getMem_phone() );   
		pstmt.setString(4, member.getMem_pwd() );
		pstmt.setString(5, member.getMem_addr() );   		
		
		result = pstmt.executeUpdate();
		
		return result;
	}
	
	
	// 한 사람만 조회
	public Member selectOne(String mem_id) throws Exception { // Read // 반환되는 타입은 List<테이블DTD클래스>, 테이블DTD클래스, int 중의 하나(95%)
		Member result = null;
		Connection con = getConnection(); 
		PreparedStatement pstmt = con.prepareStatement("select * from members where mem_id = ?"); 
		
		pstmt.setString(1, mem_id);
		ResultSet rs= pstmt.executeQuery(); // select는 무조건 excuteQuery다
		
		while( rs.next()) { // 조회한 결과가 남아 있으면
			result = new Member();
			result.setMem_id(   rs.getString("Mem_id")     );
			result.setMem_pwd(   rs.getString("Mem_pwd")    );
			result.setMem_name(    rs.getString("Mem_name")  );
			result.setMem_phone(  rs.getString("Mem_phone")   );
			result.setMem_addr(   rs.getString("Mem_addr")   );
			
		}

		return result;
	}
	
	public List<Member> selectAll() throws Exception { // Read // 반환되는 타입은 List<테이블DTD클래스>, 테이블DTD클래스, int 중의 하나(95%)
		List<Member> list = new ArrayList<>(); //몇개가 나올지 모를때 감싸주면 된다
		Connection con = getConnection(); 
		PreparedStatement pstmt = con.prepareStatement("select * from members "); 
		ResultSet rs= pstmt.executeQuery(); // select는 무조건 excuteQuery다
		
		while( rs.next()) { // 조회한 결과가 남아 있으면
			Member member = new Member();
			member = new Member();
			member.setMem_id(   rs.getString("Mem_id")     );
			member.setMem_pwd(   rs.getString("Mem_pwd")    );
			member.setMem_name(    rs.getString("Mem_name")  );
			member.setMem_phone(  rs.getString("Mem_phone")   );
			member.setMem_addr(   rs.getString("Mem_addr")   );
			
			list.add(member);
		}

		return list;
	}
	
	
	public int deleteOne(String mem_id) throws Exception { // Delete
		int result = 0;
		Connection con = getConnection(); 
		PreparedStatement pstmt = con.prepareStatement("delete from members where mem_id = ?"); 
		pstmt.setString(1, mem_id);
		result = pstmt.executeUpdate();
		return result;
	}

			
}


