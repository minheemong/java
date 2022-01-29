package days03;

import java.util.Scanner;

public class PracticeVariable01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary, month, result;
		System.out.printf("월급을 입력하세요 : ");
		salary = sc.nextInt();
		System.out.printf("개월 수를 입력하세요 : ");
		month = sc.nextInt();
		result = salary * month;
		System.out.println(salary + "만원을 " + month + "달 받으면 연봉은 " + result + "입니다.");

	}

}
