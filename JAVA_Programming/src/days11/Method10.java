package days11;

import java.util.Scanner;

public class Method10 {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double ave;
		String grade;	
		kor = myInput(1); //점수 입력
		eng = myInput(2);
		mat = myInput(3);
		tot = sum(kor, eng, mat); // 총점 계산
		ave = avg(kor, eng, mat); // 평균 계산
		prn(tot, ave); // 총점, 평균, 학점 출력
	}
	
	private static void prn(int tot, double ave) {
		System.out.printf("총점 : %d, 평균 : %.2f", tot, ave);		
	}

	public static double avg(int kor, int eng, int mat) {
		int total = sum(kor, eng, mat);
		return total/3.0;
	}
	public static int sum(int kor, int eng, int mat) {
		return kor+eng+mat;
	}
	public static int myInput(int n) {
		if(n==1) System.out.printf("국어점수 : ");
		else if(n==2) System.out.printf("영어점수 : ");
		else System.out.printf("수학점수 : ");
		
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
