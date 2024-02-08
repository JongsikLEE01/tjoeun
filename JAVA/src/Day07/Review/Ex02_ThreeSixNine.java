package Day07.Review;

public class Ex02_ThreeSixNine {
	public static void main(String[] args) {
		// 정수 1~100까지 반복, 해당수가 3또는 6또는 9가 될때
		// 369의 개수만큼 정수 대신 "*"출력
		
		// 1. 정수를 1~100까지 출력
		for (int i = 1; i <= 100; i++) {
			// 2. 해당 수가 369가 몇개 인지 판단 및 출력(십의자리와 일의자리)
			int a = i / 10; //10
			int b = i % 10; //1
			boolean one = b == 3 || b ==6 || b==9;
			boolean ten = a == 3 || a ==6 || a==9;
			
			if(ten && one) {
				System.out.println("**");
			}else if(ten || one){
				System.out.println("*");
			}else {
				System.out.println(i);
			}
			
		}
	}
}