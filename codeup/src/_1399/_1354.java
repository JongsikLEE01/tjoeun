package _1399;

import java.util.Scanner;

public class _1354 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=a; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}