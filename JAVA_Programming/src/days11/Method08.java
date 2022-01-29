package days11;

import java.util.Scanner;

public class Method08 {

	public static void main(String[] args) {
		int year;
		boolean a;		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		year = sc.nextInt();
		//년도를 전달인수로 전달하여   윤년이면 true, 평년이면 false 를 리턴
		a = yoon(year); 
		prn(a); // 변수 a 값을 전달받아 윤년 또는 평년 을 출력하는 메서드
	}
	public static void prn( boolean a) {
		if( a ) System.out.println("윤년입니다");
		else System.out.println("평년입니다");
	}
	public static boolean yoon(int y) {
		if( y%4 ==0 && y%100 != 0 || y%400 == 0) return true;
		else return false;
	}

}
