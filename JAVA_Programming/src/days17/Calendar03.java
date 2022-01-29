package days17;

import java.util.Calendar;

public class Calendar03 {

	public static void main(String[] args) {
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		//년월일의 순서로 세팅하는 동작이 아니라면 위 처럼 일부 항목만 변경하는거라면 
		// 필드명(Calendar.MINUTE 등)과 값을 나란히 써서 set 메서드 사용
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10); 
		
		printTime(time1);
		printTime(time2);
		// 메서드를 제작하되 밀리세컨도 출력해주세요
		
		
		System.out.println(time1.getTimeInMillis());
		System.out.println(time2.getTimeInMillis());
		long dif = (time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 "+ dif +"초 입니다.");
		
	}

	public static void printTime(Calendar c) {
		System.out.println("time : "
		          + c.get(Calendar.HOUR_OF_DAY)+"시 " 
		          + c.get(Calendar.MINUTE) +"분 " 
		          + c.get(Calendar.SECOND) + "초 "
		          + c.get(Calendar.MILLISECOND)+"(1/1000 초)");
	}
}
