package days14;
// 일반 객체의 생성과정
// 1. 멤버필드 메모리 로딩
// 2. 생성자 호출

// 상속관계에서 객체 생성과정
// 1. 멤버필드의 메모리 로딩 - 부모/자식 클래스의 모든 멤버필드가 메모리 로딩
// 2. 생성자 호출(먼저 자식 클래스의 생성자 호출)
// 3. 자식클래스 생성자의 첫 번째 실행 코드인 super()에 의해 부모클래스의
//     생성자 호출. super()라는 명령은 따로 쓰지 않아도 이미 존재하며 부모클래스가
//     있다면 자동 호출되는 명령.
// 4. 자식클래스 생성자의 나머지 코드 실행
// - 부모클래스의 private 멤버와 같은 경우 자식클래스에서 초기화를 할 수 없기
//    때문에 부모클래스의 생성자를 통해 초기화 실행
class SuperB {
	int superNum;
	public SuperB() {
		System.out.println("부모클래스의 생성자 실행");
	} // 부모클래스 생성자
}
class SubB extends SuperB { // SuperB 상속
	int subNum;
	// 생성자를 별도로 꺼내 정의하지 않았다면...
	// 보이지 않는 곳에 디폴트 생성자가 존재할 것이며 , 그의 첫번째 명령은 
	// 아래와 같이 super(); 이다
	// SubB() {super();}
	
	// 디폴트 생성자를 별도로 꺼내 정의한 경우...
	SubB() {
		super(); // 생략 가능 
		// 자식클래스에서 부모클래스 생성자 호출은 super();라고 명령하며,
		// 반드시 첫 번째 실행코드로 씁니다.
		// 다만 부모클래스의 생성자가 오버로딩되거나 하지 않는다면 쓰지 않아도
		// super(); 명령이 실행된다
		// 부모클래스 생성자가 디폴트 생성자만 있을 시 super(); 명령 생략 - 자동 호출
		System.out.println("자식클래스의 생성자 실행");
	}
	// 매개변수가 있는 생성자가 오버로딩된 경우... this()로 형제 생성자를 호출한 경우...
	public SubB(int subNum) { // 오버로딩된 자식클래스 생성자
		// 자식클래스의 오버로딩된 생성자의 첫 번째 실행코드는 super() 또는
		// this()를 코딩하는데 그 둘을 같이 실행할 수는 없다
		// 현재 클래스의 매개변수가 없는 생성자를 this()로 호출하고 그 안에서
		// super()가 실행되도록 한다.
		this();
		System.out.println("자식클래스의 오버로딩된 생성자 실행(this()O)");
		// 부모나 형제 생성자에 매개변수가 있는 경우 반드시 호출하려는 super()
		// 또는 this()의 매개변수에 맞춰 전달인수를 전달한다
	}
	//매개변수가 있는 생성자가 오버로딩된 경우...
	// this()로 형제 생성자를 호출하지 않은 경우
	public SubB(int subNum, int num) {
		super();
		System.out.println("자식클래스의 오버로딩된 생성자 실행(this())X");
	}
}

public class Extends04 {

	public static void main(String[] args) {
		SubB b = new SubB();
		System.out.println();
		SubB c = new SubB(20);
		System.out.println();
		SubB d = new SubB(20,40);

	}

}
