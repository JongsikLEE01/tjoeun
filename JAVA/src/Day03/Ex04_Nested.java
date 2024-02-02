package Day03;

import java.util.Scanner;

public class Ex04_Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 자격증 합격기준
		// 조건 : 4학년 이상, 60점 이상 -합격
		
		System.out.print("학년 :");
		int year = sc.nextInt();

		System.out.print("점수 :");
		int score = sc.nextInt();
		
		/*
		 * 중첩 if문, 가급적 권장하지 않고 가독성이 떨어짐
		if(year == 4) {
			if (score >= 60) {
				System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
		}else {
			System.out.println("응시자격 요건에 해당하지 않음.");
		}*/
		
		if(year >= 4 && score >= 60) {
			System.out.println("합격");
		}else if(year < 4){
			System.out.println("응시 자격에 요건에 해당하지 않음");
		}else{
			System.out.println("불합격");
		}
		
		
		
	}
}