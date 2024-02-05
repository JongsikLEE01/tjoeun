package _1599;

import java.util.Scanner;

public class _1501 {
	public static void main(String[] args) {
		//숫자를 가로로 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int a = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}