package _1199;

import java.util.Scanner;

public class _1226 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[7];
        int[] mylotto = new int[6];
        int count = 0;
        boolean bonus = false;
        // 값 입력
        for(int i = 0; i < lotto.length; i++) {
        	lotto[i] = sc.nextInt();
        }
        for(int i = 0; i < mylotto.length; i++) {
        	mylotto[i] = sc.nextInt();
        }
        
        // 배열을 돌아 번호 검사
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < mylotto.length; j++) {
				if (i < lotto.length - 1) {
					if (lotto[i] == mylotto[j]) {
						count++;
					}
				} else {
					if (lotto[i] == mylotto[j]) {
						bonus = true;
					}
				}
        	}
        }
		// count 값에 맞춰 등수 출력
		switch(count) {
		case 3 : 
			System.out.println("5"); 
			break;
		case 4 : 
			System.out.println("4"); 
			break;
		case 5 : 
			if(bonus == false) 
				System.out.println("3");
			else 
				System.out.println("2");
			break;
		case 6 : 
			System.out.println("1"); 
			break;
		default :
			System.out.println("0");
		}
		sc.close();
	}
}