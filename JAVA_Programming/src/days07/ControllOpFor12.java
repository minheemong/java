package days07;

import java.util.Scanner;

public class ControllOpFor12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int i, small;
		System.out.printf("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두번째 정수 입력 : ");
		num2 = sc.nextInt(); 
		
		// 입력 받은 두개의  공약수들을 출력하세요
		// 12  36  을 입력 한경우   1  2  3  4  6  12
		if( num1 < num2) small = num1;
		else small = num2;
		// 1 부터 small 까지의 숫자로  두개의 숫자를 동시에 나눴을때, 동시에
		// 나눠떨어지는 숫자 -> 공약수
		int k=0;
		for( i = 1; i<=small; i++) {
			if( num1 % i == 0  && num2 % i == 0 ) {
				System.out.printf("%d ", i);
				k = i;
			}
		}
		System.out.printf("\n최대 공약수 : %d ", k);
	}
}
