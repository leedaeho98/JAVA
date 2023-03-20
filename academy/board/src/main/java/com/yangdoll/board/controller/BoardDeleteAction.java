package com.yangdoll.board.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.service.Action;
import com.yangdoll.board.service.ActionForward;
import com.yangdoll.board.vo.BoardVO;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		// 선행 작업이 필요한가? => 번호로 조히한 후에 비밀번호를 비교해서 일치하면 삭제 그렇지 않으면 권한없음 전송
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		String boardPass = request.getParameter("boardPass");
		BoardDAO dao = new BoardDAOImpl();
		BoardVO vo = dao.getBoard(boardNum);
		System.out.println("=====>" + vo);
		String getPass = vo.getBoardPass();
		System.out.println("====>" + getPass);
		
		if (! boardPass.equals(getPass) ) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('삭제할 권한이 없습니다');");
			out.println("location.href='./BoardList.bo'");
			out.println("<script>");
			return null;
		}
		
		// 처리 작업은 무엇인가?
		int result = dao.deleteBoard(boardNum);
		if (result != 1) {
			System.out.println("게시글 삭제 실패!!!!");
			return null;
		}
		System.out.println("게시글 삭제 성공!!!");
		
		// 처리 후 응답페이지(게시글 목록보기)는 무엇인가?
		//응답페이지에서 처리 결과자료가 필요한가? 필요하면 포워딩 필요없으면 리다이렉트
		forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./BoardList.bo");
		
		return forward;
	}

}
