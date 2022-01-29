package days17;

import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));
		// 프로그램이 시작되어 Calendar 인스턴스가 만들어진 시점
		// 시:분:초:1/1000 초

	}

}
