package Day04;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		//1. 정수를 받아 저장 및 변수에 대입
		//2. n번 반복하여 n개의 정수를 입력받음
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			// 3. 입력받은 n개 정수를 배열 arr에 저장
			arr[i] = sc.nextInt();
			// 4. 배열을 반복해 최소값 변수 min와 i번째 배열 요소를 비
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		// 6. 반복 종료 후 변수 min를 출력
		System.out.println(min);
		sc.close();
	}
}