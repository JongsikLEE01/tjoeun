package Day10.Ex04_Multilnterface;

public interface RemoteControl {
	// 상수
	// 최저 속력, 최고 속력 상수 선언.
	// 인터페이스는 변수 선언 시, (public static final)이 자동으로 선언
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// (public abstract)가 자동으로 선언
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
	// 디폴트 메소드 : 구현한 객체가 기본으로 사용할 수 있는 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 설정...");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("음소거 해제...");
			setVolume(10);
		}
	}
	
	//static 메소드 : 구현 객체가 없어도 인터페이스만으로 호출이 가능한 메소드
	static void changeBattery(){
		System.out.println("배터리를 교환하였습니다.");
	}
}