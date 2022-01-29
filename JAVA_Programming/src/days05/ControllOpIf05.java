package days05;

import java.util.Scanner;

public class ControllOpIf05 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		a = sc.nextInt();
		
		// 90 이상 A학점, 80~89 B학점, 70~79 C학점, 
		// 60~69 D학점, 60 미만 F학점
		if( a >= 90 )	System.out.println("A학점");
		else if( a>=80 && a<=89 ) System.out.println("B학점");
		else if( a>=70 && a<=79 ) 	System.out.println("C학점");
		else if( a>=60 && a<=69 ) 	System.out.println("D학점");
		else 	System.out.println("F학점");
		// ( ) > 산술연산 > 관계(비교)연산 > 논리연산
		//---------------------------------------------------------------
		if( a>=90 )	System.out.println("A학점");
		else if( a>=80 ) System.out.println("B학점");
		else if( a>=70 ) System.out.println("C학점");
		else if( a>=60 ) System.out.println("D학점");
		else System.out.println("F학점");
		//---------------------------------------------------------------
		/*  잘못된 예
		if(a<60) System.out.println("F학점");
		else if( a>=60 ) System.out.println("D학점");
		else if( a>=70 ) System.out.println("C학점");
		else if( a>=80 ) System.out.println("B학점");
		else  System.out.println("A학점");
		*/
		if( a < 60 )	System.out.println("F학점");
		else if( a < 70 ) System.out.println("D학점");
		else if( a < 80 ) 	System.out.println("C학점");
		else if( a < 90 ) 	System.out.println("B학점");
		else 	System.out.println("A학점");
		
		// if( ) { } , else if(  ) { } 에서 괄호() 안에는  
		// 해당 구문에 해당하는 명령{ }을 실행할지, 건너뛰고 실행하지 않을지를
		// 결정할 관계(비교) 연산식 또는 boolean 값이 들어갑니다
		// 만약 if 문을      if( true ){ }  이와 같이 작성했다면
		// { } 안의 명령은 ( ) 안의 값이 true 이므로 항상 실행됩니다
		// 반대로 if(false){ } 라면 항상 실행되지 않습니다.
		// if , else if , else 를 구성할때는 각 구간들의 값들을 빠짐없이 챙겨서 
		// 구간을 구성하는 것이 중요합니다
		

	}

}
