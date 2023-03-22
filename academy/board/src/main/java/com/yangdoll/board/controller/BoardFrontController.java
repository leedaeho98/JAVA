package com.yangdoll.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yangdoll.board.service.Action;
import com.yangdoll.board.service.ActionForward;
import com.yangdoll.board.service.BoardDeleteAction;
import com.yangdoll.board.service.BoardDetailAction;
import com.yangdoll.board.service.BoardInsertAction;
import com.yangdoll.board.service.BoardListAction;
import com.yangdoll.board.service.BoardModifyAction;
import com.yangdoll.board.service.BoardModifyView;
import com.yangdoll.board.service.BoardReplyAction;
import com.yangdoll.board.service.BoardReplyView;

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
		
		Map<String, Map<String, String>> actionMap = new HashMap<>();
		
		actionMap.put("BoardList.bo", new HashMap<>());
		actionMap.get("BoardList.bo").put("one", "BoardListAction");

		
		actionMap.put("BoardInsertAction.bo", new HashMap<>());
		actionMap.get("BoardInsertAction.bo").put("one", "BoardInsertAction");
			
		actionMap.put("BoardDetailAction.bo", new HashMap<>());
		actionMap.get("BoardDetailAction.bo").put("one", "BoardDetailAction");
		
		actionMap.put("BoardDeleteAction.bo", new HashMap<>());
		actionMap.get("BoardDeleteAction.bo").put("one", "BoardDeleteAction");		
		
		actionMap.put("BoardReplyView.bo", new HashMap<>());
		actionMap.get("BoardReplyView.bo").put("one", "BoardReplyView");
		
		actionMap.put("BoardReplyAction.bo", new HashMap<>());
		actionMap.get("BoardReplyAction.bo").put("one", "BoardReplyAction");
		

		actionMap.put("BoardModify.bo", new HashMap<>());
		actionMap.get("BoardModify.bo").put("one", "BoardModifyView");
		
		actionMap.put("BoardModifyAction.bo", new HashMap<>());
		actionMap.get("BoardModifyAction.bo").put("one", "BoardModifyAction");
		
		
		actionMap.put("BoardWrite.bo", new HashMap<>());
		actionMap.get("BoardWrite.bo").put("two", "true%./board/boardAddForm.jsp");
		
		actionMap.put("BoardDelete.bo", new HashMap<>());
		actionMap.get("BoardDelete.bo").put("two", "false%./board/boardDeleteForm.jsp");

		
		if (actionMap.get(command).containsKey("one")) {
			String className ="com.yangdoll.board.service." + actionMap.get(command).get("one"); 
			Class  cls = null;
			Action action = null;
			try {
				cls = Class.forName(className);
				action = (Action) (cls.newInstance());
				forward = action.execute(req, res);
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			
			
		}
//		
		if (actionMap.get(command).containsKey("two")) {
			String[] forwardInfo = actionMap.get(command).get("two").split("%");
			forward = new ActionForward();
			forward.setRedirect(Boolean.getBoolean(forwardInfo[0]));
			forward.setPath(forwardInfo[1] );
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