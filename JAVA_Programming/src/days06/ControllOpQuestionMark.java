package days06;

import java.util.Scanner;

public class ControllOpQuestionMark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		// 점수가 70점 이상이면 합격, 아니면 불합격을 출력하세요
		
		String prnText;
		
		//if( score >= 70 ) prnText = "합격";
		//else prnText= "불합격";
		
		prnText = ( score >= 70 )? "합격" : "불합격";
 		System.out.println("입력한 점수는 " + prnText + "입니다");
		
 		System.out.printf("기본급 입력하세요 : ");
		int a = sc.nextInt();
		// 기본급 100만원 이상이면 50%, 미만이면 60%를 가산하여 지급액을 출력
		double per = (a>=100)? 0.5 : 0.6;
		System.out.println("총지급액"+(int)(a+a*per));
		
		double b = (a>=100)? a+a*0.5 : a+a*0.6;
		System.out.println("총지급액"+(int)b);
		
		// 왜 에러인지 모르겠음
		//(a>=100)? System.out.println("총지급액"+(a+a*0.5)); 
		//		: System.out.println("총지급액"+(a+a*0.6));
			
	
	}

}
