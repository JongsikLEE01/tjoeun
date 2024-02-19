package Day12.Ex02_wrapper;

public class IntegerEx {
	public static void main(String[] args) {
		// int -> Integer :  정수 타입인 int 기본 타입을 객체화한 클래스
		// 주요 메소드 : 문자열에서 정수로 변환, 정수에서 다른 타입으로 변환
		int a = 10;
		Integer A = 100;
		
		System.out.println(Integer.parseInt("28")+2);		// 문자열 -> 정수
		System.out.println(Integer.toString(28)+2);			// 정수 -> 문자열
		System.out.println(28+"");							// 정수 -> 문자열(Integer 메소드없이)
		System.out.println(A.doubleValue()+2.5);			// 정수 -> 실수
		System.out.println(Integer.toBinaryString(28));		// 정수 -> 2진수
		System.out.println(Integer.bitCount(28));			// 2진수 1의 개수
		
		
		// deprecated? : 더 이상 사용을 권장하지 않는 문법
		// Integer u =  new Integer(111);
		// 오토 박싱(Auto Boxing)
		// 자바 5버전부터는 객체로 생성하여 사용하지 않아도 자동으로 객체를 감싸줌
		Integer i = 10; 			// 박싱 : 오토 박싱
		int value = i.intValue();	// 언 박싱
		System.out.println("객체로 생성 Integer : "+i);
		System.out.println("기본타입 int : "+value);
	}
}