package days21;

import javax.swing.JOptionPane;

class ThreadC1 extends Thread{
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try { sleep(1000);
			} catch(Exception e ) {}
		}
	}
}
public class Thread03 {

	public static void main(String[] args) {
		ThreadC1 t1 = new ThreadC1();
		t1.start();
		String input = JOptionPane.showInputDialog("정답을 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		// t1.stop(); Thread 의 stop() 메서드는 사용중이었던 자원(변수, 메모리 등)의 불안정을
		// 초래하기 때문에 지금은 사용하지 않습니다
	}

}
