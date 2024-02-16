package Day11.Ex07_Lang;

import java.util.Iterator;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.PI);			// 3.141592653589793 (원주율)
		System.out.println(Math.ceil(3.125));	// 올림 : 해당 수보다 큰 정수 중 가장 작은 수
		System.out.println(Math.floor(3.75));	// 내림 : 해당 수보다 작은 정수 중 가장 큰 수
		System.out.println(Math.sqrt(9));		// 제곱근(루트)
		System.out.println(Math.pow(3, 2));		// 3의 2제곱
		System.out.println(Math.exp(2));		// e(자연상수)의 2승
		System.out.println(Math.round(3.14));	// 반올림
		
		
		System.out.println("---------------");
		
		// 로또 번호 6/45
		// [1,45] 사이의 정수형 난수 6개 만들기
		// Math.random()					: 0.0 보다 크거나 같고 1.0 보다 작은 임의의 실수
		// Math.random()					: 0.xxx ~ 0.9xx
		// (0.xxx ~ 0.9xx) * 10 			: 0.xxx ~ 9.xxx  (0 ~ 9) -  10 개
		// (0.xxx ~ 0.9xx) * 20 			: 0.xxx ~ 19.xxx (0 ~ 19) -  20 개
		// (0.xxx ~ 0.9xx) * 45 			: 0.xxx ~ 44.xxx
		// (0.xxx ~ 0.9xx) * 45 + 1 		: 1.xxx ~ 45.xxx
		// (int)(Math.random() * 45 + 1) 	: 1 ~ 45
		
		// [공식]
		// (int)(Math.random() * [개수] + [시작숫자] ) 
		int lotto[] = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			// 중복 제거
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		//오름차순 정렬
		int temp;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if(lotto[i] < lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}