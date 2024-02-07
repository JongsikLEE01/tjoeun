package Day06.Ex05_StaticMember;

public class StaticMember {
	// static 변수
	static int a; // 기본값 0으로 인식
	static int b;
	static final double PI = 3.141592; // 상수
	// 인스턴스 변수
	int c;
	
	// static 메소드
	public static int sum(int x,int y) {
		int sum = a+b+x+y;
		//sum += c;
		// c는 static 멤버가 아니고 인스턴스 변수이기 때문에, 객체 생성 시 메모리에 할당되므로 static 메소드에 접근할 수 없음
		return sum;
	}
	public static void main(String[] args) {
		// static 메소드는 객체 생성 없이 호출 가능
		int sum = sum(10,20);
		System.out.println(sum);
		
		a=100;
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		int a1 = s1.a; // static int a의 A의 주소값을 가짐.
		int c1 = s1.c = 10; // 인스턴스 멤버, 고유한 값을 가짐
		int a2 = s2.a;
		int c2 = s2.c = 20;
		
		// PI = 100;  
		// final은 상수로 지정하는 키워드
		// 즉 한번 값을 초기화 한 이후 값을 지정하거나 변경할 수 없다
		
		System.out.println("a1 : "+a1);
		System.out.println("c1 : "+c1);
		System.out.println("a2 : "+a2);
		System.out.println("c2 : "+c2);
	}
}