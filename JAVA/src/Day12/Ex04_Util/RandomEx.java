package Day12.Ex04_Util;

import java.util.Random;

// Random 클래스 : 타입별로 난수(랜덤수)를 생성하는 클래스,
// 주요 메소드 : nextInt(), nextBoolean(), nextDouble()
public class RandomEx {
	public static void main(String[] args) {
		Random random = new Random();
		
		// 동전 던지기
		boolean randomTF = random.nextBoolean();
		System.out.println("동전 앞뒤 : "+randomTF);
		
		System.out.println("동전 던지기...");
		if(randomTF) System.out.println("앞면");
		else System.out.println("뒷면");
		
		// 정수형 랜덤수
		// 4byte (-21.xxx ~ 21억.xxx)
		int fourByteRandom = random.nextInt();
		System.out.println("fourByteRandom : "+fourByteRandom);
		
		// nextInt(N) : (0~N-1) 사이의 난수 반환
		// [공식] random(개수) + 시작숫자
		int dice = random.nextInt(6);
		System.out.println("주사위 : "+ (dice+1) );
		
		int lotto = random.nextInt(45)+1;
		System.out.println("로또번호 : "+lotto);
		
		double rdDouble = random.nextDouble();
		System.out.println("실수 랜덤 수 : "+rdDouble);
	}
}