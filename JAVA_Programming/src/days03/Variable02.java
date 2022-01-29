package days03;

import java.util.Scanner;

public class Variable02 {

	public static void main(String[] args) {
		int num1, num2;
		int result1;  // 덧셈, 뺄셈, 곱셈의 결과를 저장할 변수
		double result2;  //나눗셈의 결과를 저장할 변수
		
		Scanner sc = new Scanner(System.in);  // 화면입력을 위한 준비 코드
		System.out.printf("정수 하나를 입력해주세요 : ");
		num1 = sc.nextInt(); // 화면으로 부터 정수를 입력 받아 num1 변수에 저장
		// 컴파일러가 sc.nextInt() 명령을 만나면 커서를 깜빡이면서 사용자에게서 
		// 입력이 있을때까지 무한정 대기합니다.  엔터가 최종 입력되면 다음 명령으로 진행합니다
		System.out.println("입력한 정수는 " + num1 + "입니다");
		System.out.printf("두번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println("입력한 정수는 " + num2 + "입니다");
		
		result1 = num1 + num2;   // 덧셈의 결과 저장
		System.out.printf("%d + %d = %d\n",num1, num2, result1);
		result1 = num1 - num2;  // 뺄셈의 결과 저장
		System.out.printf("%d - %d = %d\n",num1, num2, result1);
		result1 = num1 * num2;
		System.out.printf("%d x %d = %d\n",num1, num2, result1);
		result2 = num1 / (double)num2;
		System.out.printf("%d ÷ %d = %.1f\n",num1, num2, result2);
	}

}
