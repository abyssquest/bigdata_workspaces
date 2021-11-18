package net.board.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
	DataSource ds;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public BoardDAO(){
		try {
			Context init = new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		} catch (NamingException e) {
			System.out.println("DB 연결 실패 : " + e);
			return;
		}
	}

	// 글등록
	public boolean boardInsert(BoardDTO board){
		
		String sql = "select max(boardNum) from mvcboard";
		int result = 0;
		int num = 0;
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}else {
				num = 1;
			}
			
			sql = "insert into mvcboard values(?,?,?,?,?,?,?,?,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, board.getBoardName());
			pstmt.setString(3, board.getBoardPass());
			pstmt.setString(4, board.getBoardSubject());
			pstmt.setString(5, board.getBoardContent());
			pstmt.setString(6, board.getBoardFile());
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 0);
			pstmt.setInt(9, 0);
			pstmt.setInt(10, 0);
			
			result = pstmt.executeUpdate();
			
			if(result == 0) {
				return false;
			}
			
			return true;
			
		} catch (SQLException e) {
			System.out.println("boardInsert 에러 : " + e);
		} finally {
			if(pstmt != null) {
				try { pstmt.close(); } 
				catch (SQLException e) { e.printStackTrace();}}
			if(con != null) {
				try { con.close(); } 
				catch (SQLException e) { e.printStackTrace();}}
		}
		
		return false;
	}
}







