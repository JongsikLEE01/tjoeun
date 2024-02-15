package Day10.Ex04_Multilnterface;

public interface Microphone {
	int inputolumeMax = 50;		// 음성 인식 최대 볼륨
	int inputolumeMin = 0;		// 음성 인식 최소 볼륨
	
	// 음성인식
	String receiveVoice(String voice);
}