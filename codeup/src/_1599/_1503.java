package _1599;

import java.util.Scanner;

public class _1503 {
	// 가로로 지그재그 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] b = new int[n][n];
		int a =1;
		
		for (int i = 0; i < n; i++) {
			//홀수행 정상 출력
			if(i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					b[i][j]=a++;
				}
			}
			//짝수행 역순 출력
			else if(i % 2 !=0) {
				for (int j = n-1; j >= 0; j--) {
					b[i][j]=a++;
				}
			}
			
			//출력
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}