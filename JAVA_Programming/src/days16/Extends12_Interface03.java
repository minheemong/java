package days16;
interface InterC_Super1 {
	public abstract void interC_Super1Test();
}
interface InterC_Super2 {
	public abstract void interC_Super2Test();
}

// 인터페이스 간의 상속(extends) : 인터페이스끼리 상속해서 부모의 추상메소드를
// 물려받을 수 있습니다
interface InterC_Sub extends InterC_Super1,InterC_Super2{
	public abstract void interC_SubTest();
	//public abstract void InterC_Super1Test(); //상속받은 추상메소드
	public abstract void interC_Super2Test(); //상속받은 추상메소드
}

// 인터페이스끼리 extends는 추상메소드의 override 의무가 면제됩니다.
// 다만 상속받은 추상메소드를 보유해 이를 implements한 클래스가
// 오버라이드 하게 합니다.

// 클래스에서 다수의 인터페이스를 구현(implements)할 수 있습니다
class SubC1 implements InterC_Super1,InterC_Super2{
	@Override
	public void interC_Super2Test() {}
	@Override
	public void interC_Super1Test() {}
}// 일반클래스가 인터페이스를 여러개 implements했다면 그 인터페이스가 
// 보유한 추상메소드를 모두 구현(override)해야합니다

// 인터페이스 간 상속을 구현하고 있는 인터페이스를 클래스에서 구현하는 경우
// 부모 인터페이스의 추상메소드를 포함하여 모두 오버라이딩해야 합니다
class SubC2 implements InterC_Sub{
	@Override
	public void interC_Super1Test() {}
	@Override
	public void interC_SubTest() {}
	@Override
	public void interC_Super2Test() {}
}
public class Extends12_Interface03 {

	public static void main(String[] args) {
		// 부모인터페이스의 레퍼런스 변수에 자식클래스의 객체를 대입
		InterC_Super1 s1 = new SubC2();
		InterC_Super2 s2 = new SubC2();
		InterC_Sub s3 = new SubC2();
		// 인터페이스를 다중 상속한 경우 부모 인터페이스는 자신의 추상메소드에만
		// 접근할 수 있습니다.
		s1.interC_Super1Test();
		s2.interC_Super2Test();
		//s1.interC_Super2Test(); //에러. -상속해주지않은 다른 인터페이스의 추상메소드
		//s2.interC_Super1Test(); //에러. -상속해주지않은 다른 인터페이스의 추상메소드
		s3.interC_SubTest();
		s3.interC_Super1Test();
		s3.interC_Super1Test();
		
	}
	// 일반 클래스는 extends로 상속할 때 다중 상속이 안될 뿐
	// 클래스의 extends와 interface의 implements는 동시 구현할 수 있습니다
	// class 자식클래스명 extends 부모클래스명 implements 부모인터페이스명
	// 더불어 인터페이스는 여러개를 동시에 implements 할 수 있습니다
}
