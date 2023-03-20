package com.yangdoll.board.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yangdoll.board.service.Action;
import com.yangdoll.board.service.ActionForward;
import com.yangdoll.board.service.BoardInsertAction;
import com.yangdoll.board.service.BoardListAction;

public class BoardFrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public BoardFrontController() {
		super();
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
		int pos = uri.lastIndexOf("/");
		String command = uri.substring(pos + 1);
		ActionForward forward = null;

		if (command.equals("BoardList.bo")) { // 게시판의 목록을 보고 싶다.
			Action action = new BoardListAction();

			try {
				forward = action.execute(req, res);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("BoardInsertAction.bo")) { // 게시판의 목록을 보고 싶다.
			// 누구에게 일을 시킬 것인지....
			Action action = new BoardInsertAction();

			try {
				forward = action.execute(req, res);

			} catch (Exception e) {

				e.printStackTrace();
			}

		} else if (command.equals("BoardWrite.bo")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./board/boardAddForm.jsp");
		} else if (command.equals("BoardDetailAction.bo")) {
			System.out.println("==========상세한 내용 보기를 클릭==========");
			Action action = new BoardDetailAction();
			try {
				forward = action.execute(req, res);

			} catch (Exception e) {

				e.printStackTrace();
			}
			
		} else if (command.equals("BoardDelete.bo")) { // 게시글 삭제 =>
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./board/boardDeleteForm.jsp");
		} else if (command.equals("BoardDeleteAction.bo")) {
			Action action = new BoardDeleteAction();
		}
		if (forward != null) {

			if (forward.isRedirect()) {
				res.sendRedirect(forward.getPath());

			} else {
				RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath());
				dispatcher.forward(req, res);

			}
		}
	}

}