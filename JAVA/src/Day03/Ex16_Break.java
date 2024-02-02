package Day03;

import java.util.Scanner;

public class Ex16_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// true로 해두면 while문은 무한 루프가 발생
		while(true) {
			System.out.print("입력 : ");
			String str = sc.nextLine(); // 문자열을 한 줄 입력
			
			// 문자열이 비교문자열과 일치하는 여부를 알려주는 메소드(true/false)
			if(str.equals("STOP")) {
				break;				
			}
			System.out.println(">> " + str);
		}
		System.out.println("포로그램을 종료합니다.");
		sc.close();
	}
}