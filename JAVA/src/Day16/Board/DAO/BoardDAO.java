package Day16.Board.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Day16.Board.DTO.Board;

/*  데이터 접근 객체
 *  게시글 데이터 접근
 */
public class BoardDAO extends JDBConnection{
	// 데이터 목록
	public List<Board> list() {
		// 게시글 목록을 담을 객체 생성
		List<Board> boardList = new ArrayList<Board>();
		String sql = " select * from board ";		// sql작성
		
		try {
			stmt = con.createStatement();		// 쿼리 실행 객체 생성 -	Statement(stmt)
			rs = stmt.executeQuery(sql);		// 쿼리 실행 -> 결과 - ResultSet(rs)
			
			while(rs.next()) {		// next() : 실행 결과의 다음 데이터로 이동
				Board board =  new Board();		// 조회결과를 리스트에 추가
				
				// rs.getXXX("컬렴명") --> 해당 컬럼의 데이터를 가져온다(컬럼명의 값을 특정 데이터 타입으로 반환)
				board.setNo(rs.getInt("no"));	// 결과 데이터 가져오기
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setRegDate(rs.getTimestamp("upd_date"));
				boardList.add(board);			// 게시글 목록에 추가
			}
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 시, 예외 발생");
		}
		return boardList;	// 게시글 목록 반환
	}
	
	// 데이터 조회
	public Board select(int no) {
		Board board = new Board();					// 게시글 정보 객체 생성
		String sql = " select * from board where no=? ";		// sql작성
		
		try {
			psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성 -	prepareStatement(psmt
			
			// psmt.setXXX(순서번호, 매핑값)
			psmt.setInt(1, no);	// ?(1) <-- no글번호
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {		// next() : 실행 결과의 다음 데이터로 이동
				// rs.getXXX("컬렴명") --> 해당 컬럼의 데이터를 가져온다(컬럼명의 값을 특정 데이터 타입으로 반환)
				board.setNo(rs.getInt("no"));	// 결과 데이터 가져오기
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setRegDate(rs.getTimestamp("upd_date"));
			}
		} catch (SQLException e) {
			System.err.println("게시글 조회 시, 예외 발생");
		}
		return board;	// 게시글 정보 1건 반환
	}
	
	// 데이터 등록
	public int insert(Board board) {
		int result =0;		// 결과 : 적용된 데이터 건수
		String sql = " INSERT INTO board (title, writer, content) VALUES (?, ?, ?) ";
		
		try {
			psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성
			psmt.setString(1, board.getTitle());	// 1~3 ?에 제목, 작성자, 내용 매핑
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			
			result = psmt.executeUpdate();			// sql 실행요청 성공시 1, 실패시0
			// executeUpdate() : SQL문을 실행, 적용된 데이터 개수를 int로 반환
		} catch (SQLException e) {
			System.err.println("게시글 등록 시, 예외 발생");
			e.printStackTrace();
		}
		return result;
	}
	
	// 데이터 수정
	public int update(Board board) {
		int result =0;		// 결과 : 적용된 데이터 건수
		String sql = " UPDATE board SET title = ?, writer = ?, content = ?, upd_date = now() WHERE no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성
			psmt.setString(1, board.getTitle());	// 1~3 ?에 제목, 작성자, 내용 매핑
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			psmt.setInt(4, board.getNo());
			
			result = psmt.executeUpdate();			// sql 실행요청 성공시 1, 실패시0
			// executeUpdate() : SQL문을 실행, 적용된 데이터 개수를 int로 반환
		} catch (SQLException e) {
			System.err.println("게시글 수정 시, 예외 발생");
			e.printStackTrace();
		}
		return result;
	}
	
	// 데이터 삭제
	public int delete(int no) {
		int result =0;		// 결과 : 적용된 데이터 건수
		String sql = " DELETE FROM board WHERE no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성
			psmt.setInt(1, no);
			
			result = psmt.executeUpdate();			// sql 실행요청 성공시 1, 실패시0
			// executeUpdate() : SQL문을 실행, 적용된 데이터 개수를 int로 반환
		} catch (SQLException e) {
			System.err.println("게시글 삭제 시, 예외 발생");
			e.printStackTrace();
		}
		return result;
	}
}
