package Day03;

import java.util.Scanner;

public class Ex15_Continue {
	public static void main(String[] args) {
		//5개 정수를 입력 받아 수 중 양수의 합만 구하여 출력
		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1 + "번 숫자를 입력하세요 : ");
			int n = sc.nextInt();
			if(n < 0) {
				continue;
			}
			sum += n;
		}
		System.out.println("양수의 합 : " + sum);
		sc.close();
	}
}