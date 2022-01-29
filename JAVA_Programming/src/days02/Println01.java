package days02;

public class Println01 {

	public static void main(String[] args) {
		//  println() 은 printf("\n") 와 같은 동작을 합니다.
		// println 은 \n 이 없어도 모든 출력 후 줄바꿈을 한번 실행해 줍니다.
		// System.out.println("\n");  <-- 두줄바꿈
		// printf  와 같이 format 양식 글자를 사용하지 못합니다. 
		// 다만 printf 보다 출력이 간단합니다
		System.out.println(10);  // 10 출력
		System.out.println(12.123);  // 12.123 출력
		System.out.println("Java Programming"); // 문자 출력
		// 	100 - 숫자(정수)  "100" - 문자
		System.out.println(100);
		System.out.println("100");   
		
		// 자바에서는 + 연산자를 문자들의 또는 데이들의 이어붙이기(결합) 연산으로도 
		// 사용할 수 있습니다
		System.out.println("10" + "5");
		System.out.println("10" + 5);
		System.out.println(10 + "5");
		System.out.println(10 + 5);  // 산술 덧셈
		System.out.println("Hello " + "World~!");
		// 10 + 5 = 15   를 출력하고 싶을때
		System.out.println(10 + " + " + 5 + " = " + (10+5) );
		System.out.println("10 + 5" + " = " + (10 + 5));
		System.out.println("10 + 5 = " + (10 + 5));
		System.out.println("10 + 5 = 1" + 5);
		System.out.println( "10 + 5 = 15");
		System.out.println(10 + " + " + 5 + " = " + 10+5 );
	}

}
