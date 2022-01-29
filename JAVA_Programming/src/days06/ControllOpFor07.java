package days06;

import java.util.Scanner;

public class ControllOpFor07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact=1, i, k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		System.out.printf("%d! = ", k);
		for(i=k;i>1;i--) {
			System.out.printf("%d×", i);
			fact=fact*i;
			}
		System.out.printf("%d= %d", 1, fact);
		
		
		
		}

}
