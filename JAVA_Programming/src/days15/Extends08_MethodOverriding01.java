package days15;
// 상속 문법
// 각각의 클래스에서 발견되는 공통 변수, 메소드등을 하나의 클래스로 선언하여 
// 물려받는 문법
// 상속은 모든 클래스의 공통되는 속성, 기능을 정의된 부모클래스를 자식클래스에게 
// 물려주는 방식
// 부모클래스 정의되는 속성, 또는 기능들은 모든 자식클래스에서 동작해야 하므로 
// 일반적인 정의만 사용할 수 있습니다.
// 또한 상속 받은 메서드들은 자식 클래스의 생성 목적이나 용도에 따라 사용이 
// 어울리지 않은 메서드일 가능성이 있습니다
class Animal {
	public void crying() { 	
		System.out.println("소리를 냅니다."); 
	}
}
// 자식 클래스는 부모클래스에서 물려받은 메소드를 자신의 용도에 맞게 
// 재정의 할 수 있습니다.
// 메서드 오버라이딩은 자식클래스에서 부모클래스의 메소드의 원형을 다시 
// 정의하는 문법입니다.
// 메서드 오버라이딩을 구현하면, 부모클래스에서 물려받은 메소드는 무시되고,
// 새롭게 정의한 메소드가 사용됩니다.
class Dog extends Animal {
	public void sound() {
		super.crying();
		System.out.println("멍멍~!");
	}
	public void crying() {
		System.out.println("멍멍~!");
	}
}
class Cat extends Animal {
	public void sound() {
		super.crying();
		System.out.println("야옹~!");
	}
	public void crying() {
		System.out.println("야옹~!");
	}
}
public class Extends08_MethodOverriding01 {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.crying();
		c.crying();
		d.sound();
		c.sound();
	}

}
