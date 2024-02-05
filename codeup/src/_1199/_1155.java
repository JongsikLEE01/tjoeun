package _1199;
import java.util.Scanner;
//어떤 정수가 입력되면 그 수가 7의 배수인지 확인
public class _1155 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a % 7 == 0) {
			System.out.println("multiple");
		}else {
			System.out.println("not multiple");
		}
		sc.close();
	}
}