package com.springproject.biz.board.jdbc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Method2_BoardDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	// CRUD 기능의 메서드 구현
	// 글 등록
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		
		if(vo.getSearchCondition().equals("TITLE")) {
			return mybatis.selectList("BoardDAO.getBoardList_T", vo);
		}else if(vo.getSearchCondition().equals("CONTENT")) {
			return mybatis.selectList("BoardDAO.getBoardList_C", vo);
		}else {
			return mybatis.selectList("BoardDAO.getBoardList_T", vo);
		}
		
	}
	
	// 글 상세 조회
	public BoardVO getBoard(int seq) {
		return mybatis.selectOne("BoardDAO.getBoard", seq);
	}
	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard", vo);
	}
	
	// 글 삭제
	public void deleteBoard(int seq) {
		mybatis.delete("BoardDAO.deleteBoard", seq);
	}
}