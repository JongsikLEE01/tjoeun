package Day07.Review;

public class Ex05_Language {
	public static void main(String[] args) {
		//1 2 3 4 5, java, sql, html, js, dart
		//배열 선언 및 생성
		int count[] = new int[6];
		for (int i = 0; i < count.length; i++) {
			count[i] = i+1;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i]+" ");
		}
		System.out.println();
		
		//선언 및 초기화
		String language[] = {"java","sql","html","css","javascript", "dart"};
		
		// 배열.length : 배열의 요소개수
		for (int i = 0; i < language.length; i++) {
			System.out.print(language[i]+" ");
		}
		System.out.println();
		
		//foreach : 배열의 모든 요소 반복
		for (String string : language) {
			System.out.print(string + " ");
		}
	}
}