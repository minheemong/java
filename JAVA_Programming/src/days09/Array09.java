package days09;

import java.util.Scanner;

public class Array09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, days=0, t, i, next=0;   
		System.out.printf("년 입력 : ");
		y = sc.nextInt();
		System.out.printf("월 입력 : ");
		m = sc.nextInt();
		int [] mdays  = {0,31,28,31,30,31,30,31,31,30,31,30,31}; 
		if( (y%4 == 0) && ( y%100 != 0) || ( y%400 ==0 ) ) 
			mdays[2] = 29;
		while(true) {
			days = 365 * (y-1); 
			for(i=1; i<=y-1; i++) 
				if( (i%4 == 0) && ( i%100 != 0) || ( i%400 ==0 ) ) 
					days++;	
			for(i=1; i<m; i++) days = days + mdays[i];
			days = days + 1; 
			t = days % 7;
			System.out.println();
			System.out.println(y + "년  " + m + "월");
			System.out.println("----------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("----------------------------------------------");		
			int space;
			for( space=0; space<t; space++) 	System.out.printf("\t");
			
			for(int day=1; day<=mdays[m]; day++) {
				System.out.printf("%d\t", day);
				if(++space % 7 == 0) System.out.printf("%n");
			}
			
			System.out.printf("\n[이전달:1][다음달:2][종료:3]");
			next = sc.nextInt();
			if(next == 3)break;
			if(next==1) {
				if(m==1) {
					m=12; 	y--;
				}else 
					m--;
			} else if(next == 2) {
				if(m==12) {
					m=1; y++;
				}else 
					m++;
			}
		}// while 의 끝
		System.out.println("\n프로그램 종료");

	}

}
