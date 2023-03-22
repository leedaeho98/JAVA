package com.yangdoll.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.yangdoll.board.dao.BoardDAO;
import com.yangdoll.board.dao.BoardDAOImpl;
import com.yangdoll.board.vo.BoardVO;

public class BoardInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		String realFolder = "";
		String saveFolder = "fileupload";
		int fileSize = 5*1024*1024;
		realFolder = request.getRealPath(saveFolder);
		System.out.println("====BoardInsertAction.java=== saveFolder=> " + saveFolder + ",실제 물리적 폴더 : " +realFolder);
		
		
		BoardDAO dao = new BoardDAOImpl();
		// 입력폼에서 넘어온 자료를 request객체를 이용해서 받는다.
		MultipartRequest mpr = new MultipartRequest ( request,
													  realFolder,
													  fileSize,
													  "utf-8",
													  new DefaultFileRenamePolicy()
													  );
		BoardVO vo = new BoardVO();
		vo.setBoardContent(mpr.getParameter("boardContent")); // vo.setBoardContent(request.getParameter("boardContent"); )
		vo.setBoardFile(mpr.getFilesystemName((String)mpr.getFileNames().nextElement())  );
		vo.setBoardSubject(mpr.getParameter("boardSubject"));
		vo.setBoardPass(mpr.getParameter("boardPass"));
		vo.setBoardName(mpr.getParameter("boardName"));
		vo.setBoardNum(dao.getMaxNum()+1);
		
		int result = dao.insertBoard(vo);
		if ( result != 1) { // 1이 아니라면
			System.out.println("=== 게시글 등록 실패 ===");
			return null;
		}
		forward.setRedirect(true);
		forward.setPath("./BoardList.bo");
		
		return forward;
	}

}
