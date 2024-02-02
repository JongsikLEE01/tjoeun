package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {
	public static void main(String[] args) {
		// 학생의 성적을 입력받고, 성적에 따라 학점을 출력
		// 90점 이상 A
		// 80점 이상 B
		// 70점 이상 C
		// 60점 이상 D
		// 60점 미만 F
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("학점 : A");
		}else if(score >= 80) {
			System.out.println("학점 : B");
		}else if(score >= 70) {
			System.out.println("학점 : C");
		}else if(score >= 60) {
			System.out.println("학점 : D");
		}else {
			System.out.println("학점 : F");
		}
		sc.close();
	}
}