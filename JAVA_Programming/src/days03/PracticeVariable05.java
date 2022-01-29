package days03;

import java.util.Scanner;

public class PracticeVariable05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1, kor, eng, mat, total;
		double avg;
		String name;
		System.out.printf("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.printf("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.printf("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.printf("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();
		total = kor + eng + mat ;
		avg = total / 3.0 ;
		System.out.println("\t\t###성적표###");
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println(num+"\t\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+avg);
		System.out.printf("%d\t\t%s\t%d\t%d\t%d\t%d\t%.2f\n",num,name,kor,eng,mat,total,avg);
		System.out.println("----------------------------------------------------");
		

	}

}
