package days10;
// 리턴 값이 존재하는 메소드의 선언
// 메소드 호출 후 메소드에서 계산되어진 결과를 호출한 지점에서 사용하고자 할 때
// return 명령으로 호출된 지점으로 전달할 수 있습니다.
public class Method06 {

	public static void main(String[] args) {
		int num = 77;
		int p = squar(num);
		System.out.printf("%d 의 제곱은 %d 입니다\n", num, p);
		
		int max_result = max(10,5,17);
		//리턴값은 메서드 호출 명령대신 왼쪽 변수에 저장되도록 위치하게 됩니다.
		System.out.printf("가장 큰 숫자는? -> %d\n", max_result);
	}
	// 5 -> k	k*k -> s	s->p
	// 리턴값의 타입이 선언된 메소드는 실행의 결과를 호출한 지점으로 반환할 수 있습니다
	// 리턴값이 있는 메소드 생성 시 void를 썼던 자리에 리턴값의 자료형을 써줍니다
	public static int squar(int k) {
		int s = k*k;
		//System.out.printf("%d 의 제곱은 %d 입니다\n", k, s);
		return s;
	}
	// 메소드의 실행 결과를 호출한 지점으로 반환하기 위해서 사용되는 return 키워드
	// return 키워드의 우항에 값 또는 변수 또는 수식이 존재하는 경우
	// 우항의 값 또는 실행 결과를 메소드를 호출한 지점으로 반환(return)
	public static int max(int a,int b,int c) {
		int mv;
		if(a>b) mv=a;
		else mv=b;
		if(mv<c) mv=c;
		return mv;
	}
}
