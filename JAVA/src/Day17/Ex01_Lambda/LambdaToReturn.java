package Day17.Ex01_Lambda;
/*
 * 익명함수(람다식)을 반환하여 사용하는 실습
 */
@FunctionalInterface
interface PrintString{
	void showString(String msg);
}

/*
  람다식의 장점
  1. 함수를 쉽게 축약해서 정의할 수 있음
  2. 함수를 함수를 통해 전달 또는 반환할 수 있음
 */
public class LambdaToReturn {
	public static void main(String[] args) {
		PrintString ps1 = returnLambda(1);
		PrintString ps2 = returnLambda(2);
		PrintString ps3 = returnLambda(3);
		
		ps1.showString("안녕하세요1");
		ps2.showString("안녕하세요2");
		ps3.showString("안녕하세요3");
	}
	
	// 람다식(익명함수)를 반환하는 메소드
	private static PrintString returnLambda(int code) { 
		switch (code) {
		case 1:
			return msg -> System.out.println("메세지 : "+msg);
		case 2:
			return msg -> { 
				System.out.println("메세지 :");
				System.out.println(msg);
			};
		case 3:	
			return (msg) -> System.out.println(msg);
		default:
			return (msg)-> System.out.println(msg);
		}
	}
}
