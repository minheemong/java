package days14;
class SuperC {
	//public SuperC() { } // 방법2
	public SuperC(int num) {
		System.out.println("부모클래스의 매개변수가 있는 생성자");
	}
}
class SubC extends SuperC {
	// 부모클래스의 디폴트 생성자가 존재하지 않는 경우
	// 자식클래스의 생성자에서는 반드시 super를 사용하여 명시적으로 매개변수가 있는
	// 부모클래스의 생성자를 호출해야합니다.
	public SubC() { //에러
		// 숨어있는 부모생성자 호출 명령은 super(); -> 부모의 디폴트 생성자 호출
		//super(10); // 방법1 
		this(10);
		System.out.println("자식클래스의 매개변수가 있는 생성자1");
	}
	public SubC(int n) { 
		super(10);
		System.out.println("자식클래스의 매개변수가 있는 생성자2");
	}
	// 호출했으면 그에 맞는 부모생성자가 있거나, 없으면 지금 존재하는 부모생성자에
	// 맞춰서 호출하거나...
	// 컴파일러에 의해 자동으로 삽입되는 코드 super();
	// 부모클래스의 디폴트 생성자를 실행하는 코드이므로 디폴트 생성자가 없는 경우
	// 에러 발생
}
public class Extends05 {

	public static void main(String[] args) {
		SubC c = new SubC();
		SubC d = new SubC(1);
	}

}
