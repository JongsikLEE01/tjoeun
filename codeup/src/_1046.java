import java.util.Scanner;
// 정수 3개를 입력 받아 합과 평균(소수점 첫째자리까지)을 출력

public class _1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		int sum = i+j+k;
		double avg = (double)(sum / 3.0);
		
		System.out.println(sum);
		System.out.println(String.format("%.1f",avg));
		sc.close();
	}
}