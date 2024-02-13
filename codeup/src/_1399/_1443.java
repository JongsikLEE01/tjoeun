package _1399;

import java.util.Scanner;

public class _1443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n]; 
		int temp, key;
		// 입력
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		// 삽입 정렬 : 아직 정렬되지 않은 임의의 데이터를 이미 정렬된 부분의 적정한 위치에 삽입하며 정렬
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			key=i-1;
			while(key >=0 && a[key] > temp) {
				a[key+1] = a[key];
				key--;
			}
			a[key+1] = temp;
		}
		
		// 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}