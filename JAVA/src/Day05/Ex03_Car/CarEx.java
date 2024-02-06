package Day05.Ex03_Car;

public class CarEx {
	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		car.model="볼보"; // car.speed=200; : private의 경우 같은 클래스 내에서만 사용 가능하기 때문에 오류 발생
		
		car.setSpeed(200);  // setter 메소드에 접근해 속도를 지정
		System.out.println("model : " +car.getModel() );
		System.out.println("speed : "+car.getSpeed());
		
		car.setSpeed(-50);
		System.out.println("speed : "+car.getSpeed());		
		car.setSpeed(400);
		System.out.println("speed : "+car.getSpeed());
		car.setSpeed(200);
		System.out.println("speed : "+car.getSpeed());
	}
}