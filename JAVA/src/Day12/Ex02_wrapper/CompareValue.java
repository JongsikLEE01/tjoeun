package Day12.Ex02_wrapper;

public class CompareValue {
	public static void main(String[] args) {
		Integer intObj1 =10;
		Integer intObj2 =10;
		
		// Q. intObj1 객체와 intObj2의 값이 같은가??
		// A. 10이라는 값은 같음
		// 값을 꺼내서 비교(언박싱하여 비교)
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : "+(intObj1.intValue() == intObj2.intValue()));		// true
		
		// Q. intObj1 객체와 intObj2의 레퍼런스가 같은가??
		// A. byte 범위에서는 같은 레퍼런스(인스턴스)로 생성된다.
		// byte(8bit) = (-128~127)범위에서는 같은 인스턴스로 생성한다
		System.out.println("레퍼런스로 비교");
		System.out.println("결과 : "+(intObj1 == intObj2));		// true
		
		System.out.println("equals() 비교");
		System.out.println("결과 : "+intObj1.equals(intObj2));	// true
		
		System.out.println("**********************");
		
		Integer intObj3 = 200;
		Integer intObj4 = 200;
		
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue()) );	// true
		
		System.out.println("레퍼런스로 비교");
		System.out.println("결과 : " + (intObj3 == intObj4));		// false
		
		System.out.println("equals() 비교");
		System.out.println("결과 : " + intObj3.equals(intObj4));	// true
		
		// ==, != 기호로 래퍼객체를 비교하면,
		// 아래의 범위에서는 내부의 값을 ==, != 기호로 바로 비교 가능
		// Boolean		: true, false
		// 정수 타입		: -128~127
		// char			: \u0000 ~ \u007f
	}
}