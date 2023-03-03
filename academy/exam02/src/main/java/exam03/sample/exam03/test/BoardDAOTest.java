package exam03.sample.exam03.test;

import java.sql.Connection;

import exam03.sample.exam03.dao.BoardDAO;
import exam03.sample.exam03.dto.BoardVo;

public class BoardDAOTest {
	
	public static void main(String[] args) throws Exception {
	
	// DAO클래스가 정상적으로 잘 동작하는지 테스트 하는 프로그램
	
	// 1) 데이터베이스에 연결이 잘 되는지 테스트 한다. => 성공하면 테스트 코드는 삭제해도 된다.
	BoardDAO dao = new BoardDAO(); // 객체 생성 
	Connection con =dao.디비연결();
/*	
	if (con != null) { 
		System.out.println("데이터 베이스 연결 성공");
		
	}else {
		System.out.println("데이터 베이스 연결 실패");
	}
*/
	// 2) 입력작업이 잘 이루어지는지 텍스트 한다.
	// 2-1) 샘플용 데이터를 만든다.
	// 2-3) 결과값을 확인한다.(데이터베이스 테이블에서 눈으로 확인, 반환되는 값을 가지고 확인)
	BoardVo testBoard = new BoardVo(); // 객체생성 및 불러온다
	testBoard.setBoardNum(4);	testBoard.setTitle("테스트용 3번째 제목");		
	testBoard.setContent("이 글은 텍스트용 게시글의 내용입니다");	testBoard.setPassword("1234");
	// 2-2) 만들어진 샘플용데이터를 dao클래스의 입력메서드에 전달해서 입력을 하게 한다.
	dao.게시판입력(testBoard);
	}
}