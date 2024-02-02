package Day03;

import java.util.Scanner;

public class Ex06_Grade {
	public static void main(String[] args) {
		// 학점을 입력받아 점수대를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		String grade = sc.next(); // 반환타입 (String : 문자열 참조자료형)
		
		switch (grade) {
		case "A":
			System.out.println("90~100점입니다.");
			break;
		case "B":
			System.out.println("90~80점입니다.");
			break;
		case "C":
			System.out.println("80~70점입니다.");
			break;
		case "D":
			System.out.println("70~60점입니다.");
			break;
		case "F":
			System.out.println("60점 미만 입니다.");
			break;
		default:
			System.out.println("해당 학점은 존재하지 않는 학점입니다.\n(A ~ F사이로 입력하세요)");
			break;
		};
		
		sc.close();
	}
}