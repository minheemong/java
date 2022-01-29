package days06;

import java.util.Scanner;

public class ControllOpFor04 {

	public static void main(String[] args) {
		int k, i;
		k = 5;
		i = 2;
		System.out.printf("%d×%d=%d\n", k,i,k*i);
		
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력하세요 :");
		dan = sc.nextInt();
		// 입력한 숫자의 구구단을 출력하세요
		for(i=1;i<10;i++) {
			System.out.println(dan+"×"+i+"="+dan*i);
			//System.out.printf("%d×%d=%d\n", dan,i,dan*i);
		}
	}

}
