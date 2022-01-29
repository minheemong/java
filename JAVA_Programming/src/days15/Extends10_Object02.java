package days15;
//	toString 메소드의 사용
//	toString 메소드는 클래스의 객체 정보를 문자열로 반환 : 
//   객체의 클래스명 + '@' + 해시코드값(16진수)
//	사용자 정의 클래스(직접 개발한 클래스)에 toString 메소드를 오버라이딩하여 
//	클래스의 정보를 문자열로 제공하도록 변형(재정의)할 수 있습니다
class UserClass_B {  // toString 메서드를 오버라이딩 하지 않은 클래스
}
class Point { // toString 메서드를 오버라이딩한 클래스
	private int x;
	private int y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public String toString() {
		return "(x=" + this.x + ",  y=" + this.y + ")"; // "x = 값, y = 값" 리턴
	}
}
public class Extends10_Object02 {
	public static void main(String[] args) {
		UserClass_B obj = new UserClass_B();
		System.out.println("오버라이딩 되지 않은 toString()=>" + obj.toString());
		Point p = new Point(30,20);
		System.out.println("오버라이딩 된 toString()=>" + p.toString());
		// .toString() 은 print 에서 사용되거나 다른 문자열과 '+' 연산될때 생략 가능합니다.
		// System.out.println("오버라이딩 된 toString()=>" + p);
		String msg = "Point =>" + p;
		System.out.println(msg);
	}

}
