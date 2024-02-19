package Day12.Ex04_Util;

import java.util.Calendar;

public class CalenderEx {
	// 날짜/ 시간 정보를 출력하는 메소드
	public static void printCalender(String msg, Calendar cal) {
		int year = cal.get( Calendar.YEAR );
		int month = cal.get( Calendar.MONTH ) + 1;			// 월(0~11)
		int day = cal.get( Calendar.DAY_OF_MONTH );
		int dayOfWeek = cal.get( Calendar.DAY_OF_WEEK );	// 일~토(1~7)
		int hour = cal.get( Calendar.HOUR );				// 12시 표시
		int hourOfDay = cal.get( Calendar.HOUR_OF_DAY );	// 24시 표시
		int ampm = cal.get( Calendar.AM_PM );
		int minute = cal.get( Calendar.MINUTE );
		int second = cal.get( Calendar.SECOND );
		int millisecond = cal.get( Calendar.MILLISECOND );
		System.out.print(msg + " : " + year + "/" + month + "/" + day +"/");
		
		// 일요일(1) ~ 토요일(7)
		String Day = "";
		switch (dayOfWeek) {
		case Calendar.SUNDAY:		Day = "일요일"; break;
		case Calendar.MONDAY:		Day = "월요일"; break;
		case Calendar.TUESDAY:		Day = "화요일"; break;
		case Calendar.WEDNESDAY:	Day = "수요일"; break;
		case Calendar.THURSDAY:		Day = "목요일"; break;
		case Calendar.FRIDAY:		Day = "금요일"; break;
		case Calendar.SATURDAY:		Day = "토요일"; break;
		}
		System.out.print(Day);
		
		System.out.print("(" + hourOfDay + "시)");
		if( ampm == Calendar.AM )
			System.out.print(" 오전 ");
		if( ampm == Calendar.PM )
			System.out.print(" 오후 ");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}
	
	public static void main(String[] args) {
		// new Calendar() 대신 getInstance() 메소드로 객체를 사용
		Calendar now = Calendar.getInstance();
		printCalender("현재", now);
		
		// 자바 프로그래밍 마지막 수업일
		Calendar test = Calendar.getInstance();
		test.set(2024, Calendar.FEBRUARY, 27);
		printCalender("자바 마지막 수업일 ", test);
		test.set(2024, Calendar.FEBRUARY, 27, 18, 30, 0);
		printCalender("자바 마지막 수업일 ", test);
		
		// 종강일
		Calendar lastDay = Calendar.getInstance();
		lastDay.set(2024, Calendar.AUGUST, 1, 18, 0, 0);
		
		// - lastDay : 종강일
		// - now 	 : 오늘 (날짜/시간)
		long lastT = lastDay.getTimeInMillis();
		long nowT = now.getTimeInMillis();
		// getTimeInMillis()	: 날짜를 ms밀리초 단위까지 숫자로 반환
		// 1970년 1월 1일 0시 0분 0초 0ms부터 카운트한 숫자를 반환
		
		// 0.001초  : 1ms
		// 60초  	: 1분
		// 60분 		: 1시간
		// 24시 		: 1일
		System.out.println(lastT - nowT);
	
		long dDay = (lastT - nowT) / (1000*60*60*24);
		System.out.println("D-day? "+dDay+"일");
		
		long nowD = nowT / (1000*60*60*24);
		long lastD = lastT / (1000*60*60*24);
		System.out.println("1970y 1m 1d 0h 0m 0s 0ms ~ Today? : "+nowD);
		System.out.println("1970y 1m 1d 0h 0m 0s 0ms ~ LastDay? : "+lastD);
		
		// 내가 태어난 지 몇 일?
		Calendar birth = Calendar.getInstance();
		birth.set(2001, Calendar.MAY, 7, 0, 0, 0);
		long birthD = birth.getTimeInMillis() / (1000*60*60*24);		
		long afterBirth = nowD-birthD;
		System.out.println("BirthDay ~ Today? : "+ afterBirth);
		
		// 월(Month)는 0~11로 0이 1월을 의미, 지정할 월 -1을 해서 입력해야함
		//	Calendar.JANUARY -> 0월 : 상수값을 가져와서 지정하는 것을 권장
		
		if(now.before(lastDay)){
			System.out.println("종강 전");
		}else if(now.after(lastDay)) {
			System.out.println("수업 종료");
		}
	}
}