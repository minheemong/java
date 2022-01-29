package days05;

import java.util.Scanner;

public class PracticeControllOpIf07 {

	public static void main(String[] args) {
		// 판매실적금액에 과장 50%, 대리 25%, 사원 15% 의 활동비를 합산하여
		// 출력해주세요
		int p;
		double a=0.0;
		String j;
		System.out.printf("직급을 입력하세요(과장/대리/사원) : ");
		Scanner sc = new Scanner(System.in);
		j = sc.nextLine();
		System.out.printf("판매실적금액을 입력하세요 : ");
		p = sc.nextInt();
		if(j.equals("과장")) a = 0.5;
		else if(j.equals("대리")) a = 0.25;
		else if(j.equals("사원")) a = 0.15;
		else System.out.println("직급을 잘못 입력하셨습니다");
		System.out.println("총 금액 :" + (p+(int)(p*a)));

		
		
	}

}
