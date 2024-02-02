import java.util.Scanner;
/*
 * 1. 공의 위치가 50m~70m이면 슬기가 이김.
	2. 공의 위치가 6의 배수이면 슬기가 이김. 
	슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력
 */
public class _1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if((70 >= a && a >= 50) || (a % 6 ==0)) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
		sc.close();
	}
}