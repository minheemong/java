package days11;

import java.util.Scanner;

public class Method16 {

	public static void main(String[] args) {
		
		int [][] scores;
		//int s=getStudentNumber(); // 학생수를 입력 받아서 리턴하는 메서드
		//int k=getSubjectNumber(); // 과목수를 입력 받아서 리턴하는 메서드
		//scores = new int[s][k];
		scores = new int[getStudentNumber()][getSubjectNumber()];
		input(scores);  // s 명의 학생의 k 개의 과목수 입력
		output(scores); // 총점 평균 계산후 성적표 출력
		// 			-------- 성적표 -------------
		//-------------------------------------------------
		//번호 과목1	 과목2  과목3.....   총점     평균
		//------------------------------------------------
	}
	public static void output(int s [][]) {
		int k = s[0].length;
		System.out.println("\t\t==========성적표==========");
		System.out.println("----------------------------------------------------------");
		System.out.printf("번호\t");
		for(int i=0;i<k-1;i++) System.out.printf("과목%d\t",i+1);
		System.out.printf("총점\t평균\n");
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<s.length;i++) {
			System.out.printf("%d\t",i+1); //번호
			for(int j=0;j<k;j++) 
				System.out.printf("%d\t",s[i][j]); //과목 점수, 총점
		}
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) 
				System.out.printf("%2f\n",s[i][k-1]/(double)(k-1));
		}
	}
	public static void input(int [][] s) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length-1;j++) { 
				System.out.printf("%d학생 %d과목 수 입력 : ",i+1,j+1);
				s[i][j]=sc.nextInt();
				s[i][s[i].length-1]+=s[i][j]; // 현재 입력값을 마지막 열에 누적
			}
		}
	}
	public static int getSubjectNumber() {
	Scanner sc=new Scanner(System.in);
	System.out.printf("과목 수 입력 : ");
	return sc.nextInt();
	}
	public static int getStudentNumber() {
	Scanner sc=new Scanner(System.in);
	System.out.printf("학생 수 입력 : ");
	return sc.nextInt();
	}
}
