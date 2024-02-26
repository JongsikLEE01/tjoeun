package Day17.Ex02_Stream;

import java.util.Scanner;

public class LottoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 수>> ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("["+(i+1)+" 게임] : ");
			int lotto[] = new int[6];
			
			//랜덤수 6개대입
			for (int j = 0; j < 6; j++) {
				int rand = (int)(Math.random()*45+1);
				lotto[j]=rand;
				
				// 중복제거
				for (int k = 0; k < j; k++) {
					if(rand == lotto[k]) {
						j--;
						break;
					}
				}
			}	// 랜덤수 6개 대입
			
			// 정렬
			for (int j = 0; j < lotto.length; j++) {
				for (int k = j+1; k < lotto.length; k++) {
					// 앞의 요소가 더 크면 교환
					if(lotto[j] > lotto[k]) {
						int temp = lotto[j];
						lotto[j] = lotto[k];
						lotto[k] = temp;
					}
				}
			}
			// 출력
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j]+" ");	
			}
			System.out.println();
		}
		sc.close();
	}
}