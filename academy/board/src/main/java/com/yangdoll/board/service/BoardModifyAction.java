package com.yangdoll.board.service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.vo.BoardVO;

public class BoardModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		String boardPass = request.getParameter("boardPass");
		BoardDAO dao = new BoardDAOImpl();
		// 비밀번호가 일치하는지 확인하는 작업(권한 없는 사용자가 변경할 수 없도록)
		boolean userCheck = dao.isBoardWriterCheck(boardNum, boardPass);
		if( !userCheck) { // 삭제할 권한이 없다.
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert(수정할 권한이 없습니다');");
			out.println("location.href='./BoardList.bo'"); 
			out.println("<script>");
			return null;
		}
		
		BoardVO vo = new BoardVO();
		vo.setBoardNum(boardNum);
		vo.setBoardSubject(request.getParameter("boardSubject"));
		vo.setBoardContent(request.getParameter("boardContent"));
		int result = dao.updateBoard(vo);
		if( result != 1 ) {System.out.println("게시글 수정 실패!!!");}
		
		forward.setPath("./BoardList.bo");
		forward.setRedirect(true);
		return forward;
	}

}
