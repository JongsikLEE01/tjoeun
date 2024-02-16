package Day10.Ex04_Multilnterface;

public class SmartTelevisonEx {
	public static void main(String[] args) {
		SmartTelevison tv = new SmartTelevison();
		
		tv.turnOn();
		tv.setVolume(20);
		int channel = tv.channelSearch("SBS");
		tv.setChannel(channel);
		
		String[] idolContent = tv.contentSearch("아이돌");
		System.out.println("======= 검색된 컨텐츠 =======");
		
		for(int i =0; i < idolContent.length; i++) {
			System.out.print(idolContent[i]);
			if(i < idolContent.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		tv.receiveVoice("오늘 날씨 어때?");
		tv.turnOff();
		
		tv.touch(1, 5);
	}
}