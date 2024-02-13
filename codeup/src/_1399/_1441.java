package _1399;

import java.util.Scanner;

public class _1441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n]; 
		int temp;
		// 입력
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		// 버블 정렬 : 서로 이웃한 데이터를 비교해 정렬
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if(a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
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