package com.yangdoll.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.vo.BoardVO;

public class BoardModifyView implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
			ActionForward forward = new ActionForward();
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			BoardDAO dao = new BoardDAOImpl();
			BoardVO vo = null;
			vo = dao.getBoard(boardNum);
			
			request.setAttribute("vo", vo);
			
			forward.setPath("./board/boardModifyForm.jsp");
			forward.setRedirect(false);
			return forward;
	}

}
