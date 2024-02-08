package Day07.Review;

import java.util.Scanner;

public class Ex04_Lotto_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] lotto = new int[7];    // 실제 로또 번호
        int[] mylotto = new int[6];  // 나의 로또 번호
        int count = 0;				 // 맞은 로또 개수
        boolean bonus = false;		 // 보너스 번호 체크
        
        // 로또 번호 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random()*45)+1;
			// 중복제거
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {  // i번째와 j번째가 같을 경우 i를 감소시켜 i번째 숫자를 다시 출력
					i--;
					break; 				    // 다시 출력 후 for문을 빠져나옴
				}
			}
		}
		// 오름차순 정렬
		int temp;						    // 숫자를 정렬시킬동안 잠시 저장해둘 변수
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if(lotto[i] < lotto[j]) {  
					temp = lotto[i];	    // i가 j보다 작을경우 i -> temp,
					lotto[i] = lotto[j];  	// j -> i
					lotto[j] = temp; 		// j = tmep 
				}
			}
		}
		
        // 나의 로또 번호 입력
		System.out.print("로또 번호 6개를 입력하세요 : ");
        for(int i = 0; i < mylotto.length; i++) {
        	mylotto[i] = sc.nextInt();
        }
        
        // 배열을 돌아 번호 검사
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < mylotto.length; j++) {
				if (i < lotto.length - 1) {	// 보너스번호인 lotto[7]을 제외
					if (lotto[i] == mylotto[j]) {
						count++;			// 숫자가 맞은 경우 맞은만큼 개수 증가
					}
				} else {
					if (lotto[i] == mylotto[j]) {
						bonus = true;		// 보너스번호를 맞추지 못할 경우 bonus를 true로 바꿈
					}
				}
        	}
        }
		
		// 실제 로또 번호 출력
		System.out.print("로또 번호는 : ");
		for (int rand2 : lotto) {
			System.out.print(rand2 + " ");
		}
		System.out.println();
		
		// count 값에 맞춰 등수 출력
		System.out.print("당신의 등수는 : ");
		switch(count) {
		case 3 : 
			System.out.println("5등"); 
			break;
		case 4 : 
			System.out.println("4등"); 
			break;
		case 5 : 
			if(bonus == false) 			
				System.out.println("3등"); // 보너스를 포함해 5개를 맞출경우
			else 
				System.out.println("2등"); // 보너스를 포함하지않고 맞출 경우
			break;
		case 6 : 
			System.out.println("1등"); 
			break;
		default :
			System.out.println("꽝");
		}
		sc.close();
	}
}