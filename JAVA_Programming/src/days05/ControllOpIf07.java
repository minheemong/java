package days05;

import java.util.Scanner;

public class ControllOpIf07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String level;
		int pay;
		System.out.printf("직급 입력(과장/대리/사원) : ");
		level = sc.nextLine();
		System.out.printf("판매실적금액 입력 : ");
		pay = sc.nextInt();
		// 판매실적금액에 과장 50%, 대리 25%, 사원 15% 의 활동비를 합산하여
		// 출력해주세요
		double a=0.0,  b;
		if( level.compareTo("과장") == 0 ) a = 0.5;
		else if( level.equals("대리") ) a = 0.25;
		else if(level.equals("사원") ) a = 0.15;
		else System.out.println("잘못된 직급입니다");
			
		b = pay + pay * a; 
		System.out.println("총지급액 : " + (int)b );
	}

}
