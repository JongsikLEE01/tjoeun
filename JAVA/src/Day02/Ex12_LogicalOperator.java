package Day02;

public class Ex12_LogicalOperator {
	public static void main(String[] args) {
		// 논리 연산자
		// && (and) : a와 b 모두 true일때 true
		System.out.println(true && true); 	// T
		System.out.println(true && false);	// F
		System.out.println(false && true);  // F
		System.out.println(false && false); // F
		System.out.println();
		
		// || (or) : a와 b 둘 중 하나라도 true면 true
		System.out.println(true || true); 	// T
		System.out.println(true || false);	// T
		System.out.println(false || true);  // T
		System.out.println(false || false); // F
		System.out.println();
		
		// ! (not) : a가 true이면 false, false면 true 반환 
		System.out.println(!true); 	// F
		System.out.println(!false);	// T
		System.out.println();
		
		// 쇼트서킷 : 논리 연산의 결과를 미리 알아 남은 논리식을 확인하지 않는것
		int value1 = 3;
		System.out.println(false && ++value1 > 10); //Dead code 발생 false 이후 and연산은 true를 반환할 수 없으므로 실행시키지 않음
		System.out.println("value1 : "+ value1);

		int value2 = 3;
		System.out.println(true || ++value2 > 10);
		System.out.println("value1 : "+ value2);
		
		int value3 = 3;
		System.out.println(false & ++value3 > 10); // 비트연산자는 쇼트 서킷이 적용되지 않음
		System.out.println("value1 : "+ value3);

		int value4 = 3;
		System.out.println(true | ++value4 > 10);
		System.out.println("value1 : "+ value4);
	}
}