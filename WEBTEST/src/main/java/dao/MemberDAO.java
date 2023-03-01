package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import dto.Member;
public class MemberDAO {
	// DB와 자바 연결
	public Connection getConnection () throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩작업
		return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","leedaeho","leedaeho");
		}
	
	// 입력
	// 1. 수행결과로 Int 타입의 값을 반환합니다.
	// 2. SELECT 구문을 제외한 다른 구문을 수행할 때 사용되는 함수입니다.
	public int insert(Member member) throws Exception {
		int result = 0;
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?,?,?)");
		pstmt.setString(1, member.getMem_id() ); pstmt.setString(2, member.getMem_pwd() );
		pstmt.setString(3, member.getMem_name() ); pstmt.setString(4, member.getMem_phone() );
		pstmt.setString(5, member.getMem_addr() );
		result = pstmt.executeUpdate(); // 
		return result;
	}
		
	// 수정
	public int updateOne(Member member) throws Exception {
		int result = 0;
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("update members set mem_id = ?, mem_pwd = ?, mem_name , mem_phone = ? , mem_addr = ? ");
		pstmt.setString(1, member.getMem_id() ); pstmt.setString(2, member.getMem_pwd() );
		pstmt.setString(3, member.getMem_name() );
		result = pstmt.executeUpdate();
		return result;
	}
		
	// 삭제
	public int deleteOne(String mem_id) throws Exception {
		int result = 0;
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from members where mem_id = '?' ");
		pstmt.setString(1, mem_id);
		result = pstmt.executeUpdate();
		
		return result;
	}
	
	// 조회
	// 1. 수행결과로 ResultSet 객체의 값을 반환합니다.
	// 2. SELECT 구문을 수행할 때 사용되는 함수입니다.
	public List<Member> selectAll() throws Exception{
		List<Member> list = new ArrayList<Member>();
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from members ");
		ResultSet rs = pstmt.executeQuery(); 
		while (rs.next()) {// 조회한 결과가 남으면
		Member member = new Member();
		member = new Member();
		member.setMem_id(rs.getString("mem_id"));
		member.setMem_pwd(rs.getString("mem_pwd"));
		member.setMem_name(rs.getString("mem_name"));
		member.setMem_phone(rs.getString("mem_phone"));
		member.setMem_addr(rs.getString("mem_addr"));
		list.add(member); // 리스트안에 멤버를 추가한다
		}
		return list;
	}
		
}
