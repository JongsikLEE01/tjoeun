package _1199;
import java.util.Scanner;
// 정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력
public class _1154 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(a-b);
		}else {
			System.out.println(b-a);
		}
		sc.close();
	}
}