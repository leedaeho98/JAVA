package com.yangdoll.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.vo.BoardVO;

public class BoardReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		BoardDAO dao = new BoardDAOImpl(); // 객체 생성
		BoardVO vo = new BoardVO(); // 객체 생성 
		
		vo.setBoardNum( Integer.parseInt(request.getParameter("boardNum")) );
		vo.setBoardReRef( Integer.parseInt(request.getParameter("boardReRef")) );
		vo.setBoardReLev( Integer.parseInt(request.getParameter("boardReLev")) );
		vo.setBoardReSeq( Integer.parseInt(request.getParameter("boardReSeq")) );
		vo.setBoardSubject(request.getParameter("boardSubject"));
		vo.setBoardContent(request.getParameter("boardContent"));
		vo.setBoardName(request.getParameter("boardName"));
		vo.setBoardPass (request.getParameter("boardPass"));
		
		int result = dao.boardReply(vo);
		if (result != 1) {System.out.println("답변글 작성 등록 실패!!!");
		}
		forward.setPath("./BoardList.bo");
		forward.setRedirect(true);
		 return forward;
	}

}
