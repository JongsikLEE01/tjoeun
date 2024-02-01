package Day02;

public class Ex11_PlusMinusOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		// 증감 연산자 ++ : 1 증가		-- : 1 감소
		// 전위 연산자 : 우선 순위가 가장 높음
		c = ++a + b;
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		int x = 10;
		int y = 20;
		int z;
		// 후위 연산자 : 우선 순위가 가장 낮음
		z = x++ + y;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
	}
}