package days12;
// 같은 패키지 안에서 동일한 이름의 클래스를 만들 수 없다
class Bclass{
	private int age;
	// 앞 예제 Class08과 같이 클래스 내부에 생성자를 꺼내 따로 정의하지 않으면,
	// 컴파일러는 자동으로클래스 내부에 숨어있는 디폴트 생성자를 호출합니다.
	// 디폴트 생성자 : Bclass() { }와 같은 기본 형태만 설정된 생성자
	// 아래와 같이 내용없이 생성자를 따로 정의하는 것은, 따로 생성자를 기술하지 않는 것과
	// 같습니다
	Bclass() {
	}
	public int getAge() {return age;}
	public void setAge(int age) {this.age=age;}
}
public class Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
