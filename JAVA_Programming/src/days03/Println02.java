package days03;

public class Println02 {

	public static void main(String[] args) {
		// Printf03 에서 만들었던 성적표를 Println 명령을 이용하여 출력해주세요
		// 숫자들의 오른쪽정렬은 하지 않아도 됩니다. 
		// 소수점 조절도 하지 않아도 됩니다
		System.out.println("\t\t###성적표###");
		System.out.println("--------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------");
		System.out.println("1\t홍길동\t\t85\t56\t79\t"
						+ (85+56+79) + "\t" + (85+56+79)/3.0 );
		System.out.println("2\tGildong\t100\t100\t100\t"
						+ (100+100+100)+"\t"+(100+100+100)/3.0);
		System.out.println("--------------------------------------------------");
	}

}
