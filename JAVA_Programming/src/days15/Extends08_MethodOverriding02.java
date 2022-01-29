package days15;
//메소드 오버라이딩
//1. 메소드의 이름이 동일해야 합니다.
//2. 메소드의 매개변수타입, 개수, 순서가 다를 경우 
//   같은 이름의 메소드라도 다른 메소드로 인식합니다.
//3. 상속관계에서만 사용할 수 있습니다.
//4. 부모클래스의 메소드의 원형과 반드시 일치해야 합니다. (리턴값의타입, 메소드이름, 
//   매개변수)
//5. 접근지정자는 축소될 수 없습니다.( 다형성의 구현때문에... )
//6. 부모클래스의 final로 정의된 메소드는 오버라이딩 할 수 없습니다. 
class Animal2{
	public void crying() { System.out.println("소리를 냅니다");}
}
class Dog2 extends Animal2{
	public void crying() { System.out.println("멍멍~"); }
}
class Cat2 extends Animal2{
	public void crying2() {super.crying(); System.out.println("야옹~");}
	// 메서드의 이름이 다르므로 매서드 오버라이딩이 아닙니다.
}
public class Extends08_MethodOverriding02 {

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		Cat2 c = new Cat2();
		// 메서드가 오버라이드 되지 않은 Cat2 클래스의 crying()메서드는 
		// 부모 클래스 메서드가 실행됩니다.
		d.crying();
		c.crying();
		// 클래스의 외부에서는 super 키워드를 통한 부모클래스의 메소드 호출이 제한됨
		// c.super.crying();  에러
		
		//부모클래스의 레퍼런스 변수는 자식클래스의 객체의 주소를 저장할 수 있습니다
		Animal2 a = d; // 이것을 상속의 다형성이라고 합니다.
		// 이때 a.crying() 을 실행하면 자식 클래스에서 오버라이딩된 메서드가
		// 우선적으로 실행됩니다
		d.crying();
		a.crying();
	}

}
