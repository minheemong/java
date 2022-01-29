package days21;

import javax.swing.JOptionPane;

class ThreadC2 extends Thread{
	private boolean state = true;
	public void setState(boolean s) { this.state = s; }
	public void run() {
		for(int i=10; i > 0 && this.state == true  ; i--) {
			System.out.println(i);
			try { sleep(1000);
			} catch(Exception e ) {}
		}
	}
}
// 스레드를 계속할지 아니면 멈출지를 결정할   boolean 변수가 멤버변수로 추가 됩니다.
// 스레드를 계속하려면  true  멈추려면 false 로 값을 대입하는 setState  메서드도 추가됩니다.
// run 메서드는 실행 중간 중간 또는 반복실행의 조건에서  state 변수가 true 인지 검사합니다
// false 이면 멈추고, true  이면 계속합니다
public class Thread07 {

	public static void main(String[] args) {
		ThreadC2 t2 = new ThreadC2();
		t2.start();
		String input = JOptionPane.showInputDialog("정답을 입력하세요.");
		t2.setState(false);
		// t2.stop() 은 사용하지 않습니다.
		System.out.println("입력하신 값은 " + input + "입니다.");
	}

}
