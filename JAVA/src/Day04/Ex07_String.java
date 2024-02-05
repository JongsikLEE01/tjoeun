package Day04;

public class Ex07_String {
	public static void main(String[] args) {
		// String는 참조 자료형, 문자열 한글자씩 비교시 equals()를 사용해야함
		// 문자열 리터럴 저장
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		// 문자열 객체 생성
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a == c : " + (a==c)); 			// true
		System.out.println("a == d : " + (a==d)); 			// false
		System.out.println("문자열 비교 : " + a.equals(d));  // true
		
		System.out.println("e == f : " + (e == f)); 	    // false
		System.out.println("문자열 비교 : " + e.equals(f));  //true
	}
}