package Day08.Ex03_Interface;

public class RemoterControlEx {
	public static void main(String[] args) {
		// 인터페이스를 구현한 클래스를 만드는법
		// 인터페이스타입, 객체명 = new 구현클래스();
		RemoteControl carRc = new RcCar();
		carRc.turnOn();			// 시동걸기
		// 디폴트 메소드는 구현하지않아도(오버라이딩) 바로 호출 가능
		carRc.parking(false);	// 주행모드
		carRc.setSpeed(20);		// 가속
		carRc.parking(true);	// 주차
		carRc.turnOff();		// 시동끄기
		System.out.println();
		
		// static 메소드는 객체 생성 없이도 바로 호출 가능
		RemoteControl.changeBattery();	// 배터리 교체
		System.out.println();
		
		RemoteControl droneRc = new Drone();
		droneRc.turnOn();
		droneRc.parking(false);
		droneRc.setSpeed(15);
		droneRc.parking(true);
		droneRc.turnOff();
		System.out.println();
	}
}