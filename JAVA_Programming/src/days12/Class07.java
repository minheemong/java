package days12;
// 멤버 메소드의 주된 목적은 멤버변수의 값을 세팅하거나 얻어오거나...
// 그 둘의 목적이 가장 큽니다
// 때문에 멤버베소드를 별도의 사유 없이 멤버변수에 따라 필요한만큼 만들고
// 시작하는 경우가 많습니다.
// 메소드의 이름은 setter와 getter라는 이름을 사용하는 두 개의 메소드입니다
class GetSetTest {
	private int num;
	private double dou;
	private String str;
	// 멤버 변수가 하나 만들어지면, 그 변수에 값을 세팅할 수 잇는 메소드와 값을 얻어낼 수 있는
	// 메소드를 생성합니다
	// 멤버변수의 값을 저장하는 메소드 이름 setNum
	//public void setNum(int n) { num=n; }
	// 멤버 변수의 값을 리턴해주는 메소드 이름 : getNum
	//public int getNum() { return num; }
	//public void setDou(double d) { dou=d; }
	//public void getDou() { return dou; }
	//public void setStr(String s) { str=s; }
	//public void getStr() { return str; }
	
	//getter와 setter 자동생성
	// 현위치에서 마우스 오른쪽버튼 클릭
	//  -> Source메뉴 -> Generate Getter and Setters 선택
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDou() {
		return dou;
	}
	public void setDou(double dou) {
		this.dou = dou;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
}
public class Class07 {

	public static void main(String[] args) {
		GetSetTest gs = new GetSetTest();
		gs.setNum(12345);
		int n = gs.getNum();
		System.out.println("멤버변수 num의 값은 " + n + "입니다");

	}

}
