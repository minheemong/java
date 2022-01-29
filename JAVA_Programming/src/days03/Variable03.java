package days03;

import java.util.Scanner;

public class Variable03 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in); 
		// import  단축기 : Ctrl + Shift + 'o'
		
		int num1, num2;
		double result;
		
		System.out.printf("밑변의 길이를 입력하세요 : ");
		num1 = sc.nextInt();
		
		System.out.printf("높이를 입력하세요 : ");
		num2 = sc.nextInt();
		
		result = num1 * num2 * 0.5;
		
		System.out.println("입력한 삼각형의 넓이는 " + result + "입니다");

	}

}
