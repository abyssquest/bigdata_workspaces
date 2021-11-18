package com.springproject.biz.board.jdbc;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO extends SqlSessionDaoSupport {
	@Override @Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	// 글 등록
	public void insert(BoardVO vo) {
		getSqlSession().insert("BoardDAO.insertBoard", vo);
	}
	
	// 글 목록 조회
	public List<BoardVO> getList(BoardVO vo) {
		if(vo.getSearchCondition().equals("TITLE")) {
			return getSqlSession().selectList("BoardVO.getBoardList_T", vo);
		}else if(vo.getSearchCondition().equals("CONTENT")) {
			return getSqlSession().selectList("BoardVO.getBoardList_C", vo);
		}else {
			return getSqlSession().selectList("BoardVO.getBoardList_T", vo);
		}
	}
	
	// 글 상세 조회
	public BoardVO getObject(int seq) {
		return getSqlSession().selectOne("BoardDAO.getBoard", seq);
	}
	
	// 글 수정
	public void update(BoardVO vo) {
		getSqlSession().update("BoardDAO.updateBoard", vo);
	}
	
	// 글 삭제
	public void delete(int seq) {
		getSqlSession().delete("BoardDAO.deleteBoard", seq);
	}
}