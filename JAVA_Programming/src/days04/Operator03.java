package days04;

public class Operator03 {

	public static void main(String[] args) {
		// 관계연산자
		// (좌항 기준)
		// >(초과), <(미만), >=(이상), <=(이하), ==(같다), !=(같지않다)
		// 좌항과 우항의 크기를 비교하여 true/false 값이 결과가 되는 연산
		// 관계식이 올바른 경우 true, 관계식이 틀린 경우 false가 연산의 결과가 됩니다
		int n1 = 10;
		int n2 = 5;
		boolean result;
		
		result = n1 > n2;
		System.out.printf("%d > %d = %b\n", n1, n2, result);
		// %b : printf에서 boolean타입의 값을 출력하는 이스케이프 문자
		result = n1 < n2;
		System.out.printf("%d < %d = %b\n", n1, n2, result);
		result = n1 >= n2;
		System.out.printf("%d >= %d = %b\n", n1, n2, result);
		result = n1 <= n2;
		System.out.printf("%d <= %d = %b\n", n1, n2, result);
		result = n1 == n2;
		System.out.printf("%d == %d = %b\n", n1, n2, result);
		result = n1 != n2;
		System.out.printf("%d != %d = %b\n", n1, n2, result);
		
		// 문자(char) 데이터의 비교 : 각 데이터가 갖는 아스키 코드 값으로 비교
		char c1 = 'A', c2 = 'B';
		result = c1>c2;
		System.out.printf("%c > %c -> %b\n", c1, c2, result);
		result = c1<c2;
		System.out.printf("%c < %c -> %b\n", c1, c2, result);
		
		// String 데이터의 비교
		String s1 = "1234", s2 = "978";
		// s1과 s2 는 String 자료형이며, 다른 자료형과 다르게 이 두 변수가
		// 직접 문자들을 저장하고 있지 않습니다.
		// 문자들은 별도의 장소에 저장되고, 변수는 저장 위치값만 저장하고 있습니다
		// 따라서 변수들간의 비교(s1>s2)는 위치정보의 비교이므로 의미가 없습니다.
		
		// 크다 작다를 판단해주는 compareTo()
		// 같다 다르다를 판단해주는 equals()
		
		// String 자료간의 비교는 대부분 위의 두 도구를 이용합니다.
		
		int r = s1.compareTo(s2);
		// s1이 크면 양수를, s2가 크면 음수를 발생. & 변수 r 에 저장. 같으면 0이 발생
		// 앞글자(s1)에서 뒷글자(s2)의 아스키 코드값을 뺀 값(정수)을 결과로 얻음
		System.out.printf("%s > %s => %d\n", s1, s2, r);
		r = s2.compareTo(s1);
		System.out.printf("%s < %s => %d\n", s1, s2, r);
		
		boolean b = s1.equals(s2); // 둘이 같으면 true, 다르면 false
		System.out.printf("%s == %s => %b\n", s1, s2, b);
		
	}

}
