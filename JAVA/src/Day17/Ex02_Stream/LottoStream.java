package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LottoStream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 수>> ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("["+(i+1)+" 게임] : ");
			// int lotto[] = new int[6];
			List<Integer> lottoList = new ArrayList<Integer>();
			
			//랜덤수 6개대입
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < 6; j++) {
				int rand = (int)(Math.random()*45+1);
				
				// 중복제거 : set.add() -> 중복아니면 true, 중복이면 false반환
				if(!set.add(rand)) j--;
				
			}	// 랜덤수 6개 대입
			// 스트림을 사용하여 정렬
			lottoList = set.stream().collect(Collectors.toList());
			
			// 스트림을 사용해 정렬 + 출력
			lottoList.stream()
					  .sorted()
					  .forEach(lotto -> System.out.print(lotto+" "));
			System.out.println();
		}
		sc.close();
	}
}