package Day10.Ex04_Multilnterface;
// 인터페이스 다중 상속
// public interface 인터페이스명 extends 인터페이스1, 2, ... {}
public interface SmartRemoteControl extends RemoteControl, Microphone{
	// 터치패드기능
	// x,y좌표 위치에 터치패드 클릭
	void touch(int x, int y);
}