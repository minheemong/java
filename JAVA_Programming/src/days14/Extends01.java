package days14;
// 클래스의 상속(Extend 확장)
// 다수의 클래스가 중복되는 멤버변수, 멤버메소드를 포함하고 있는 경우
// 부모 자식 관계를 생성하여 코드의 중복을 방지하는 것을 1차 목적으로 사용한다
// 2차 목적은 코드의 재활용 방법이다.
// 코드의 중복이 발생하고 있는 클래스에서 중복되는 멤버를 별도의 클래스로 선언하고
// 상속을 구현하여 사용한다.

// *코드의 중복이 발생하고 있는 클래스
/*
class Person_A {
	String name;		int age;
}
class Person_B {
	String name;		int age;
}
*/
//+++ 중복되는 코드를 제거하기위 한 슈퍼,상위,부모 클래스 선언
class Person {
	String name;		int age;
} 
//+++상속을 구현한 서브,하위,자식 클래스 선언 : class 자식클래스명 extends 부모클래스명 {
class Person_A extends Person {
	
}
class Person_B extends Person {
	
} 
public class Extends01 {

	public static void main(String[] args) {
		Person_A a = new Person_A();
		Person_B b = new Person_B();
		
		// 자식클래스는 부모클래스로부터 상속받은 멤버를 사용할 수 있다.
		a.name = "홍길동";
		b.age = 26;
		System.out.println(a.name);
		System.out.println(b.age);
	}

}
