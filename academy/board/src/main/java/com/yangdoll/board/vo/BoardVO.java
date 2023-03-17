package com.yangdoll.board.vo;

import java.util.Objects;

public class BoardVO {
	private int boardNum; //작성자가 입력하지 않음
    private String boardName;
    private String boardPass; 
	private String boardSubject;
    private String boardContent;
    private String boardFile ;
    
    private int boardReRef ; //작성자가 입력하지 않음
    private int boardReLev ; //작성자가 입력하지 않음
    private int boardReSeq ; //작성자가 입력하지 않음
    private int boardReadCount ; //작성자가 입력하지 않음
    private String boardDate ; //작성자가 입력하지 않음
    
    public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardPass() {
		return boardPass;
	}
	public void setBoardPass(String boardPass) {
		this.boardPass = boardPass;
	}
	public String getBoardSubject() {
		return boardSubject;
	}
	public void setBoardSubject(String boardSubject) {
		this.boardSubject = boardSubject;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardFile() {
		return boardFile;
	}
	public void setBoardFile(String boardFile) {
		this.boardFile = boardFile;
	}
	public int getBoardReRef() {
		return boardReRef;
	}
	public void setBoardReRef(int boardReRef) {
		this.boardReRef = boardReRef;
	}
	public int getBoardReLev() {
		return boardReLev;
	}
	public void setBoardReLev(int boardReLev) {
		this.boardReLev = boardReLev;
	}
	public int getBoardReSeq() {
		return boardReSeq;
	}
	public void setBoardReSeq(int boardReSeq) {
		this.boardReSeq = boardReSeq;
	}
	public int getBoardReadCount() {
		return boardReadCount;
	}
	public void setBoardReadCount(int boardReadCount) {
		this.boardReadCount = boardReadCount;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(boardContent, boardDate, boardFile, boardName, boardNum, boardPass, boardReLev, boardReRef,
				boardReSeq, boardReadCount, boardSubject);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		return Objects.equals(boardContent, other.boardContent) && Objects.equals(boardDate, other.boardDate)
				&& Objects.equals(boardFile, other.boardFile) && Objects.equals(boardName, other.boardName)
				&& boardNum == other.boardNum && Objects.equals(boardPass, other.boardPass)
				&& boardReLev == other.boardReLev && boardReRef == other.boardReRef && boardReSeq == other.boardReSeq
				&& boardReadCount == other.boardReadCount && Objects.equals(boardSubject, other.boardSubject);
	}
	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardName=" + boardName + ", boardPass=" + boardPass
				+ ", boardSubject=" + boardSubject + ", boardContent=" + boardContent + ", boardFile=" + boardFile
				+ ", boardReRef=" + boardReRef + ", boardReLev=" + boardReLev + ", boardReSeq=" + boardReSeq
				+ ", boardReadCount=" + boardReadCount + ", boardDate=" + boardDate + "]";
	}
	
}
