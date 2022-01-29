package days05;

import java.util.Scanner;

public class PracticeControllOpIf08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot;
		double ave;
		System.out.printf("국어점수 : ");
		kor = sc.nextInt();
		System.out.printf("영어점수 : ");
		eng = sc.nextInt();
		System.out.printf("수학점수 : ");
		mat = sc.nextInt();
		tot = kor+eng+mat;
		ave = tot / 3.0;
		
		// 평균 60점 이상이면서 모든 과목에 40미만이 없다면 합격
		// 그렇지 않다면 불합격을 출력하되, 
		// 해당되는 불합격사유(평균 미달, 국어 과락, 영어과락, 수학과락)를 
		// 모두 함께 출력하세요
		if(ave>=60 && kor>=40 && eng>=40 && mat>=40) System.out.println("합격");
		else { System.out.printf("불합격 // 사유 : ");
		if(ave<60) System.out.printf("평균미달 ");
		if(kor<40) System.out.printf("국어과락 ");
		if(eng<40) System.out.printf("영어과락 ");
		if(mat<40) System.out.printf("수학과락 ");
		}
	}

}
