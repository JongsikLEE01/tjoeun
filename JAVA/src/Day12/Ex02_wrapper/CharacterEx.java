package Day12.Ex02_wrapper;

public class CharacterEx {
	public static void main(String[] args) {
		// Character : 문자타입인 char 기본 타입을 객체화환 클래스
		// 주요 메소드 - 대소문자 변환, 문자/숫자인지 여부 확인
		char a= 'a';
		char A='A';
		
		System.out.println(Character.toUpperCase(a));	// 대문자 변환
		System.out.println(Character.toLowerCase(A));	// 소문자 변환
		
		char c1 ='5';
		char c2 = 'X';
		
		// 해당 문자가 숫자인지 확인
		if(Character.isDigit(c1)) {
			System.out.println(c1+"는 숫자임");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2+"는 영문자임");			
		}
		
		String str = "Hello The Jouen Academy";
		
		char[] arr = str.toCharArray();		// 문자 타입 배열로 변환
		
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			// 대문자인지 확인
			if(Character.isUpperCase(arr[i])) {
				count++;
			}
		}
		System.out.println(str + " - 대문자 개수 : "+count);
	}
}