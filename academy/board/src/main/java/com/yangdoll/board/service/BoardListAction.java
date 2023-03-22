package com.yangdoll.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.vo.BoardVO;

public class BoardListAction  implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		int pageSize = 20; // 페이지당 나타낼 수 있는 게시글의 개수가 최대 20개이다
		int page = request.getParameter("page") == null ? 1: Integer.parseInt(request.getParameter("page")); 
		int pageLast = page * pageSize;
		int pageStart = pageLast - pageSize+1; 
		// DB한테 일을 시킨다
		BoardDAO dao = new BoardDAOImpl();
		//데이터베이스에서 조회한 결과를 리스트에 담은 후에
		int boardCount = dao.getCount();
		List<BoardVO> list = dao.getList(pageStart, pageLast);  
		// 데이터베이스에서 넘어온 결과물을 jsp파일에서 사용하기 위해 특정영역에 속성으로 저장한다
		int beginPage = (int)(Math.ceil(page / 10.0));
		// (int)(page/10.0 + 0.999999) <= 1~10까지의 페이지일 경우 1이 나와야 하고, 11~20페이지일 경우는 2가 나오고....
		int endPage = beginPage + 9;
		int lastPage = (int)(Math.ceil(dao.getCount() / ((double)pageSize) ) );
		if (endPage > lastPage) {
			endPage = lastPage;
		}
		
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("beginPage", beginPage);
		request.setAttribute("endPage", endPage);
		forward = new ActionForward();
		forward.setRedirect(false); //forwarding을 하도록 값을 세팅함..
		forward.setPath("./board/boardList.jsp");
		return forward;
	} //게시판 목록을 가져와서 세션역역에 담아두는 역할을 클래스

}
