package days07;

import java.util.Scanner;

public class ControllOpFor09 {

	public static void main(String[] args) {
		// 정수 하나를 입력 받아서
		// 2부터 입력받은 정수까지 짝수의 합을 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for( int i = 2; i<=num; i+=2 ) {
			sum = sum + i;
			System.out.println("2부터 " + i + "까지의 짝수들 합 : " + sum);
		}
		System.out.println();
		sum = 0;
		for( int i = 1; i<=num; i++ ) {
			if( i%2 == 0) {
				sum = sum + i;
				System.out.println("1부터 " + i + "까지의 짝수들 합 : " + sum);
			}
		}
		System.out.println();
		sum = 0;
		for( int i = 1; i<=num; i++ ) {
			if( i%2 == 1) continue; // 반복실행 1회가 끝나기 전에 다음 반복으로 이동
			sum = sum + i;
			System.out.println("1부터 " + i + "까지의 짝수들 합 : " + sum);
		}
	}

}
