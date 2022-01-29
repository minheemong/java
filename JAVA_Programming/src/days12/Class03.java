package days12;
class Animal{
	String name;
	int age;
	// 멤버 메소드 : 클래스형으로 생성된 객체 "전용" 메소드
	// 메소드의 실행이 객체 전용으로만 사용이 된다는 뜻입니다.
	// 내용은 객체와 상관없는 명령이 들어갈 수도 있지만
	// 보통은 멤버변수의 조작, 출력, 입력을 위한 명령들로 구성됩니다.
	public void output() {
		System.out.printf("나의 이름은 %s, 나의 나이는 %d입니다\n", name, age);
	}
	public void input(String n, int a) {
		name = n;
		age = a;
	}
	// 멤버 메소드는 같은 클래스 안에 있는 메소드이므로, 변수 앞에 객체이름을 쓰지 않습니다.
	// 다만 호출 객체정보는 자동으로 전달돼서 어느 객체의 변수가 사용되는지 자동 구분됩니다.
	
	// 멤버 메소드는 특별한 경우를 빼고 static 키워드를 쓰지 않습니다.
	// 현재 프로그램(패키지 내의 같은 파일)에서만 사용한다는 가정 하에
	// public도 생략 가능합니다.
	String getName() {
		return name;
	}
}
public class Class03 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		// 멤버변수가 어떤 객체의 변수인지 구분하기 위해, 
		// 변수 이름 앞에 (객체이름.)을 붙여서 사용하듯이
		// 멤버 메소드도 호출의 주체가 되는 객체이름을 반드시 써야합니다
		a1.output();
		a2.output();
		
		a1.name = "댕댕이";
		a1.age = 20;
		a1.output();
		
		a2.input("바둑이",25);
		a2.output();
		
		String n = a1.getName(); // n = a1.name;
		System.out.println("a1의 이름은 " +n);
		// System.out.println("a1의 이름은 " + a1.getName());
	}

}
