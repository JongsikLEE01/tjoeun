package _1399;

import java.util.Scanner;

public class _1351 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			int result = a * i;
			System.out.println(a + "*" + i + "=" + result);
		}
		
		sc.close();
	}
}