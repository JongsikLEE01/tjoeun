package _1599;

import java.util.Scanner;

public class _1508 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt(); // 1. 정수 N을 입력받는다
		int arr[][] = new int[n][n]; // 2. N행 N열의 2차원 배열을 생성
		
		// 3. N번 반복하여 N개의 정수를 배열의 j+1부터 순서대로 값을 계산
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
		}
		
		// 4. 배열을 아래 반복변수 i,j로 반복한다.
		// i = ?? -> 1 ~ n-1
		// j = ?? -> 1 ~ i
		// arr[i][j] = arr[i][j-1]-a[i-1][j-1]
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i][j-1] - arr[i-1][j-1]; // 수식으로 연산, 빈칸에 대입한다
			}
		}
		
		//5.배열을 반복해 값이 있는 부분만 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}