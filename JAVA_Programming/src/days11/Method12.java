package days11;

public class Method12 {

	public static void main(String[] args) {
		// 메서드 오버로딩
		// 메소드의 이름은 같고, 매개변수의 타입, 개수, 순서가 다르면 서로 다른 메소드로 
		// 인지하는 문법
		// 일관된 메소드 이름을 사용하여 사용자에게 직관적인 이름을 사용하게 합니다
		// 전달인수(매개변수)의 자료형, 순서 등이 서로 달라도 가능
		System.out.println("두 개의 정수 중 큰 값 " + max(11, 33) );
		System.out.println("두 개의 실수 중 큰 값 " + max(12.8, 12.5) );
		
		// 정의된 메서드들의 매개변수들과 맞지 않은 호출은 에러입니다
		// System.out.println("세 개의 정수 중 큰 값 " + max(11, 33, 55) ); //에러
		// System.out.println("세 개의 실수 중 큰 값 " + max(11.0, 33, 33.5) );//에러
	}
	public static int max(int a, int b) {
		int maxValue = (a>b)? a : b;
		return maxValue;
	}
	public static double max(double a, double b) {
		double maxValue = (a>b)? a : b;
		return maxValue;
	}

}
