package days16;
// 자바언어에서 제공하는 상속기능은 단일 상속만을 지원합니다.
// 하나의 클래스는 하나의 부모클래스를 가질 수 있습니다.
// (여러개의 클래스를 상속할 수 없음)
//class SubA extends SuperA,SuperB {} //에러

// 다중 상속을 위해 만들어진 interface
// 인터페이스도 클래스입니다. 다만 제약이 있는 클래스입니다
// 인터페이스는 멤버필드로 public static final 멤버만 가질 수 있습니다.
// 인터페이스는 멤버메소드로 public abstract 메소드만 가질 수 있습니다.
// 다중 상속이 가능합니다

// class 만들듯이 생성하며, class란 키워드 대신 interface라는 키워드를
// 써서 생성합니다.
interface InterA {
	//int n1; //에러. 일반변수는 생성하지 못합니다
	//InterA() { } //에러. 추상메소드만 생성 가능, 일반메소드는 생성자도 생성 불가
	//public void print() {} //에러. 일반메소드 선언 불가(추상메소드만 생성 가능)
	
	//인터페이스 내부에 선언할 수 있는 요소
	public static final int num =10;
	public abstract void test();
}

// 인터페이스는 상속X 구현O
// 인터페이스를 상속(구현)하는 클래스는 상속(구현)할 클래스 앞에
// extends 대신 implements를 씁니다
class SubA implements InterA{
	@Override
	public void test() {
		System.out.println("SubA 클래스의 test 메소드 실행");
	}
	
}
public class Extends12_Interface01 {

	public static void main(String[] args) {
		// 인터페이스는 객체를 생성할 수 없습니다
		// 1. 생성자가 없으므로 객체 생성 불가
		// 2. 추상메소드를 포함할 수 있기 때문에...
		//InterA a = new InterA(); //에러
		
		// 상속을 통한 다형성 구현에만 인터페이스가 활용됨
		// 부모인터페이스의 레퍼런스를 사용하여 자식클래스의 객체를 참조 가능
		InterA a = new SubA();
		// 부모인터페이스의 레퍼런스를 사용하여 자식클래스의 오버라이딩된 메소드를 호출
		a.test();
	}

}
