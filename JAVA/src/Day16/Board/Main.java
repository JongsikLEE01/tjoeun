package Day16.Board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import Day16.Board.DTO.Board;
import Day16.Board.Service.BoardService;
import Day16.Board.Service.BoardServiceImpl;

public class Main {
	// 필요한 객체 생성
	static List<Board> boardList = null;	// 게시글 목록
	static BoardService boardService = new BoardServiceImpl();	// 비니지스 로직 계층의 객체 생성(기능 호출)
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("======== 게시판 ========");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 종료");
		System.out.print("입력>> ");
	}
	
	public static void printAll(List<Board> list) {
		// 글 목록이 존재하는지 확인
		if(list == null || list.isEmpty()) {
			System.err.println("조회된 글이 없습니다.");
			return;
		}
		
		for (Board board : list) {
			print(board);
		}
	}
	
	public static void print(Board board) {
		if(board == null) {
			System.err.println("조회할 수 없는 게시글 입니다.");
			return;
		}
		
		int no = board.getNo();
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date updDate = board.getUpdDate();
		
		//날짜 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM//dd - HH:mm:ss");
		String reg = sdf.format(regDate);
		String upd = sdf.format(updDate);
		
		System.out.println("==================");
		System.out.println("* 글번호 : "+no);
		System.out.println("* 제목 : "+title);
		System.out.println("* 작성자 : "+writer);
		System.out.println("==================");
		System.out.println("* 내용 : "+content);
		System.out.println("* 등록일자 : "+regDate);
		System.out.println("* 수정일자 : "+updDate);
		System.out.println("=================");
		System.out.println();
	}
	
	public static void list() {
		System.out.println("===== 게시글 목록 조회 =====");
		boardList = boardService.list();
		printAll(boardList);
	}
	
	public static void select() {
		System.out.println("===== 게시글 조회 =====");
		System.out.print("조회할 글 번호>> ");
		int no = sc.nextInt();
		sc.nextLine();
		// no를 전달해 게시글 정보 데이터 요청
		Board board = boardService.select(no);
		// 게시글 정보 출력
		print(board);
	}
	
	public static void insert() {
		System.out.println("===== 게시글 등록 =====");
		Board board = input();
		
		// 게시글 등록 요청
		int result =  boardService.insert(board);
		if(result > 0) {
			System.out.println("게시글이 등록되었습니다.");
		}else {
			System.out.println("게시글이 등록이 실패했습니다.");
		}
	}
	
	public static void update() {
		System.out.println("===== 게시글 수정 =====");
		System.out.print("* 글 번호 : ");
		int no =  sc.nextInt();
		
		Board board = input();
		board.setNo(no);
		
		int result =  boardService.update(board);
		if(result > 0) {
			System.out.println("게시글이 수정되었습니다.");
		}else {
			System.out.println("게시글이 수정이 실패했습니다.");
		}
	}
	
	public static void delete() {
		System.out.println("===== 게시글 삭제 =====");
		System.out.print("* 글 번호 : ");
		int no =  sc.nextInt();

		int result =  boardService.delete(no);
		if(result > 0) {
			System.out.println("게시글이 삭제되었습니다.");
		}else {
			System.out.println("게시글이 삭제에 실패했습니다.");
		}
	}
	
	public static Board input() {
		
		System.out.println("* 제목 : ");
		String title = sc.nextLine();
		System.out.println("* 작성자명 : ");
		String writer = sc.nextLine();
		System.out.println("* 내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(title, writer, content);
		return board;
	}
	
	public static void main(String[] args) {
		// 1. 게시글 목록
		// 2. 게시글 조회
		// 3. 게시글 등록
		// 4. 게시글 수정
		// 5. 게시글 삭제
		// 0. 종료
		int menuNo = 0;
		
		do {
			// 메뉴판
			menu();
			
			// 번호 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			if(menuNo == 0) {
				System.out.println("게시판을 종료합니다.");
				break;
			}
			
			// 번호 별 로직
			switch (menuNo) {
			case 1:	// 게시글 목록
				list();
				break;
			case 2: // 게시글 조회
				select();
				break;
			case 3:	// 게시글 등록
				insert();
				break;
			case 4: // 게시글 수정
				update();
				break;
			case 5: // 게시글 삭제
				delete();
				break;
			}
			
		}while(true);
	}
}