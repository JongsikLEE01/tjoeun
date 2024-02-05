package Day04;

public class Ex04_Foreach {
	public static void main(String[] args) {
		String[] week = {"월요일", "화요일" ,"수요일", "목요일", "금요일", "토요일", "일요일"};
		
		// 배열 or 컬렉션의 모든 요소를 순서대로 반복하는 반복문
		for (String day : week) {
			System.out.print(day+" ");
		}
		System.out.println();
		
		// 기본 for문
		// 조건식에 따라 반복할수 있음
		for (int i = 0; i < week.length; i+=2) {
			System.out.print(week[i]+" ");
		}
		System.out.println();
	}
}