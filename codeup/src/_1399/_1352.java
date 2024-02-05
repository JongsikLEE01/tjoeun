package _1399;

import java.util.Scanner;

public class _1352 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; a >= i; i++) {
			for(int j=1; j >= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
