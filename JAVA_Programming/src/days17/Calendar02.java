package days17;

import java.util.Calendar;

public class Calendar02 {
	
	// Calendar2 클래스 내부에서 사용할 멤버 변수(배열). 
	// static  이므로 언제든 사용가능하고, 같은 클래스내부에서 Calendar2. 을 앞에 붙이지 않고 사용이 가능합니다.
	static String[] weekday = {"", "일", "월", "화" , "수","목","금","토"};
	
	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// date1 달력객체의 오늘 날짜를 2015년 8월 15일로 설정 
		date1.set(2015, 7, 15);  // set : 원하는 특정 날짜로 객체내 날짜구성을 재설정, date2 는 아직 오늘 날짜
		// set 메서드에 필드명과 값을 넣어주면 해당 필드값만 변경됩니다
		//date1.set(Calendar.MONTH, 6)  -> 월만 7월로 바뀜
				
		// 위 date1과 date2 에 설정된 날짜를  "0000년 0월 0일 0요일"  형식으로 출력해주세요.
		// System.out.println() 안에 한번에 구성해서 출력해주세요
		// date1 ->
		printDate(date1);
		//System.out.println( date1.get(Calendar.YEAR) + "년 " 
		//		+ ( date1.get(Calendar.MONTH) + 1 ) + "월 " + date1.get(Calendar.DATE) + "일 "
		//		+ weekday[ date1.get(Calendar.DAY_OF_WEEK) ] + "요일");
		
		// date2 ->
		printDate(date2);
		//System.out.println( date2.get(Calendar.YEAR) + "년 " 
		//		+ ( date2.get(Calendar.MONTH) + 1 ) + "월 " + date2.get(Calendar.DATE) + "일 "
		//		+ weekday[ date2.get(Calendar.DAY_OF_WEEK) ] + "요일");
	}

	private static void printDate(Calendar c) {
		System.out.println( c.get(Calendar.YEAR) + "년 " 
				+ ( c.get(Calendar.MONTH) + 1 ) + "월 " + c.get(Calendar.DATE) + "일 "
				+ weekday[ c.get(Calendar.DAY_OF_WEEK) ] + "요일");
		
	}

}
