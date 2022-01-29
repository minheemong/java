package days15;
// Object 클래스
// 사용자 정의 클래스를 생성하면서, extends(상속)을 구현하지 않으면 자동으로 
// java.lang.Object 클래스를 상속.
// Object 클래스는 Java 에서 사용되는 모든 클래스들의 최상위 부모클래스입니다
// Subclass extends Super  라는 건  Subclass 는 Object 클래스를 상속하지 않지만
// Super 클래스가 Object 클래스를 상속하므로,  Subclass 는 Object 클래스를
// 상위의 상위로 상속한것과 같은 의미입니다
class UserClass /* extends Object */{
	
}
public class Extends10_Object01 {

	public static void main(String[] args) {
		UserClass obj = new UserClass(); 
		// getClass 메소드는 해당 객체의 클래스 이름을 리턴해주는 메서드
		System.out.println(obj.getClass());
		// hashCode 메소드는 해당 객체의 해시코드값(다른객체와 구분하기위한 고유값)을
		// 리턴해주는 메서드(JVM에 의해서 관리되고 있는 번호)
		System.out.println(obj.hashCode());
		// toString 메소드는 해당 객체의 정보를 문자열로 리턴해주는 메서드
		System.out.println( obj.toString() );
		// 객체의 클래스명 + '@' + 해시코드값(16진수)
		System.out.println(obj); //System.out.println(obj.toString()); 와 같음
	}

}
