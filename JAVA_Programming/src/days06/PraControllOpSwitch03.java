package days06;

import java.util.Scanner;

public class PraControllOpSwitch03 {

	public static void main(String[] args) {
		//요일 출력
		Scanner sc=new Scanner(System.in);
		int m, d, days=0;
		System.out.println("월 입력 :");
		m=sc.nextInt();
		System.out.println("일 입력 :");
		d=sc.nextInt();
		switch(m) {
			case 12 : days=days+30;
			case 11 : days=days+31;
			case 10 : days=days+30;
			case 9 : days=days+31;
			case 8 : days=days+31;
			case 7 : days=days+30;
			case 6 : days=days+31;
			case 5 : days=days+30;
			case 4 : days=days+31;
			case 3 : days=days+28;
			case 2 : days=days+31;
			case 1 : days=days+0;
		}
		days=days+d;
		switch(days%7) {
		case 1 : System.out.println("금요일"); break;
		case 2 : System.out.println("토요일"); break;
		case 3 : System.out.println("일요일"); break;
		case 4 : System.out.println("월요일"); break;
		case 5 : System.out.println("화요일"); break;
		case 6 : System.out.println("수요일"); break;
		case 0 : System.out.println("목요일"); break;
		}
		
		
		

	}

}
