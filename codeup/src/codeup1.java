import java.util.Scanner;
/*  사칙 연산 계산기 만들기
	두 정수를 입력 받아 아래와 같이 출력하시오.
	예)  3 2
		3+2=5
		3-2=1
		3*2=6
		3/2=1 
*/
public class codeup1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		
		int i =  sc.nextInt();  // 정수를 입력받을 변수 생성
		int j =  sc.nextInt();
		
		System.out.println(i + "+" + j + "=" + (i+j)); // 출력 양식에 맞춰 출력 및 연산
		System.out.println(i + "-" + j + "=" + (i-j));
		System.out.println(i + "*" + j + "=" + (i*j));
		System.out.println(i + "/" + j + "=" + (i/j));
		
		sc.close();
	}
}