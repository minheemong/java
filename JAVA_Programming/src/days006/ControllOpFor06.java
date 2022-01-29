package days006;

import java.util.Scanner;

public class ControllOpFor06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i, k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		// 6 을 입력했다면
		//6! = 1x2x3x4x5x6 = 720
		// 1.  6! = 
		System.out.printf("%d! = ", k);
		// 2.  1x2x3x4x5x6x 
		for(i=1; i<k; i++) {
			System.out.printf("%dx", i);
			fact = fact * i;
		}
		// 3.  = 720
		//for(i=1; i<=k; i++) {
		//	fact = fact * i;
		//}
		System.out.printf("%d", k);
		System.out.printf(" = %d", fact*k);		
	}

}
