import java.util.Scanner;
// 어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력
public class _1156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		sc.close();
	}
}