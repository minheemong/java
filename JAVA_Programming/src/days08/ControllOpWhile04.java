package days08;

import java.util.Random;
import java.util.Scanner;

public class ControllOpWhile04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("가위(1)바위(2)보(3) 입력 : (종료-0) ");
		int b;
		b = sc.nextInt();
		
		Random rd = new Random();
		
		while(b!=0) {
			int k = rd.nextInt();
			if(k<0) k= k*(-1);
			k = k%3 + 1;
			// System.out.println(k);
			
			
			if(b==1) System.out.printf("나 : 가위\t\t");
			else if(b==2) System.out.printf("나 : 바위\t\t");
			else System.out.printf("나 : 보\t\t");
			
			if(k==1) System.out.printf("컴퓨터 : 가위\t\t");
			else if(k==2) System.out.printf("컴퓨터 : 바위\t\t");
			else System.out.printf("컴퓨터 : 보\t\t");
			
			if(b== k)  System.out.printf("무승부");
			else if(b==1 && k==3)  System.out.printf("승리");
			else if(b==2 && k==1)  System.out.printf("승리");
			else if(b==3 && k==2)  System.out.printf("승리");
			else 	System.out.printf("패배");
			
			System.out.printf("\n\n가위(1)바위(2)보(3) 입력 : (종료-0) ");
			b = sc.nextInt();
		}
		System.out.printf("프로그램 종료");
		
	
		
		
		
	}

}
