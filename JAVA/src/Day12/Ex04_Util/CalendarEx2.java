package Day12.Ex04_Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		// 현재를 기준으로 날짜/시간 정보로 객체를 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		// 날짜 형식을 지정하는 방법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		// sdf.format(Date 객체)
		// 지정한 날짜 형식에 맞춰 Date 객체의 날짜/시간 정보를 문자열로 반환하는 메소드
		String today = sdf.format(cal.getTime());
		System.out.println(today);
		
		// 현재 날짜로부터 N시간 후, N일 후는 언제인지
		// cal.add(시간단위 상수, 날짜/시간 값) -> 지정한 시간 단위만큼 이후의 날짜/시간으로  변경
		// 10분 후
		cal.add(Calendar.MINUTE, 10);
		String after10Min = sdf.format(cal.getTime());
		System.out.println("10Min : "+after10Min);
		
		// 1시간 후
		cal.add(Calendar.HOUR, 5);
		String after1Hour = sdf.format(cal.getTime());
		System.out.println("1Hour : "+after1Hour);
		
		// 1일 후
		cal.add(Calendar.DAY_OF_MONTH, 1);
		String after1Day = sdf.format(cal.getTime());
		System.out.println("1Day : "+after1Day);
		
		// 이번 주 로또 추점 일시?
		// * 매일 6~24시까지 판매
		// 추첨일(토요일)에는 오후 8시에 판매 마감
		// 추첨일 오후 8시부터 다음날(일요일) 오전 6시까지는 판매 정지
		// Q. 현재 날짜/시간을 기준으로 로또를 구매한다면, 추첨일은 언제인가?
		// A. 출력) 추첨일 : 2024/02/24 21:00:00
		Calendar lottoCal = Calendar.getInstance();
		
		// 구입 불가조건 : 0~6시
		// lottoCal.set(Calendar.DAY_OF_WEEK, 0);
		// lottoCal.set(Calendar.HOUR, 1);
		// 구입불가조건 : 토요일 오후 9시
		// lottoCal.set(Calendar.AM_PM, 1);
		// lottoCal.set(Calendar.DAY_OF_WEEK, 7);
		// lottoCal.set(Calendar.HOUR, 9);
		
		int BuyLottoweek = lottoCal.get(Calendar.DAY_OF_WEEK);
		int BuyLottoHour = lottoCal.get(Calendar.HOUR);
		int ampm = lottoCal.get(Calendar.AM_PM);
		
		System.out.println("요일 : "+BuyLottoweek);	
		System.out.println("시간 : "+BuyLottoHour);
		System.out.println("AMPM : "+ampm);	// am : 0 / pm : 1
		String todayOfWeek= "";
		
		// 요일 정리
		switch (BuyLottoweek) {
		case 1:		todayOfWeek = "일요일"; break;
		case 2:		todayOfWeek = "월요일"; break;
		case 3:		todayOfWeek = "화요일"; break;
		case 4:		todayOfWeek = "수요일"; break;
		case 5:		todayOfWeek = "목요일"; break;
		case 6:		todayOfWeek = "금요일"; break;
		case 7:		todayOfWeek = "토요일"; break;
		}
		
		// 시간은 고정된 값 :토요일, 9시, 0분, 0초
		lottoCal.set(Calendar.HOUR, 9);
		lottoCal.set(Calendar.MINUTE,0);
		lottoCal.set(Calendar.SECOND,0);
		lottoCal.set(Calendar.AM_PM, 1);
		
		// 구입 가능 여부
		boolean BuyYn = false;
		
		// 구입 불가 조건
		// 오전 00시 ~ 06시
		if(ampm == 0 && BuyLottoHour >= 0 && BuyLottoHour <= 6) {
			System.err.println("구입 가능한 시간이 아닙니다.");
		}
		// 토요일이면서 오후 8시 이후
		else if(todayOfWeek == "토요일" && ampm == 1 && BuyLottoHour >= 8 ) {
			System.err.println("구입 가능한 시간이 아닙니다.");
		}
		// 구입 가능
		else {
			BuyYn = true;
		}
		
		// 구입 가능
		if(BuyYn){
			// 추첨일을 구하는 계산
			lottoCal.add(Calendar.DATE,7-BuyLottoweek);
			String thisday = sdf.format(lottoCal.getTime());
			System.out.println("추첨일 : "+thisday);		
		}else {
			System.out.println("구입 가능한 시간에 다시 오세요.");
		}
	}	// main
}