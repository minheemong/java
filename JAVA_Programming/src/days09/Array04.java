package days09;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생이 몇명입니까?");
		int std=sc.nextInt();
		// 필요한 각 배열의 선언
		int [] kor = new int[std]; // 3명의 학생의 국어 점수 저장용
		int [] eng = new int[std]; // 영어 점수용
		int [] mat = new int[std]; // 수학점수용
		int [] tot  = new int[std]; // 총점 용
		double [] avg = new double[std];   // 평균용
		
		
		
		/* System.out.printf("1번학생의 국어 점수 : ");
		kor[0] = sc.nextInt();
		System.out.printf("1번학생의 영어 점수 : ");
		eng[0] = sc.nextInt();
		System.out.printf("1번학생의 수학 점수 : ");
		mat[0] = sc.nextInt(); */
		for(int i=0; i<std; i++) {
			System.out.printf("%d번 학생의 국어점수 : ", i+1);
			kor[i] = sc.nextInt();
			System.out.printf("%d번 학생의 영어점수 : ", i+1);
			eng[i] = sc.nextInt();
			System.out.printf("%d번 학생의 수학점수 : ", i+1);
			mat[i] = sc.nextInt();
			
			// tot[i] = kor[i] + eng[i] + mat[i];
			// avg[i] = tot[i] / 3.0;
		}
		for(int i = 0; i<std; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;
		}
		System.out.println("\t\t###성적표###");
		System.out.println("-------------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		for(int i = 0; i<std; i++)
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", 
					i+1, kor[i], eng[i], mat[i], tot[i], avg[i] );
		System.out.println("-------------------------------------------------");
	}
}
