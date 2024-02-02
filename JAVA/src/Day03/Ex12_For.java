package Day03;

public class Ex12_For {
	public static void main(String[] args) {
		//for(초기식; 조건식; 증감식) { 실행문 }
		// 실행순서 : 초기식 > 반복(조건식 > 실행문 > 증감식)
		
		// 1~10 출력
		for(int i = 1; i <= 10; ++i) {
			System.out.print(i+" ");
		}
		System.out.println("\n******************");
		
		// 50~100 출력
		for(int i = 50; i <= 100; ++i) {
			System.out.print(i+" ");
		}
		System.out.println("\n******************");
		
		// 1~20중 짝수만 출력
		for(int i = 1; i <= 20; ++i) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n******************");
		
		// 1~20중 홀수만 출력
		for(int i = 1; i <= 20; ++i) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n******************");
		
	}
}