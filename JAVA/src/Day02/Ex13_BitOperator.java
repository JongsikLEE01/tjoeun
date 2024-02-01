package Day02;

public class Ex13_BitOperator {
	public static void main(String[] args) {
		// 비트연산자 
		// & (and)
		int result = 20 & 16;
		System.out.println("20 & 16 = " + result);
		
		// Integer.toBinaryString() : 10진수를 2진수로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		// & (or)
		int result2 = 20 | 16;
		System.out.println("20 | 16 = " + result2);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		// ^ (xor) : 서로 값이 다를 때 true
		int result3 = 20 ^ 16;
		System.out.println("20 ^ 16 = " + result3);
				
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
	}
}