package com.yangdoll.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.vo.BoardVO;

public class BoardListAction  implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		BoardDAO dao = new BoardDAOImpl();
		//데이터베이스에서 조회한 결과를 리스트에 담은 후에
		List<BoardVO> list = dao.getList();  
		// 그 리스트를 리퀘스트 영역의 속성에 저장한다음
		request.setAttribute("list", list);
		forward.setRedirect(false); //forwarding을 하도록 값을 세팅함..
		forward.setPath("./board/boardList.jsp");
		return forward;
	} //게시판 목록을 가져와서 세션역역에 담아두는 역할을 클래스

}
