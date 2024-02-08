package Day07.Review;

public class Ex04_Lotto {
	public static void main(String[] args) {
		double readom = Math.random(); // 1~0 사이의 난수 반환
		System.out.println(readom);
		//1~6사이의 정수 주사위
		// (int) (Math.random()*10) : 0~10
		// (int) (Math.random()*6)  : 0~5
		// (int) (Math.random()*6)+1: 1~6
		int dice = (int) (Math.random()*6)+1;
		System.out.println("주사위 : " + dice);
		
		//1~45사이의 정수 로또
		int lotto = (int) (Math.random()*45)+1;
		System.out.println(lotto);
		
		// (공식) : (int)(Math.random()*[개수])+시작숫자;
		// 1~20사이의 랜덤수
		int rand = (int)(Math.random()*20)+1;
		System.out.println("1~20사이의 랜덤수 : "+rand);
		
		//-20~20사이의 랜덤수
		int rand1 = (int)(Math.random()*41)+-20;
		System.out.println(rand1);
		
		// 1~45사이의 랜덤수 6개를 배열에 중복 없이 저장, 오름차순 정렬 
		int lotto1[] = new int[7];
		for (int i = 0; i < lotto1.length; i++) {
			lotto1[i] = (int) (Math.random()*45)+1;
			// 중복제거
			for (int j = 0; j < i; j++) {
				if(lotto1[i] == lotto1[j]) {
					i--;
					break;
				}
			}
		}
		
		// 오름차순 정렬
		int temp;
		for (int i = 0; i < lotto1.length; i++) {
			for (int j = 0; j < i; j++) {
				if(lotto1[i] < lotto1[j]) {
					temp = lotto1[i];
					lotto1[i] = lotto1[j];
					lotto1[j] = temp;
				}
			}
		}
		
		// 출력
		for (int rand2 : lotto1) {
			System.out.print(rand2 + " ");
		}
	}
}