 package days04;

public class Variable08 {

	public static void main(String[] args) {
		// 문자 타입의 변수 초기화 : 하나의 글자를 다른 데이터와 구분하기 위해 (' ')
		// 작은따옴표를 사용합니다
		// (" ") 큰따옴표는 하나 이상의 데이터가 될 가능성이 있는 문자열(String)이며,
		// 문자(char) 데이터와 구분됨
		char ch = 'A';
		// printf 에서 문자데이터에 쓰이는 이스케이프 문자는 %c
		System.out.printf("ch -> %c\n", ch);
		
		// 문자가 저장될때는 문자 코드표(ASCII 코드)에 의한 이진수 코드가 저장됩니다
		// 이를 정수화하기 위한 캐스트 연산을 하면, 이진수 -> 십진수로 변환된 값이
		// 발생합니다 A -> 65
		System.out.printf("ch -> %d\n", (int)ch);
		// (형변환(캐스트연산) :
		//     데이터의 타입을 임시로 변경하는 연산 -> (자료형)변경할값/변수)
		
		System.out.printf("A -> %d, a -> %d\n", (int)'A', (int)'a');
		System.out.printf("Z -> %d, z -> %d\n", (int)'Z', (int)'z');
		System.out.printf("0 -> %d, 9 -> %d\n", (int)'0', (int)'9');
		
		// 대문자 A 값에 32를 더하여 소문자 a로 변경
		System.out.printf("%c + 32 -> %c\n", ch, ch + 32);
		
		// 아라비아 기호 '8'에서 '0' 을 빼면, 정수 8이 결과로 나옵니다.=
		System.out.printf(" '8'-'0' -> %d\n", '8' - '0');
		
		// 실수형 변수의 초기화
		// 자바에서 모든 실수들은 기본적으로 double 타입으로 인식합니다
		// float 타입으로 값을 저장하기 위해서는 float 형 변수를 선언하고
		//  float 형 데이터를 저장합니다.
		// float 변수에 double 형 데이터 입력 -> 에러
		// float f = 1.123; // 에러
		// float 변수에 float 형 데이터 입력 -> 정상실행
		float f2 = 1.123f; // 또는 float f2 = 1.123F;
		// float 변수에 캐스팅 연산을 적용한 double 형 데이터 입력 -> 정상실행
		float f3 = (float)1.123;
		// 출력형식은 double 과 같은 형식이 사용됩니다.
		System.out.printf("%.1f\t%.1f\n", f2, f3);
		// 정수들의 값의 대입
		int a = 100;
		byte b = (byte)a;
		byte b2 = 123;
		a=b2;
		
		// 용량이 큰 변수값을 용량이 작은 변수 값으로 넣으려고 하면 캐스팅 연산 필요
		// 반대의 경우는 문제없이 모든 실행이 가능합니다.
		
				
		
	}

}
