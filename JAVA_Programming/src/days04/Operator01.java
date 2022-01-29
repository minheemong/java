package days04;
// 산술-사(오)칙연산자) +, -, /, *, %
// 관계연산자-비교연산가) >, < , >=, <= , == ,!=
// 논리연산자) &&(And), ||(Or), !(Not)
public class Operator01 {

	public static void main(String[] args) {
		// 산술연산자 +, -, /, *, %
		int n1 =10, n2 = 7, result1;
		double result2, result3;
		result1 = n1 + n2;
		System.out.println(n1 + "+" + n2 + "=" + result1);
		result1 = n1 - n2;
		System.out.println(n1 + "-" + n2 + "=" + result1);
		result2 = n1 * n2;
		System.out.println(n1 + "×" + n2 + "=" + result2);
		result2 = n1 / (double)n2;
		System.out.println(n1 + "/" + n2 + "=" + result2);
		// 1.4285714285714286 * 100 -> 142.85714285714286
		// (int)142.85714285714286 -> 142 
		// 142 / 100.0 -> 1.42
		result3 = (int)(result2 * 100) /100.0;
		System.out.println(n1 + "/" + n2 + "=" + result3);
		
		// 자료형과 산술연산
		byte b1 = 10;
		byte b2 = 5;
		// 정수 (byte 또는 short 포함)와 정수의 산술 연산이 일어나면 결과 값은
		// int 타입이 됩니다
		// byte b3 = b1 + b2 ; //에러
		// 아래와 같이 연산의 결과를 byte 및 short 변경하여 대입할 수 있습니다.
		// byte b3 = (byte)(b1 + b2);
		

		// 캐스트 연산은 호환이 가능한 자료끼리만 사용가능합니다.
		//  올바른 예 (실수->정수)
		double d1 = 1.23456;
		int a = (int)d1; // a 변수에 1이 저장
		//	올바른 예 (정수->실수)
		double d2 = (double)a; // d2 변수에 1.0이 저장
		
		//  잘못된 예 (문자->숫자)
		// String str = "12346";
		// int a = (int)str; //에러
		// 호환이 되지 않은 자료들간의 형변환은 별도의 도구(메서드)가 필요합니다
		String str = "12346";
		int b = Integer.parseInt(str);
		// 별도의 형변환 도구 메서드는 이후 단원에서 자세히 학습합니다
	}

}
