package com.yangdoll.board.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

public class BoardVO {
	private Integer boardNum;
	@NonNull
	private String boardName;
	@NonNull
	private String boardPass;
	@NonNull
	private String boardSubject;
	@NonNull
	private String boardContent;
	private String boardFile;
	private Integer boardReRef;
	private Integer boardReLev;
	private Integer boardReSeq;
	private Integer boardReadCount;
	private String boardDate;
}
