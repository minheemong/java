package days07;

import java.util.Scanner;

public class ControllOpFor10 {

	public static void main(String[] args) {
		int sum=0, i, num;
		Scanner sc = new Scanner(System.in);
		for(i=1; i<=10; i++) {
			// 입력1 : XX   안내와 실행
			System.out.printf("입력 %d : ", i);
			num = sc.nextInt();
			sum = sum + num;
		}
		//입력된 정수의 합계 : XXX
		System.out.println("입력된 정수의 합계 : " + sum);
	}

}
