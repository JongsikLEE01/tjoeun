package Day02;

import java.util.Scanner;
public class Ex09_inputOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 바로엔터(shift + enter)
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("y : ");
		int y = sc.nextInt();
		System.out.print("z : ");
		int z = sc.nextInt();

		int sum = x + y + z;
		double avg = sum / 3;
		// (double) = (int) / (int) => int형(정수자료형), 소수 부분을 표현 할 수 없음
		
		
		// 강제 형변환 : (자료형 변수)
		double realavg = (double) sum / 3; 
		double realavg2 = sum / 3.0;
		// 큰자료형 + 작은 자료형 = 큰 자료형		서로 다른 자료형 연산시 결과는 큰 자료형으로 반환
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("평균1 : " + realavg);
		System.out.println("평균 2: " + realavg2);
		
		sc.close();
	}
}