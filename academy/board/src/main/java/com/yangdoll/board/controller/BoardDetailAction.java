package com.yangdoll.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.service.Action;
import com.yangdoll.board.service.ActionForward;
import com.yangdoll.board.vo.BoardVO;

public class BoardDetailAction implements Action {

	// 조회
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		System.out.println("boarnum => " +boardNum);
		BoardDAO dao = new BoardDAOImpl();
		dao.updateCount(boardNum);
		BoardVO getVo = dao.getBoard(boardNum);
		if (getVo == null) {
			System.out.println("상세보기 할 자료를 조회하지 못하여 null이 반환되었습니다");
			return null;
		}
		System.out.println("==================== 상세보기 성공"+ getVo);
		request.setAttribute("vo", getVo);
		forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./board/board_View.jsp");
		return forward;
	}

}
