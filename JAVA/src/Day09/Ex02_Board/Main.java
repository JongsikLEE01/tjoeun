package Day09.Ex02_Board;

import java.util.Scanner;
// BoardAccess메소드를 실행
public class Main {
	public static void main(String[] args) {
		BoardInterface boardInterface = new BoardAccess();
		Scanner sc = new Scanner(System.in);
		int menuNo;
		do {
			System.out.println("==========게시글==========");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 :");
			menuNo = sc.nextInt();
			sc.nextLine();	// 엔터를 입력버퍼에서 제거
			
			switch (menuNo) {
			case 1:		// 게시글 목록
				Board[] boardList = boardInterface.list();
				for (Board board : boardList) {
					System.out.println(board);
				}
				break;	
			case 2:		// 게시글 등록
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("작성자 : ");
				String writer = sc.nextLine();
				System.out.print("내용 : ");
				String content = sc.nextLine();				
				
				Board board = new Board(title, writer, content);
				Board createBoard = boardInterface.create(board);
				
				if(createBoard != null) {
					System.out.print("생성된 게시글 정보 : ");
					System.out.println(createBoard);
				}
				break;
			case 3:		// 게시글 조회
				System.out.print("조회할 글 번호 : ");
				int no =  sc.nextInt();
				sc.nextLine();
				
				Board selectedBoard = boardInterface.read(no);
				if(selectedBoard != null) {
					System.out.print("조회된 게시글 정보 : ");
					System.out.println(selectedBoard);
				}
				break;
			case 4:		// 게시글 수정
				System.out.print("수정할 글 번호 : ");
				int updatenum =  sc.nextInt();
				sc.nextLine();
				
				System.out.print("제목 : ");
				String updtitle = sc.nextLine();
				System.out.print("작성자 : ");
				String updwriter = sc.nextLine();
				System.out.print("내용 : ");
				String updcontent = sc.nextLine();	
					
				Board updboard = new Board(updtitle, updwriter, updcontent);
				updboard.setNo(updatenum);		// 게시글 번호 지정
				int result = boardInterface.update(updboard);
				
				if(result > 0) {
					System.out.println("게시글 수정 완료...");
				}else {
					System.err.println("게시글 수정 실패...");
				}
				break;
			case 5:		// 게시글 삭제
				System.out.print("삭제할 글 번호 : ");
				int deleteNo = sc.nextInt();
				sc.nextLine();
				
				result = boardInterface.delete(deleteNo);
				if(result > 0) {
					System.out.println("게시글 삭제 완료...");
				}else {
					System.err.println("게시글 삭제 실패...");
				}
				break;
			default:
				break;
			}
		}while(menuNo != 0);
		System.out.println("프로그램 종료....");
		sc.close();
	}
}