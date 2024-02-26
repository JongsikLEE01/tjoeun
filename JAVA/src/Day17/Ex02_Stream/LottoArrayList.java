package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 수>> ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("["+(i+1)+" 게임] : ");
			// int lotto[] = new int[6];
			ArrayList<Integer> lottoList = new ArrayList<Integer>();
			
			//랜덤수 6개대입
			for (int j = 0; j < 6; j++) {
				int rand = (int)(Math.random()*45+1);
				// lotto[j]=rand;
				
				// 중복제거
				if(lottoList.contains(rand)) {
					j--;
				}else {
					lottoList.add(rand);					
				}
			}	// 랜덤수 6개 대입
			// 정렬
			Collections.sort(lottoList);
			// 출력
			for (Integer lotto : lottoList) {
				System.out.print(lotto+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}