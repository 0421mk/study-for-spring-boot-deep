package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.BoardDto;

public interface BoardService {
	List<BoardDto> selectBoardList() throws Exception;
	void insertBoard(BoardDto board) throws Exception;
}
