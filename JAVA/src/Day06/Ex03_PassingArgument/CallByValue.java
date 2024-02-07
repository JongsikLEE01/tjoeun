package Day06.Ex03_PassingArgument;

public class CallByValue {
	// 메소드정의
	 public static int sum(int a, int b) {
		 a = 100;
		 b = 200;
		 int sum = a+b;
		 System.out.println("------ sum() 메소드 ------");
		System.out.println("((a, b) : "+a+ " " +b);
		 return sum;
	 }
	
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("------ main() 메소드 ------");
		System.out.println("((a, b) : "+a+ " " +b);
		
		// 값에 의한 호출 : Call By Value
		// 기본 자료형을 인자로 전달하는 방식
		int sum = sum(a,b);
		System.out.println("sum : "+sum);
		
		System.out.println("------ main() 메소드 호출 후 ------");
		System.out.println("((a, b) : "+a+ " " +b);
	}  
}