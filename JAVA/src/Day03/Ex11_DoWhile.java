package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {
	public static void main(String[] args) {
		 /* 메뉴판, 변수선언 : 메뉴번호, 이름
		 *  break : 제어문을 탈출
		 *  return 값;
		 * 1. 메모리 종료
		 * 2. 메모리 공간 해제
		 * 3. 값(메소드)를 호출한 곳으로 반환
		 */
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		int count = 0; // 주문한 메뉴 개수
		
		// 1회는 무조건 실행, 그 이후 조건을 검사해 반복
		do {
			System.out.println("***********메뉴판***********");
			System.out.println("1. 맥도날드");
			System.out.println("2. 법대생김밥");			
			System.out.println("3. 돈까스");			
			System.out.println("4. 짜장면");			
			System.out.println("5. 물만난면");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 : ");
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			
			switch (menuNo) {
			case 1:
				menuName = "맥도날드";
				break;
			case 2:
				menuName = "법대생김밥";
				break;
			case 3:
				menuName = "돈까스";
				break;
			case 4:
				menuName = "짜장면";
				break;
			case 5:
				menuName = "물만난면";
				break;
			default:
				break;
			}
			
			//메뉴 번호 유효성 검사
			if(menuNo == 0) {
				System.out.println("종료");
				System.out.println("총 "+ count + "개의 메뉴를 주문하였습니다."); // 총 개수를 출력
			}else if( menuNo <= 5){
				System.out.println(menuName + "(을/를) 먹었습니다.\n");
				++count; // 주문 성공 시 수량이 증가
			}else {
				System.out.println("존재하지 않는 메뉴 입니다.\n");
			}
			
		}while(menuNo != 0 );
		
		sc.close();
	}
}