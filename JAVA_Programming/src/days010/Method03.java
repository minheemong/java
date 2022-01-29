package days10;

public class Method03 {
	// 매개변수의 역할과 생명 주기
	
	// 1. main 영역에서 전달인수로 넣어주는 변수와 updateValue 영역의
	//     매개변수로 쓰이는 변수의 이름 같아도 상관없습니다.
	//     위에서 언급한 두변수는 지역변수라고 부르며, 서로 다른 변수로 사용됩니다.

	// 2. 전달인수의 변수값이 매개변수 변수로 "값"만 전달되는 방식을
	//     Call by Value 라고 부릅니다
	public static void main(String[] args) {
		int num = 10;
		System.out.printf("main의 num -> %d\n", num);
		updateValue(num);
		System.out.printf("main의 num -> %d\n", num);
	}
	// updateValue의 num = main의 num;  오른쪽 변수값을 왼쪽 변수에 대입.
	public static void updateValue(int num) {
		num = 100;
		System.out.printf("updateValue의 num -> %d\n", num);
	}
	// 지역변수 : { } 중괄호 안에 선언된 변수를 지역변수라고 부릅니다.
	// 지역변수를 자신을 생성하는 명령이 감싸진 { }중괄호를 벗어나면 소멸됩니다.
}
