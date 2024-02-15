package Day08.Ex03_Interface;

public class Drone implements RemoteControl{
	int speed;
	
	@Override
	public void turnOn() {
		System.out.println("드론의 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("드론의 전원을 끕니다");
	}

	@Override
	public void setSpeed(int speed) {
		if(speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
		}else if(speed < MIN_SPEED) {
			this.speed = MIN_SPEED;
		}else {
			this.speed = speed;
		}
		System.out.println("현재 속도 : "+this.speed);
	}
}