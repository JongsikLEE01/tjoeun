package Day13.Ex03_Generics;

class GenericTest{
	// 제네릭 메소드 - 반환타입, 매개변수에 타입 매개변수를 사용해 정의하는 메소드
	public <T> T method(T t) {
		return t;
	}
	
	// 매개변수를 타입 매개변수로사용
	public <T> Boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	// 매개변수 2개를 매개변수로 사용
	public <K,V> void method3(K k, V v) {
		System.out.println(k+" : "+v);
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		GenericTest gt = new GenericTest();
		
		// 제네릭메소드호출
		// -객체.<타입>메소드명(인자);
		String str1 = gt.<String>method("제네릭 메소드");
		System.out.println("str1 : "+str1);
		
		// 전달인자값으로 타입을 유추할수 있으면 
		// 제네릭 메소드 호출시 제네릭타입 생략 가능
		String str2 = gt.method("타입지정생략가능");
		System.out.println("str2 : "+str2);
		
		boolean bol1 = gt.<Double>method2(10.5, 10.5);
		System.out.println("bol1 : "+bol1);
		
		boolean bol2 = gt.<Double>method2(10.5, 20.5);
		System.out.println("bol2 : "+bol2);
		
		gt.<String, Integer>method3("자바 점수", 90);
		gt.method3("DB 점수", 100);
	}
}