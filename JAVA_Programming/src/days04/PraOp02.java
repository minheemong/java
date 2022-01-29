package days04;

public class PraOp02 {

	public static void main(String[] args) {
		int n =52;
		System.out.println(n);
		// 다른 연산 참여 후 1 증가
		System.out.println( n++);
		System.out.println( n);
		
		n = 52;
		System.out.println("현재 n값 : " + n);
		// 1증가 후 다른 연산에 참여
		System.out.println("println(++n) -> :" + ++n);
		System.out.println("출력연산 후 n값 :" + n);
	}

}
