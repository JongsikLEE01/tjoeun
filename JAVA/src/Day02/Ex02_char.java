package Day02;

public class Ex02_char {
	public static void main(String[] args) {
		// 문자 데이터 : char
		// 리터럴(Literal) : 소스코드에 표기하는 데이터(숫자, 문자, 문자열 등 자료형)
		char c1 = 'A'; // 문자 리터럴은 ''(작은 따옴표)
		char c2 = 65; // 십진수는 아스키코드에 매핑된 문자
		char c3 = '\u0041'; // 유니코드로 지정
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int unicode = c1;
		// (c2 + 1)만 있는 경우 char + int이므로 더 큰 자료형은 int로 변환(캐스팅, 형 변환), 우변의 char보다 byte가 크므로 error 
		char b = (char) (c2 + 1);
		// (c2 + 1) : (char) + (int) = (int)
		// char = (char) int : 강제 형변환
		// 작은 자료형과 큰 자료형을 연산하면 그 결과는 큰 자료형으로 변환
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A의 코드값 : " + unicode);
		System.out.println("b : " + b);
	}
}