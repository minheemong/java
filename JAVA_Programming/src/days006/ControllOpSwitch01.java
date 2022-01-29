package days006;

import java.util.Scanner;

public class ControllOpSwitch01 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		a = sc.nextInt();
		
		/*
		if( a == 1) System.out.println("1을 입력하셨습니다");
		else if( a == 2 ) System.out.println("2을 입력하셨습니다");
		else if( a == 3 ) System.out.println("3을 입력하셨습니다");
		else if( a == 4 ) System.out.println("4을 입력하셨습니다");
		*/
		
		// switch 문은 if 문과 비슷한 구조이지만, 변수값의 단순 참조에 의해 실행될 
		// 명령이 선택되는 것이 다릅니다
		switch(a) {  // 괄호안의 a변수값을 참조하여, 아래 해당 값이 있는  case 에
							// 있는 명령을 실행합니다
			case 1: // a 변수 값이 1일때 실행하는 명령이 쓰여지는 곳
				System.out.println("1을 입력하셨습니다");
				break;
			case 2: // a 변수 값이 2일때 실행하는 명령이 쓰여지는 곳
				System.out.println("2을 입력하셨습니다");
				break;
			case 3: // a 변수 값이 3일때 실행하는 명령이 쓰여지는 곳
				System.out.println("3을 입력하셨습니다");
				break;
			case 4: // a 변수 값이 4일때 실행하는 명령이 쓰여지는 곳
				System.out.println("4을 입력하셨습니다");
				break;
			case 5: // a 변수 값이 5일때 실행하는 명령이 쓰여지는 곳
				System.out.println("5을 입력하셨습니다");
				break;
		} // 단점 : 해당 case 만 실행하는게 아니라 아랫쪽 케이스를 모두 실행합니다
		// 아래 케이스를 모두 실행하는 단점을 보완하기 위해 각 case 에 break 를 추가

	}

}
