package days05;

import java.util.Scanner;

public class ControllOpIf06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		double b;
		System.out.printf("기본급 을 입력하세요 : ");
		a = sc.nextInt();
		
		// 기본급이 백만원 이상이라면 기본급의 50% 를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60% 를 보너스로 합산
		// 총지급액을 출력하세요
		if( a >= 1000000 ) {
			b = a + a * 0.5;  // b = a * 1.5;
			//System.out.println("총지급액 : " + (int)b + "원");
		} else {
			b = a + a * 0.6; // b = a * 1.6;
			//System.out.println("총지급액 : " + (int)b + "원");
		}
		System.out.println("총지급액 : " + (int)b + "원");
	}
}
