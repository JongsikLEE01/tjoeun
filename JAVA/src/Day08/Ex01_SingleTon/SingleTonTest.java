package Day08.Ex01_SingleTon;

public class SingleTonTest {
	public static void main(String[] args) {
		// private로 객체를 생성해 외부 클래스에서 접근 불가능
		// SingleTon s = new SingleTon();
		
		SingleTon s01 = SingleTon.getInstance();
		SingleTon s02 = SingleTon.getInstance();
		
		// 인스턴스가 메모리 공간에 하나로 할당되어 있는지 확인
		System.out.println("s01와 s02가 같은지 여부 : ");
		System.out.println(s01==s02);
	}
}