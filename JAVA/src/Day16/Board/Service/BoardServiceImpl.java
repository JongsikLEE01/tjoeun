package Day16.Board.Service;

import java.util.List;

import Day16.Board.DAO.BoardDAO;
import Day16.Board.DTO.Board;

// 게시판 기능 - 비지니스 로직 클래스
// 게시판 인터페이스의 기능을 구현
public class BoardServiceImpl implements BoardService {
	
	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<Board> list() {
		// 1. DAO 객체의 게시글 목록 요청
		List<Board> boardList = boardDAO.list();
		// 2. 게시글 목록 데이터 가공
		
		// 3. 게시글 목록 반환
		return boardList;
	}

	@Override
	public Board select(int no) {
		Board board = boardDAO.select(no);		// 게시글 번호에 대한 게시글 정보 데이터 요청
		// 조회수 증가 로직 작성 등... 기능 추가
		return board;							// 2. 게시글 정보 반환
	}

	@Override
	public int insert(Board board) {
		int result = boardDAO.insert(board);	// 게시글 정보를 전달해 게시글 데이터 등록 요청
		// 등록된 데이터 건수 반환
		// 결과 : 1 -> 등록 실패
		//		 0 -> 등록 성공
		return result;		// if(tesult > 0 )	포인트추가같은 로직 작성 가능
	}

	@Override
	public int update(Board board) {
		int result = boardDAO.update(board); // 게시글 정보를 전달해 게시글 데이터 수정 요청
		// 적용된 데이터 건수 반환
		// 결과 : 1 -> 수정 실패
		//		 0 -> 수정 성공
		return result;
	}

	@Override
	public int delete(int no) {
		int result = boardDAO.delete(no);	// 게시글 정보를 전달해 게시글 데이터 삭제 요청
		// 적용된 데이터 건수 반환
		// 결과 : 1 -> 삭제 실패
		//		 0 -> 삭제 성공
		return result;
	}
}