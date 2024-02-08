package Day07.Review;

import java.util.Scanner;

/*  더조은컴퓨터아카데미에서 김조은 대리를 출장보낸다.
	이 때 출장비를 다음과 같이 지급한다
	총 537,620원 지급,
	50,000 :10장
	10,000 :3장
	5,000원 1개
	1,000원 2개
	500원 1개
	100원 1개
	10원 2개
	5원 0개
	1원 0개
	위 와 같이 입력시 큰 화폐 단위부터 계산하여 화폐매수를 출력하는 프로그램 작성
 */
public class Ex03_NumberOfCurrency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출장비 : ");
		System.out.println();
		int cur = sc.nextInt(); // 출장비
		int i = 0; // 화폐개수	
		int temp = 0; // 잔액
		
		
		i = cur / 50000;  // 화폐매수 계산
		temp = cur % 50000; // 잔액 계산
		System.out.println("50,000원 : " + i + "장"); // 출력
		i = temp / 10000;
		temp = temp % 10000;
		System.out.println("10,000원 : " + i + "장");
		i = temp / 5000;
		temp = temp % 5000;
		System.out.println("5,000원 : " + i + "장");
		i = temp / 1000;
		temp = temp % 1000;
		System.out.println("1,000원 : " + i + "장");
		i = temp / 500;
		temp = temp % 500;
		System.out.println("500원 : " + i + "개");
		i = temp / 100;
		temp = temp % 100;
		System.out.println("100원 : " + i + "개");
		i = temp / 50;
		temp = temp % 50;
		System.out.println("50원 : " + i + "개");
		i = temp / 10;
		temp = temp % 10;
		System.out.println("10원 : " + i + "개");
		i = temp / 5;
		temp = temp % 5;
		System.out.println("5원 : " + i + "개");
		i = temp / 1;
		temp = temp % 1;
		System.out.println("1원 : " + i + "개");
		
		sc.close();
	}
}