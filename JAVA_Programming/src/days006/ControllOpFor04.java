package days006;

import java.util.Scanner;

public class ControllOpFor04 {

	public static void main(String[] args) {
		int k, i;
		k = 5;
		i = 2;
		System.out.printf("%dx%d=%d\n", k,i,k*i);
		
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력하세요 : ");
		dan = sc.nextInt();
		// 입력한 숫자의 구구단을 출력하세요 
		
		for( i=1; i<=9; i++) {
			System.out.printf("%dx%d=%d\n", dan,i,dan*i);
			// System.out.println(dan + "x" + i + "=" + dan*i);
		}
	}
}
