package Day07.Review;

import java.util.Scanner;

public class Ex06_Matrix {
	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.
		// (입력 예시)
		// M : 2
		// N : 3
		// 1 2 3
		// 4 5 6
		// (출력 예시)
		// 1 2 3
		// 4 5 6
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
		System.out.print("N : ");
		int N = sc.nextInt();
		int arr[][] = new int[M][N];
		
		
		//n차원 배열은 n차 반복문으로 접근
		// 2차원 기준 바깥쪽 반복문, 반복변수는 i, 행
		// 2차원 기준 안쪽 반복문, 반복변수는 j, 열
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		//foreach으로 배열 출력
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}