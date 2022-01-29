package days05;

import java.util.Scanner;

public class ControllOpIf02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = a % 2;
		
		if( b==0 ) {
			System.out.printf("입력한 정수 %d 는 짝수 입니다\n", a);	
		} else {
			System.out.printf("입력한 정수 %d 는 홀수 입니다\n", a);
		}
		
		int kor=70 , eng=98, mat=95;
		double avg = (kor+eng+mat)/3.0;
		// 평균이 80 이상이라면 합격이라고 출력하세요
		System.out.println("단일 if 문 실행 : ");
		if(avg >=80.0) {
			System.out.println("합격");
		}
		// 평균이 80이상 합격, 아니면 불합격 을 출력
		System.out.println("if~else 문 실행 : ");
		if(avg >=80.0) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 평균 60이상이거나  영어점수가 80이상이라면  합격, 아니면 불합격
		if( (avg>=60) || (eng>=80) ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		// 평균 60이상이면서  모든과목 40이상 이라면 합격, 아니면 불합격
		if( (avg>=60)&&(kor>=40)&&(mat>=40)&&(eng>=40)  ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		// 평균 60이상이거나  모든과목 50이상 이라면 합격, 아니면 불합격
		if( (avg>=60) || ( (kor>=50)&&(mat>=50)&&(eng>=50) ) ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}
