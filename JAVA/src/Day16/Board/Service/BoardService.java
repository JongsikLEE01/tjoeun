package Day16.Board.Service;

import java.util.List;
import Day16.Board.DTO.Board;
/*
 * 게시판 인퍼페이스기능
 * 목록
 * 조회
 * 등록
 * 삭제
 * 수정
 */
public interface BoardService {
	// 게시글 목록
	List<Board> list();
	
	// 게시글 조회
	Board select(int no);
	
	// 게시글 등록
	int insert(Board board);
	
	// 게시글 삭제
	int update(Board board);
	
	// 게시글 수정
	int delete(int no);
}