package Day17.Ex01_Lambda;
/*
 * 제네릭 함수형 인터페이스
 * : 함수형 인터페이스를 제네릭 기법으로 정의하는 것
 */
@FunctionalInterface
interface MyFunc<T>{
	void print(T t);
}

public class GenericFunclnterface {
	public static void main(String[] args) {
		// 함수형 인터페이스를 정의하는 시점이 아니라
		// 선언하는 시점에서 타입을 확정해서 다양한 타입을 사용
		MyFunc<String> f1 = (x) -> System.out.println(x.toString());
		f1.print("문자열 출력 ~ String");
		
		MyFunc<Integer> f2 = (x) -> System.out.println(x.toString());
		f2.print(100);		// 정수타입 지정
	}
}