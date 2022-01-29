package days05;

import java.util.Scanner;

public class ControllOpIf10 {

	public static void main(String[] args) {
		// 실습 예제
		// 년도를 입력받아서 입력한 년도가  윤년인지 평년인지를 출력하는 
		// 코드를 작성하세요
		// 윤년의 조건 : 4의 배수 이면서  100의 배수가 아니거나  400의 배수인 해
		Scanner sc = new Scanner(System.in);
		System.out.printf("연도를 입력하세요 : ");
		int year = sc.nextInt();
		if(year%4==0&& year%100!=0||year%400==0)
		System.out.println("윤년");
		else System.out.println("평년");

	}

}
