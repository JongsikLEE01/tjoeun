package Day08.Ex03_Interface;
// implements : 인터페이스를 구현
public class RcCar implements RemoteControl{
	int speed;
	
	// 추상 메소드
	@Override
	public void turnOn() {
		System.out.println("RC카 전원을 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("RC카 전원을 끕니다.");
	}
	@Override
	public void setSpeed(int speed) {
		if(speed > RemoteControl.MAX_SPEED) {
			this.speed = RemoteControl.MAX_SPEED;// 최대 속력 이상으로 넘지 못하게 지정
		}else if(speed < RemoteControl.MIN_SPEED) {
			this.speed = RemoteControl.MIN_SPEED; // 최소 속력 미만으로 넘지 못하게 지정
		}else {
			this.speed = speed;
		}
		System.out.println("현재 속도 : "+this.speed);
	}
	
}