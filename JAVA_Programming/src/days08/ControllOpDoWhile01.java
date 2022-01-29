package days08;

import java.util.Scanner;

public class ControllOpDoWhile01 {

	public static void main(String[] args) {
		int i;
		for(i=11;i<=10;i++) {
			System.out.printf("%d",i);
		}
		System.out.println("for 반복 종료후 값 : "+ i);
		
		i=11;
		while(i<=10) {
			System.out.printf("%d",i);
			i++;
		}
		System.out.println("while 반복 종료후 값 : "+ i);
		//---------------------------------------------------
		
		i=11;
		do {
			//System.out.printf("%d",i);
			i++;
		}while(i<=10);
		System.out.println("while 반복 종료후 값 : "+ i);
		// do while의 특이점 : while(조건)을 후미에 기술합니다
		// while(조건) 뒤에 ';' 세미콜론을 찍습니다.
		//if(조건); X
		//for(int i = 1;i<100;i++); X
		//while(i<100); X
		// do { } while (조건); O
		// do에 속한 { } 안의 명령을 한 번 먼저 실행 후 조건을 테스트합니다

		//do~while 반복문을 활용하여
		// 사용자가 100을 입력할 때까지 반복해서 입력받으세요
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.printf("정수를 입력");
			input = sc.nextInt();
		}while(input!=100);
		System.out.println("프로그램 종료");
	}
}
