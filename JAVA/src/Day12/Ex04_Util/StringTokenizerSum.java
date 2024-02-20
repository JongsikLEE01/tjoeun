package Day12.Ex04_Util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {
	// "1,2,3,4,5" 
	// "," -분리-> 1 2 3 4 5(문자열)
	// 토큰을 int타입으로 변환해 합계를 구함
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		// 토큰화
		StringTokenizer st = new StringTokenizer(input, ",");
		int sum=0;

		// 분리 및 합계
		// hasMoreTokens() : 토큰이 남지 않을경우 false 반환
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			sum += Integer.parseInt(token);
		}
		
		
		System.out.println("sum : "+sum);
		sc.close();
	}
}