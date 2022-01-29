package days10;

import java.util.Scanner;

public class Method05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.printf("출력할 단을 입력하세요 : ");
		//int k = sc.nextInt();
		//gugudan(k);
		
		for(int i=2;i<=9;i++) {
			gugudan(i);
			System.out.println();
		}
	}
	public static void gugudan(int a) {
		for(int i=1;i<=9;i++) 
			System.out.println(a+"*"+i+"="+a*i);
	}
}
