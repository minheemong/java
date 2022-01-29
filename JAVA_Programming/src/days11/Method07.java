package days11;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		int ban;
		double n, d;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 ");
		ban = sc.nextInt();
		n = calculate1(ban);
		d = calculate2(ban);
		prn(n, d);		
	}
	private static void prn(double n, double d) {
		System.out.printf("입력한 원의 넓이 : %.2f\n", n);
		System.out.printf("입력한 원의 둘레 : %.2f\n", d);
	}
	private static double calculate2(int ban) {
		return 2 * ban * 3.141592;
	}
	public static double calculate1(int b) {
		double n;
		n = b * b * 3.141592;
		return n;
		// return b * b * 3.141592;
	}
}
