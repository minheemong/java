package days05;

import java.util.Scanner;

public class ControllOpIf01 {

	public static void main(String[] args) {
		// 사용자로 부터 정수 하나를 입력 받습니다
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = a % 2;
		// boolean result = (b == 0); 
		if(  b == 0  ) {
			System.out.println("입력한 정수 " + a + "는 짝수입니다");
		} // ( ) 안의 값이 true 이면  { } 안의 명령을 실행, false 이면 실행하지 않는 명령
		
		if( b == 1) {
			System.out.println("입력한 정수 " + a + "는 홀수입니다");
		}
		
		/*  짝수인 경우 아래 네가지로 같은 표현이 가능합니다.
		if( result ){
			System.out.println("입력한 정수 " + a + "는 짝수입니다");
		}
		if( (a%2) == 0 ) {
			System.out.println("입력한 정수 " + a + "는 짝수입니다");
		}
		if( b == 0 ) {
			System.out.println("입력한 정수 " + a + "는 짝수입니다");
		}
		if( result == true) {
			System.out.println("입력한 정수 " + a + "는 짝수입니다");
		}
		*/
	}

}
