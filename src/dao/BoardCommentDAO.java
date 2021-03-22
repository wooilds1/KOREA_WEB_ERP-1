package dao;

import java.util.List;

import exception.AddException;
import exception.FindException;
import exception.ModifyException;
import exception.RemoveException;
import vo.BoardComment;

public interface BoardCommentDAO {
	
	//댓글작성하기
	void insert(String content, String id,int no) throws AddException;
	
	//댓글목록 불러오기
	List<BoardComment> selectAllByBoardNo(int no) throws FindException;
	
	//특정댓글 불러오기
	BoardComment selectByCmtNo(int no) throws FindException;
	
	//댓글수정하기
	void update(int no,String content) throws ModifyException;
	
	//댓글삭제하기 
	void delete(int no) throws RemoveException;

}
