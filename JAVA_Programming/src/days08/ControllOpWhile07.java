package days08;

import java.util.Scanner;

public class ControllOpWhile07 {

	public static void main(String[] args) {
				int m, d, days=0, t, y, i, next=0; 
				Scanner sc = new Scanner(System.in);
				System.out.printf("년 입력 : ");
				y = sc.nextInt();
				System.out.printf("월 입력 : ");
				m = sc.nextInt();
				
				while(true) {
					days = 365*(y-1);
					for(i=1;i<=y-1;i++)
						if( i%4==0 && i%100!=0 || i%400==0 )
							days++;	
					switch(m) {
					case 12 : days = days+30;
					case 11 : days = days+31;
					case 10 : days = days+30;
					case 9 : days = days+31;
					case 8 : days = days+31;
					case 7 : days = days+30;
					case 6 : days = days+31;
					case 5 : days = days+30;
					case 4 : days = days+31;
					case 3 : 
						if( y%4==0 && y%100!=0 || y%400==0 )
							days = days + 29;
						else days = days + 28;
					case 2 : days = days+31;
					case 1 : days = days+0;
					}				
					days=days+1; 
					t = days%7;				
					System.out.println();	
					System.out.println(y+"년 "+m+"월");
					System.out.println("-----------------------------------------");
					System.out.println("일\t월\t화\t수\t목\t금\t토");
					System.out.println("-----------------------------------------");				
					int space;
					for(space=0;space<t;space++) System.out.printf("\t");		
					int lastday=0;
					switch(m) {
					case 1:	 case 3: case 5: case 7: case 8: case 10: case 12:
						lastday=31; break;
					case 4: case 6: case 9: case 11:
						lastday = 30; break;
					case 2 : 
						if( y%4==0 && y%100!=0 || y%400==0 ) lastday = 29;
						else lastday = 28;
						break;					
					}				
					for(int day =1 ; day<=lastday;day++) {
						System.out.printf("%d\t",day);
						if(++space % 7 == 0) System.out.printf("%n");
					}
				
	
			System.out.printf("\n[이전달:1][다음달:2][종료:3]");
			next = sc.nextInt();
				if(next==3)break;
				
				
				if(next==1) {
					if(m==1) { y=y-1; m=12;}
					else m--;
					}
					
					
					else if(next==2) {
						if(m==12) {y=y+1; m=1;}
						else m++;
					}
					
				}
				System.out.printf("프로그램 종료");
				// 프로그램이 종료되지 않고 이전달 다음달로 이어갈 수 있게 while문 구성
				// 이전달 다음달에 해당하는 연도와 월을 계산
				// next변수의 값이 3이면 while문을 종료
	
				

	}

}
