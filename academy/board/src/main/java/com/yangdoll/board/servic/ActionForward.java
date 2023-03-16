package com.yangdoll.board.servic;

public class ActionForward {
	private boolean isRedirect; // 포워딩을 할 것인지 리다이렉트(새로운 요청으로의 재접속)을 할것인지에 대한 정보를 담고있다
	private String path; // 다음에 수행할 경로를 담고있다
	
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
}
