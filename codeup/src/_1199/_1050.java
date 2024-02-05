package _1199;

import java.util.Scanner;
//  두 수를 입력 받아 같으면 1, 아니면 0을 출력

public class _1050 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();		
		
		if(i == j) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		sc.close();
	}
}