
package days15;
//Object 클래스의 equals 메소드 : 객체간의 비교를 위해서 사용되는 메소드
//Object 가 상속한 메서드들 중 toString과 함께 가장 많이 오버라딩 되는 메서드
public class Extends10_Object03 {

	public static void main(String[] args) {
		// 일반적, 기본 자료형들의 값의 비교는 비교연산자(==)를 사용합니다
		int n1 = 10;
		int n2 = 10;		
		if( n1 == n2 )	System.out.println("n1 변수와 n2 변수는 같습니다.");
		else 	System.out.println("n1 변수와 n2 변수는 다릅니다.");
		
		String s1 = "Hello";
		String s2 = "Hello";
		if( s1 == s2 )	System.out.println("s1 변수와 s2 변수는 같습니다.");
		else	System.out.println("s1 변수와 s2 변수는 다릅니다.");
		// s1 에는 HEAP 영역에 "Hello" 를 저장한후 그주소가 리턴되어 저장됩니다.
		// s2 에는 이미 HEAP 영역에 "Hello" 가 저장되어 있으므로, 그주소가 저장됩니다.
		// 이는 모두 new  키워드가 없어서 새로운 공간이 안생겼기때문에 일어나는 현상입니다
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		if( s3 == s4 )	System.out.println("s3 변수와 s4 변수는 같습니다.");
		else	System.out.println("s3 변수와 s4 변수는 다릅니다.");
		// 앞선 명령과 달리 이번엔 new  키워드를 사용하여 서로 다른 공간에  Hello 를
		// 저장하고 각각의 주소를 s3 d와 s4 에 저장합니다
		// 결국 (==) 이 연산자는 글자들의 비교가 아니라, 레퍼런스 주소들의 비교라는
		// 의미 입니다.
		
		// 실제 객체의 값을 비교하기 위한 equals 메소드를 사용하면 참조값이 서로 다른 
		// 객체의 실제 데이터를 비교하여 동일한 데이터를 가지고 있는지 확인할 수 있습니다.
		if( s3.equals(s4) )
			System.out.println("s3 변수와 s4 변수는 같습니다.(equals)");
		else	
			System.out.println("s3 변수와 s4 변수는 다릅니다.(equals)");
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		if( p1.equals(p2) )
			System.out.println("p1 변수와 p2 변수는 같습니다.(equals)");
		else	
			System.out.println("p1 변수와 p2 변수는 다릅니다.(equals)");
		
		// equals 메서드는 Object 클래스의 메서드로서 최초는 레퍼런스값(주소)들의 
		// 비교를 정의하고 있습니다.
		// String 클래스는 이미 equals 메서드를 실제값의 비교로 오버라이딩 되어 있으며
		// 기타 다른 사용자 정의 클래스에서는 별도로 equals 를 실제값으로 비교하도록 
		// 오버라이딩 해줘야 합니다
	}
	
}
