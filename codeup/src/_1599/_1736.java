package _1599;
/*
 * 초를 입력받아 일 / 시 / 분 / 초의 형태로 나타내시오.
43 -----> 0 0 0 43 (0일 0시간 0분 43초)
127 -----> 0 0 2 7 (0일 0시간 2분 7초)
3600 ------> 0 1 0 0 (0일 1시간 0분 0초)
86402 ----> 1 0 0 2 (1일 0시간 0분 2초)
 */
import java.util.Scanner;

public class _1736 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int mysec = sc.nextInt(); 
		

		if(mysec < 60) {
			//초만 출력
			System.out.printf("0 0 0 %d", mysec);
		}else if(60 <= mysec && mysec < 3600) {
			// 초, 분 출력
			System.out.printf("0 0 %d %d", mysec / 60, mysec % 60);
		}else if(3600 <= mysec && mysec < 86400) {
			// 시, 분, 초 출력
			System.out.printf("0 %d %d %d", mysec / 3600, mysec / 60 % 60, mysec % 3600 % 60);
		}else {
			// 일, 시, 분, 초 출력
			System.out.printf("%d %d %d %d", mysec / 86400, mysec / 3600 % 24, mysec / 60 % 60, mysec % 86400 % 60);
		}
		
		sc.close();
	}
}