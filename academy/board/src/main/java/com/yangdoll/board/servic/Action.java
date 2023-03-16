package com.yangdoll.board.servic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	// 모든 메소드에서 execute를 실행하도록 만들기 위해서
	ActionForward  execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
