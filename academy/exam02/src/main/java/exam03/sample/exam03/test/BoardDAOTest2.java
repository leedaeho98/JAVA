package exam03.sample.exam03.test;

import java.util.List;

import exam03.sample.exam03.dao.BoardDAO;
import exam03.sample.exam03.dto.BoardVo;

public class BoardDAOTest2 {

	public static void main(String[] args) throws Exception {
		BoardDAO dao = new BoardDAO();
		
		BoardVo vo = new BoardVo();
		int result = dao.addBoard(vo); //입력
		
		BoardVo resultVo = dao.getBoard(2L); // 한 사람 조회
		
		List<BoardVo> list = dao.getAll(); // 전체 사람 조회
		}
	}


