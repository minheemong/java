package days13;
class Dclass{
	// 매개변수를 선언하지 않은 디폴트 생성자
	public Dclass() {	
		System.out.println("Dclass 클래스의 디폴트 생성자 호출");	
	}	
	public Dclass(int i) {
		System.out.println("Dclass 클래스의 int 타입 매개변수를 전달받는 생성자 호출");	
	}	
	public Dclass(double d) {
		System.out.println("Dclass 클래스의 double 타입 매개변수를 전달받는 생성자 호출");
	}
}
public class Class11 {
	public static void main(String[] args) {
		Dclass d1 = new Dclass();
		Dclass d2 = new Dclass(10);
		Dclass d3 = new Dclass(10.23);
		// 위 와 같은 실행이 가능하도록   Dclass 의 생성자들을 만들어주세요
		// 생성자에서는 각각 어떤 매개변수가 있는 생성자인지 출력되게 코딩하세요
		// 예) System.out.println("int 타입 매개변수를 전달받는 생성자 호출");
	}
}
