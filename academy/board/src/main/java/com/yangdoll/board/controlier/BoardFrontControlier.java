package com.yangdoll.board.controlier;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.servic.Action;
import com.yangdoll.board.servic.ActionForward;
import com.yangdoll.board.servic.BoardListAction;

//@WebServlet("*.bo")
public class BoardFrontControlier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardFrontControlier() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String path = req.getContextPath();
		String command = uri.substring(path.length());
		ActionForward forward = null;

		if (command.equals("BoardList.bo")) { // 게시판에 등록된 글 목록을 보여주고자한다
			//누구에게 일을 시킬것인지
			Action action = new BoardListAction();
			
			try {
				forward = action.execute(req, res);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//다음에 처리되어야 할 내용 (포워딩유무 및 해당 페이지)이 어떤것인지
		}
		if (forward != null) {
			
		
			if (forward.isRedirect()) {
				// 리다이렉트
				res.sendRedirect(forward.getPath());
			} else {
				// 포워딩
				RequestDispatcher dispatchar = req.getRequestDispatcher(forward.getPath());
				dispatchar.forward(req, res);		
			}
		}
	}
}
