package Day04;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		// 첫째줄에 입력할 개수 n 입력받고 
		// 둘째줄에 n 개의 정수를 공백을 두고 입력받고
		// n개의 정수 중 최대값을 출력
		// 입력 예시(5), 90 60 70 100 55
		
		/*  순서도
		 * 1. 정수를 받아 저장 및 변수에 대입
		 * 2.  n번 반복하여 n개의 정수를 입력받음
		 * 3. 입력받은 n개 정수를 배열 arr에 저장
		 * 4. 배열을 반복해 최대값 변수 max와 i번째 배열 요소를 비교
		 * 5. 두 요소 중 더 큰 요소를 max에 대입
		 * 6. 반복 종료 후 변수 max를 출력
		 */
		// 1. 정수를 받아 저장 및 변수에 대입
		// 2.  n번 반복하여 n개의 정수를 입력받
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE; //int타입의 최소값
		
		// 3. 입력받은 n개 정수를 배열 arr에 저장
		for(int i=0;  i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 4. 배열을 반복해 최대값 변수 max와 i번째 배열 요소를 비교
		for(int i=0; i < arr.length; i++) {
			//5. 두 요소 중 더 큰 요소를 max에 대입
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		// 6. 반복 종료 후 변수 max를 출력
		System.out.print(max);
		sc.close();
	}
}