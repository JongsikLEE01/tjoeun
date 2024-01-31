package Day01;
// import 패키지명.클래스명; : 외부 클래스 포함
import java.util.Scanner;

public class Ex02_scanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 빨간색 밑줄 -> 에러, 프로그램 실행 X
		// 노란색 밑줄 -> 경고, 프로그램 실행 O
		
		// 클래스타입 객체명 = new 클래스명();
		// Scanner : 표준 입력 개체
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();	// nextInt() : 정수 하나를 입력받는 메소드
		System.out.println("a : " + a);
		// "문자열" : 큰따옴표로 묶인 데이터
		// "문자열" + 변수(숫자) -> "문자열" + "문자열(숫자)" 즉 int(숫자) 데이터는 string(문자열)으로 변환 및 연결
		
		sc.close();		// close() :  객체를 메모리에서 해제
		
		// sc.nextInt();
		// Scanner 객체는 해제 후 더 이상 입력 받을 수 없음
	}
}
