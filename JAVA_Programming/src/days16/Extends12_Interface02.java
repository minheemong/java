package days16;
// 인터페이스는 멤버필드로 public static final 멤버만 가질 수 있습니다
// 인터페이스는 멤버메소드로 public abstract 메소드만 가질 수 있습니다
interface InterB{
	public static final int n1 = 1;
	public static final int n2 = 2;
	// 인터페이스 내부에 선언되는 멤버필드는 public static final을 생략할 수 있습니다.
	int n3 =3;
	// public static final이 생략된 변수와 일반 멤버변수는 초기값의 유무에
	// 따라 구분됩니다.
	//int n3; //값이 초기화 되지 않은 변수는 일반 멤버변수로 인식되어 에러
	public abstract void test1();
	public abstract void test2();
	// 인터페이스 내부에 선언되는 메소드는 public abstract를 생략할 수 있습니다.
	void test3();
	// public abstract가 생략된 메소드와 허용되지 않는 일반 메소드는 { }의
	// 유무에 따라 구분됩니다
}
public class Extends12_Interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
