package days06;

import java.util.Scanner;

public class ControllOpSwitch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		/*
		if(a==1) System.out.printf("1을 입력했습니다");
		else if(a==2) System.out.printf("2를 입력했습니다");
		else if(a==3) System.out.printf("3을 입력했습니다");
		else if(a==4) System.out.printf("4를 입력했습니다");
		*/
		
		// switch문은 if문과 비슷한 구조지만, 변수값의 단순 참조에 의해 실행될
		// 명령이 선택되는 것이 다릅니다
		
		switch(a) { // 괄호 안의 a변수 값을 참조하여, 아래 해당 값이 있는 case에
		                  // 있는 명령을 실행합니다
		case 1 : // a변수값이 1일 때 실행하는 명령이 쓰여지는 곳
			System.out.printf("1을 입력했습니다");
			break;
		case 2 : // a변수값이 2일 때 실행하는 명령이 쓰여지는 곳
			System.out.printf("2를 입력했습니다");
			break;
		case 3 : // a변수값이 3일 때 실행하는 명령이 쓰여지는 곳
			System.out.printf("3을 입력했습니다");
			break;
		case 4 : // a변수값이 4일 때 실행하는 명령이 쓰여지는 곳
			System.out.printf("4를 입력했습니다");
			break;
		case 5 : // a변수값이 5일 때 실행하는 명령이 쓰여지는 곳
			System.out.printf("5를 입력했습니다");
			break;
		} // 단점 : 해당 case만 실행하는 게 아니라 아랫쪽 case를 모두 실행합니다
		  // 아래 case를 모두 실행하는 단점을 보완하기 위해 각 case에 break를 추가
		
		
	}

}
