package com.yangdoll.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.vo.BoardVO;

public class BoardInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		BoardDAO dao = new BoardDAOImpl();
		// 입력폼에서 넘어온 자료를 request객체를 이용해서 받는다.
		String boardName = request.getParameter("boardName"); 
		String boardPass = request.getParameter("boardPass"); 
		String boardSubject = request.getParameter("boardSubject"); 
		String boardContent = request.getParameter("boardContent"); 
		String boardFile = request.getParameter("boardFile");  // 입력폼 자료 여기까지
		BoardVO vo = new BoardVO();
		vo.setBoardContent(boardContent); // vo.setBoardContent(request.getParameter("boardContent"); )
		vo.setBoardSubject(boardSubject);
		vo.setBoardName(boardName);
		vo.setBoardPass(boardPass);
		vo.setBoardFile(boardFile);
		vo.setBoardNum(dao.getMaxNum()+1);
		
		int result = dao.insertBoard(vo);
		if ( result != 1) { // 1이 아니라면
			System.out.println("=== 게시글 등록 실패 ===");
			return null;
		}
		forward.setRedirect(true);
		forward.setPath("./BoardList.bo");
		
		return forward;
	}

}
