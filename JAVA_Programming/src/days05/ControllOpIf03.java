package days05;

import java.util.Scanner;

public class ControllOpIf03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		/*
		if( a>0 ) {
			System.out.printf("입력한 정수 %d 는 양수입니다.", a);
		} else {
			if( a<0) {
				System.out.printf("입력한 정수 %d 는 음수입니다.", a);
			}else {
				System.out.printf("입력한 정수는 0입니다.");
				}
			}
		*/
		if( a>0) {
			System.out.printf("입력한 정수 %d 는 양수입니다.", a);
		} else if( a<0) {
			System.out.printf("입력한 정수 %d 는 음수입니다.", a);
		} else {
			System.out.printf("입력한 정수는 0입니다.");
		}
		// 위에서 ( )안의 연산식으로 계산한 결과가 true 경우 { }안의 명령이
		//  실행됩니다. 다만, 그 명령이 단 한 개만 존재한다면 , { }를 생략할 수 있습니다
		if( a>0) 
			System.out.printf("입력한 정수 %d 는 양수입니다.", a);
		else if( a<0) 
			System.out.printf("입력한 정수 %d 는 음수입니다.", a);
		else 
			System.out.printf("입력한 정수는 0입니다.");
		// 중괄호 생략후  if 구문과 실행 명령을 한줄에 써도 무관합니다
		if( a>0) System.out.printf("입력한 정수 %d 는 양수입니다.", a);
		else if( a<0)	System.out.printf("입력한 정수 %d 는 음수입니다.", a);
		else 	System.out.printf("입력한 정수는 0입니다.");
		
		System.out.println();
		
		int kor=70 , eng=98, mat=95;
		// 평균점수가 80 이상이면 합격, 70이상 79이하면 대기순번, 나머지는 불합격
		double avg = (kor+eng+mat)/3.0;
		
		if( avg>=80.0) 
			System.out.println("합격");
		else if( (avg>=70.0) &&(avg<=79.0 ) ) 
			System.out.println("대기순번");
		else 
			System.out.println("불합격");
	}

}
