package Day03;

import java.util.Scanner;

public class Ex05_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("채널을 선택하세요");
		int channel = sc.nextInt();
		
		switch (channel) {
		case 6:
			System.out.println("SBS - 런닝맨");
			break;
		case 7:
			System.out.println("KBS - 1박 2일");
			break;
		case 11:
			System.out.println("MBC - 나 혼자 산다");
			break;
		case 100:
			System.out.println("TVING - 환승연애");
			break;
		default:
			System.out.println("요청하신 채널이 없습니다.");
			break;
		}
	}
}