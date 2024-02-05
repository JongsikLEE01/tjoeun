package _1399;

import java.util.Scanner;

public class _1356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i <=a; i++) { // 가로
			for(int j=1; j<=a; j++) { // 세로
				if(j==1|j==a | i==1|i==a){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}