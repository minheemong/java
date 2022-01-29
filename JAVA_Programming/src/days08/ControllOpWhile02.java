package days08;

import java.util.Scanner;

public class ControllOpWhile02 {

	public static void main(String[] args) {
		// 1부터 100 사이의 짝수 출력 : while문 이용
		int i = 2;
		while (i<=100) {
			// if( i%2 ==0 )
			System.out.printf("%d ",i); 
			i+=2;
		}
		System.out.println(); 
		// 6을 입력하면 6! = 6x5x4x3x2x1 = 720 while문 사용
		Scanner sc = new Scanner(System.in);
		System.out.printf("\n팩터리얼을 계산할 정수 입력 : ");
		int n ,fact =1;
		n = sc.nextInt();
		System.out.printf("%d! = ",n); 
		while(n>1) {
			System.out.printf("%dx",n);
			fact=fact*n;
			--n;
		}
		/* for(i=n ; i>1 ; i--}
			 System.out.printf("%dx",i);
			 fact=fact*i
		 } */
		System.out.printf("1=%d",fact);
	}

}
