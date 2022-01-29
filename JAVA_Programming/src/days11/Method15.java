package days11;

public class Method15 {

	public static void main(String[] args) {
		//cals메서드 생성 (전달된 문자열에 따라 입력된 숫자들의 평균 또는 합계를 출력하는 메서드)
		cals("합계",98,78,45,12,23,87,69,59);
		System.out.println();
		cals("평균",98,78,45,12,23,32,98,63,25,87);
	}
	public static void cals(String op, int ... a) {
		int tot=0;
		if( op.equals("합계")) {
			for(int i=0; i<a.length; i++) tot = tot + a[i];
			System.out.printf("합계 : %d" , tot);
		}else {
			for(int i=0; i<a.length; i++) tot = tot + a[i];
			System.out.printf("평균 : %.1f" , tot/(double)a.length);
		}
	}

}
