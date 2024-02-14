package Day08.Ex01_SingleTon;
//디자인(설계) 패턴 : 프로그램을 코드를 효율적으로 작성하기 위한 모범 답안
	/*  싱글 톤 패턴 : 디자인 패턴의 하나로 프로그램이 시작될 때 최초로 한번만 메모리를 할당해서 인스턴스를 사용하는 패턴
	 	즉 객체가 필요할 때 새로운 객체를 생성하지 않고 기존의 인스턴스를 활용하는 코드 패턴
	 	객체를 하나만 생성하기 때문에 메모리를 효율적으로 사용할 수 있음*/
public class SingleTon {
	// stataic으로 유일한 객체를 생성
	private static SingleTon instance = new SingleTon();
	
	// 생성자를 private로 정의해 외부 인스턴스의 생성을 막음.
	private SingleTon() {
	}
	
	// 유일한 객체를 가져오는 메소드를 정의
	public static SingleTon getInstance() {
		// 메모리가 해제 될때 다시 선언
		if(instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
}