package days11;

import java.util.Scanner;

public class Method09 {

	public static void main(String[] args) {
		// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하여 출력(메서드 사용)
		int a, b;
		double c;		
		a = myInput(1); // 밑변을 입력 받음
		b = myInput(2); // 높이를 입력 받음
		c = calculate(a, b); // 넓이를 계산
		prn(c);  // 넓이 출력
	}
	public static void prn(double c) {
		System.out.println("입력한 삼각형의 넓이는 " + c + " 입니다");
	}
	public static double calculate(int a, int b) {
		double c = a*b*0.5;
		return c;
		// return a*b*0.5;
	}
	
	public static int myInput(int n) {
		if(n==1)System.out.printf("밑변 입력 : ");
		else System.out.printf("높이 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
		// return sc.nextInt();
	}
	
	//1. 함수의 용도 전달인수 및 리턴값 유무 파악. 
	// myInput 은 함수내에서 밑변 또는 높이 입력 이라는 안내와 함께  정수를 입력받아
	// 입력 받은 정수를 리턴
	// 2. 메서드의 호출 형태(호출 구문)을 복사   a = myInput(1);
	// 3. 왼쪽에  'a =' 가 있다는 뜻은 리턴값이 있다는 뜻이므로 자료형을 보고 앞쪽 내용을 
	// 바꿔줍니다
	// a =    ->   public static int          publicl static int myInput(1);
	// 만약 a=  이라는 구문이 없다면 리턴값이 없는 것이므로 publicl static void 를 
	// 사용합니다
	// 4. myInput(1) 의 괄호안에 1이 있다는건 전달인수가 있다는 뜻이므로  1을 
	//   받아줄수 있는 변수를 선언
	//      1  -> int k         public static int myInput(int k)   - 맨끝의 ; 도 삭제
	// 변수의 자료형은 괄호안에 전달되는 자료형과 일치시킵니다.

}
