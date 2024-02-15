package Day10.Ex04_Multilnterface;
// 다중 구현
// public class 클래스명 implements 인터페이스명1, 2, ... {}
public class SmartTelevison implements SmartRemoteControl, Searchable{
	int volume;		// 볼륨
	int channel;	// 채널 번호
	String keyword;	// 검색어
	int x, y;		// 터치패드 좌표
	@Override
	public void turnOn() {
		System.out.println("전원 ON...");
	}
	@Override
	public void turnOff() {
		System.out.println("전원 OFF...");
	}
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("volume : "+volume);
	}
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("channel : "+channel);
	}
	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성입력 : " + voice);
		return "voice : "+voice;
	}
	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		switch (keyword) {
		case "SBS": channel=5; break;
		case "KBS": channel=7; break;
		case "MBC": channel=11; break;
		case "Mnet": channel=27; break;
		case "ENA": channel=30; break;
		}
		return channel;
	}
	@Override
	public String[] contentSearch(String keyword) {
		String[] movieContents = {"웡카", "서울의 봄", "해리 포터", "인셉션", "인터스텔라", "타짜"};
		String[] idolContents = {"뉴진스", "투모로우바이투게더", "피프티피트티", "BTS", "르세라핌"};
		String[] recommendContents = {"메타 코미디 클럽", "숏박스", "피식대학", "먹방"};
		String[] choiceContents;
		switch (keyword) {
		case "영화": choiceContents = movieContents; break;
		case "아이돌": choiceContents = idolContents; break;
		default: choiceContents = recommendContents; break;
		}
		return choiceContents;
	}
	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x,y) : "+"("+x+","+y+")");
	}
}