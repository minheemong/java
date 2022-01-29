package days03;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
		double n, d;
		System.out.printf("반지름을 입력하세요 : ");
		b = sc.nextInt();
		n = b * b * 3.141592;
		d = 2 * b * 3.141592;
		
		System.out.printf("입력한 원의 넓이 : %.2f\n", n);
		System.out.printf("입력한 원의 둘레 : %.2f\n", d);
	}
}
