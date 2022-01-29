package days12;
class Account{
	private double balance; // 계좌정보 클래스에 잔액이 저장된 멤버변수
	// 클래스의 멤버필스/메소드는 접근지정자(private, protected, public)에
	// 의해서 외부에서의 접근을 제어할 수 있습니다.
	// 접근지정자를 사용하지 않는 경우 기본지정으로 public이 설정되며, 클래스외부에서
	// 임의의 사용으로 값을 대입하거나 얻을 수 있습니다.
	// 이는 멤버필드의 값이 강제로 수정될 수 있다는 뜻이기도 합니다.
	// 이를 막고 무분별한 접근을 막기위해 멤버변수 private를 지정합니다.
	// private는 자기 자신 class의 멤버메소드만 접근 가능합니다.
	// 멤버메소드는 대개 public으로 지정되며, 외부에서 자유로운 접근이 가능합니다.
	public void initBanance(int i) {
		// 검증 절차를 거쳐 값이 대입될 구조
		balance = i;
	}
	public void display() {
		System.out.printf("현재 잔액은 %.2f원 입니다.\n", balance);
	}// 잔고확인 가능
	public void withraw(int money) {
		balance-=money;
	} // 출금 가능
	public void deposit(int money) {
		balance+=money;
	} // 입금 가능
}
public class Class05 {

	public static void main(String[] args) {
		Account a = new Account();
		//a.balance = 50000; //에러
		//System.out.printf("현재 잔액은 %.2f원 입니다.\n", a.balance); //에러
		a.initBanance(100000);
		a.display();
		a.withraw(5000); a.display(); //출금
		a.deposit(20000); a.display(); //입금
	}

}
