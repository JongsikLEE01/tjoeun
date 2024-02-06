package Day05.Ex03_Car;

public class Car {
	// 변수 - 모델명, 속도
	String model;
	private int speed;
	
	// 기본 생성자
	public Car() {

	}
	// model 매개변수 생성자;
	public Car(String model) {
		this.model = model;
	}
	// 전체 매개변수 생성자
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	// getter : 변수의 값을 가져오는 메소드
	// setter : 변수의 값을 지정하는 메소드
	// 대체로 getXyz(), setXyz(값)으로 이름 지정
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			System.err.println("속도는 음수로 작성할 수 없습니다.");
			speed = 0;
		}
		if(speed >= 300) {
			System.err.println("최대 속도는 300Km/h");
			speed = 300;
		}
		this.speed = speed;
	}
}