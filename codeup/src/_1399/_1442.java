package _1399;

import java.util.Scanner;

public class _1442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n]; 
		int temp;
		// 입력
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		// 선택정렬 : 가장 작거나 큰 데이터를 찾아 데이터의 가장 앞이나 뒤와 교환
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}