package days05;

import java.util.Scanner;

public class PracticeControllOpIf09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
		// 2021년 1월 1일은 금요일입니다.
		// 2021년에 한해서  월과 일을 입력 받고,
		// 요일을 출력하세요
		int day = 0;
		if(m==1) day=0;
		else if (m==2) day=31;
		else if (m==3) day=31+28;
		else if (m==4) day=31+28+31;
		else if (m==5) day=31+28+31+30;
		else if (m==6) day=31+28+31+30+31;
		else if (m==7) day=31+28+31+30+31+30;
		else if (m==8) day=31+28+31+30+31+30+31;
		else if (m==9) day=31+28+31+30+31+30+31+31;
		else if (m==10) day=31+28+31+30+31+30+31+31+30;
		else if (m==11) day=31+28+31+30+31+30+31+31+30+31;
		else if (m==12) day=31+28+31+30+31+30+31+31+30+31+30;
		else System.out.println("월 입력 오류");
		//  1월 10일 입력했다면   1월 1일 부터 10일까지 10일의 날짜가 계산됩니다
		//  그를 7로 나눈 나머지를 구하면  3이고,   1:금요일  2:토요일  3:일요일....
		// 위와 같이 요일을 계산합니다			
		day+=d;
		if(day%7==0) System.out.printf("2021년 "+m+"월 "+d+"일 목요일");
		else if(day%7==1) System.out.printf("2021년 "+m+"월 "+d+"일 금요일");
		else if(day%7==2) System.out.printf("2021년 "+m+"월 "+d+"일 토요일");
		else if(day%7==3) System.out.printf("2021년 "+m+"월 "+d+"일 일요일");
		else if(day%7==4) System.out.printf("2021년 "+m+"월 "+d+"일 월요일");
		else if(day%7==5) System.out.printf("2021년 "+m+"월 "+d+"일 화요일");
		else if(day%7==6) System.out.printf("2021년 "+m+"월 "+d+"일 수요일");
		
		// 2월 5일 입력했다면 - 1월에 해당하는 31일 + 입력한 일 5 -> 36
		// 36을 7로 나눈 나머지 구하면  1
		
	}

}
