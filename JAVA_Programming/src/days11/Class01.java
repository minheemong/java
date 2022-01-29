package days11;
//클래스(class) 
// -> 프로그램으로 처리하고자 하는 대상을 자료화하여 
// 하나의 자료형으로 정의(속성/기능)한 사용자 정의 자료형
// 쉽게 말해 개발자가 필요에 의해 정의한 자료형입니다.

// 만드는법 : class 라는 카워드를 이용하여 만듭니다
class 클래스이름{
	// 멤버필드
	int 변수1;
	double 변수2;
	String 변수3;
	int [] 배열1 = new int[5];
	
	// 멤버 메서드
	public void 메서드1() { 	}
	public static void 메서드2() { 	}
}


// 클래스 First  생성
class First{
	int n1;
	int n2;
	// 속성(멤버필드, 멤버변수, 필드) : 클래스에 속한 정보(변수)들. 
	// 속성은 변수로 생성하며 클래스의 멤버필드라고도 호칭합니다
}
public class Class01 {
	
	public static void main(String[] args) {
		// 클래스의 변수 선언
		First a1;
		// 새로 만들어진 클래스의 변수는 위와 같이 생성합니다.
		// 생성된 변수는 레퍼런스(참조)변수입니다.
		// 배열때와 마찬가지로, new 명령을 이용하여  Heap 영역에 
		// 적정 공간(클래스가 정의된 크기만큼)을 확보한후, 
		// 그 주소를  a1 변수에 저장하여 사용합니다.
		// 레퍼런스 변수와  new 에 의해 만들어진 공간이 합쳐지면,
		// 이를 객체라고 부릅니다.
		a1 = new First();
		// 위와 같이 공간이 할당되면 이제부터. n1, n2  변수가 사용이 가능합니다.
		First a2 = new First();
		// 객체가 두개가 만들어지면, a1에 도 n1, n2 가 생성되고,
		// a2 에도 n1,n2 가 생성되므로, 그들을 구분하기위해
		// a1.n1   a1.n2     a2.n1    a2.n2   로 사용합니다.
		System.out.println(a1.n1);
		System.out.println(a1.n2);
		a2.n1 = 30;
		a2.n2 = 40;
		System.out.println(a2.n1);
		System.out.println(a2.n2);
	}

}
