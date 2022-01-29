package days14;
// 접근지정자와 상속
// 부모클래스의 private 멤버는 아무리 자식클래스라고해도 접근할 수 없는 멤버이다.
class SuperA {
	//private : 현재 클래스 내에 있는 멤버메소드를 통해서만 접근 가능한 완전은닉 멤버변수
	private int n1;
	public int n2;
	// 디폴트 접근지정자 : 동일한 패키지 내부에서는 public으로 동작,
	// 다른 패키지에서는 private로 동작
	int n3;
	public int getN1() { return n1; }
}
class SubA extends SuperA {
	public void printInfo() {
		// 부모클래스의 private멤버에 접근할 수 없음
		//System.out.println(this.n1); // 에러 : The field SuperA.n1 is not visible
		// 부모클래스의 public멤버에 접근할 수 있음
		System.out.println(this.n2);
		// 동일한 패키지이므로 디폴트 접근지정자로 선언된 부모의 멤버에 접근할 수 있음
		System.out.println(this.n3);
		// public으로 선언된 멤버베소드를 이용하면, 부모클래스의 private멤버에도 접근이 가능
		System.out.println(this.getN1());
	}
}
public class Extends03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
