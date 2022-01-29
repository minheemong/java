package days07;

import java.util.Scanner;

public class ControllOpFor13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int i, start;
		System.out.printf("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		if( num1 > num2 ) start = num1;
		else start = num2;
		int k = 0;
		for(i=start; i<=num1*num2; i++) {
			if( i%num1 == 0 &&  i%num2== 0 ) {
				System.out.printf("%d  ", i);	
			}
		}
		for(i=num1*num2; i>=start; i--) {
			if( i%num1 == 0 &&  i%num2== 0 ) {
				k = i;
			}
		}
		System.out.printf("\n최소공배수 : %d", k);
	}

}
