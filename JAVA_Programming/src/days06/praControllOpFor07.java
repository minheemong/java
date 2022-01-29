package days06;

import java.util.Scanner;

public class praControllOpFor07 {

	public static void main(String[] args) {
		// 6! = 6×5×4×3×2×1 = 720
		System.out.printf("팩토리얼을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a, b , fact=1;
		a = sc.nextInt();
		System.out.printf("%d! = ", a);
		for(b=a;b>1;b--) {
			System.out.printf("%d×",b);
			fact=fact*b;
			}
		System.out.printf("1 = %d", fact);
		
				
				

	}

}
