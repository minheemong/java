package days15; //시험출제
class SuperD{
	public SuperD() { //전달인수 없는 디폴트 생성자
		this(1);
		System.out.println("SuperD()");  //4
	}
	public SuperD(int arg) { // 정수값을 매개변수로 갖는 생성자
		this(1.1);
		System.out.println("SuperD(int)");  //3
	}
	public SuperD(double arg) {   // 실수값을 매개변수로 갖는 생성자
		this("");
		System.out.println("SuperD(double)"); //2
	}
	public SuperD(String arg) {	 // 문자열 자료를 매개변수로 갖는 생성자
		System.out.println("SuperD(String)");  //1
	}
}

class SubD extends SuperD {	
	public SubD() {
		this(1);
		System.out.println("SubD()");  //8
	}
	public SubD(int arg) {
		this(1.1);
		System.out.println("SubD(int)");  //7
	}
	public SubD(double arg) {
		this("");
		System.out.println("SubD(double)");  //6
	}
	public SubD(String art) {
		// super();
		System.out.println("SubD(String)");  //5
	}
}
public class Extends06 {

	public static void main(String[] args) {
		// SuperD d = new SuperD();
		SubD d = new SubD();
	}

}
