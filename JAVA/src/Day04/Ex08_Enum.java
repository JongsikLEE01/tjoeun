package Day04;
// 열거타입(enum)정의
// enum 파일로도 정의 할 수 있고 클래스 파일 내에서 정의할 수도 있다.

enum Test{
	A,B,C,D,E,F
};

public class Ex08_Enum {
	public static void main(String[] args) {
		// enum(열거타입)
		// - 요소들을 명명한 값으로 집합을 이루는 자료형
		// enum은 비교할 때는 값 뿐만 아니라 타입도 비교한다
		// enum의 상수값이 재정이 되도 다시 컴파일할 필요가 없다
		
		//values() : 열거타입의 모든 요소를 배열로 반환
		Rainbow[] rainbow = Rainbow.values();
		
		for (Rainbow color : rainbow) {
			System.out.print(color+" ");
		}
		System.out.println();
		
		// valueOf() : 전달된 문자열과 일치하는 열거타입 상수를 반환
		Rainbow G = Rainbow.valueOf("PURPLE");
		System.out.println("G : "+ G);;
		
		// ordinal() : 해당 열거체 상수가 정의된 인덱스를 반환
		int index = G.ordinal();
		System.out.println("PURPLE의 index : "+index);
	}
}