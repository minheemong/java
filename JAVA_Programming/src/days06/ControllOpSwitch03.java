package days06;

import java.util.Scanner;

public class ControllOpSwitch03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
		int days = 0;
		
		// days = 31+28+31+30+31+30+31+31+30+31+30;
		// days = 30+31+30+31+31+30+31+30+31+28+31;
		// days = days+31;
		
		switch(m) {
			case 12: days = days + 30; // 11월의 날짜 수 30을 days에 합산
			case 11: days = days + 31; // 10
			case 10: days = days + 30;
			case 9: days = days + 31;
			case 8: days = days + 31;
			case 7: days = days + 30;
			case 6: days = days + 31;
			case 5: days = days + 30;
			case 4: days = days + 31;
			case 3: days = days + 28;
			case 2: days = days + 31;
			case 1: days = days + 0;
		}
		days = days + d;
		int t = days % 7;
		switch(t) {
			case 1: System.out.println("금요일"); break;
			case 2: System.out.println("토요일"); break;
			case 3: System.out.println("일요일"); break;
			case 4: System.out.println("월요일"); break;
			case 5: System.out.println("화요일"); break;
			case 6: System.out.println("수요일"); break;
			case 0: System.out.println("목요일"); break;
		}
	}

}
