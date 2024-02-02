package Day03;

public class Ex09_WhileSum {
	public static void main(String[] args) {
		//1~100까지의 합계 (값 : 5050)
		int a= 1;
		int sum = 0;
		
		while(a <= 100) {
			sum += a++;
		}
		System.out.println("합계 : "+ sum);
	}
}