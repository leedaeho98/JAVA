package com.yangdoll.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.vo.BoardVO;

public class BoardReplyView 	implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		BoardDAO dao = new BoardDAOImpl(); // 일을 하기 위해서 객체생성
		BoardVO vo = null;
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		vo = dao.getBoard(boardNum);
		
		if (vo == null) { System.out.println("답장 페이지로의 이동 실패"); }
		//문제가 있다면 NULL로 돌아가게한다
		
		request.setAttribute("boardData", vo);
		forward = new ActionForward();
		forward.setPath("./board/boardReply.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
