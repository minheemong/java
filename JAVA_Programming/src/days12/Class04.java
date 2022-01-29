package days12;

class Student{
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;
	void init(int b, String n, int k, int e, int m) {
		b=bun;  n=name; k=kor; e=eng; m=mat;
		int tot=k+e+m;
		double ave= tot/3.0;
	}
	void prn() {
		System.out.println("\t\t=====성적표=====");
		System.out.println("-----------------------------------------------------");
		System.out.printf("번호\t이름\t\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n"
				,bun,name,kor,eng,mat,tot,ave);
	}
	public double getAve() {
		return ave;
	}
}

public class Class04 {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.init(1,"홍길동",89,56,67); // 번호, 이름 , 세 점수 입력 총점 평균 계산
		std1.prn(); // 성적표 출력
		System.out.printf("std1학생의 평균 %.2f\n",std1.getAve()); // 평균리턴
	}

}
