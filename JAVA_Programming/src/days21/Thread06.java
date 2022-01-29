package days21;
class ThreadE extends Thread {	
	public void run() {
		System.out.printf("현재 실행 중인 쓰레드의 이름은 '%s' 입니다.\n", 	this.getName());
	}
}
public class Thread06 {

	public static void main(String[] args) {
		// 쓰레드의 객체의 이름을 확인 : Thread 클래스의 getName 메소드를 사용
		// 쓰레드의 이름을 지정하지 않으면 생성되는 순서로 Thread-0, 1, 2 ... 같은 이름을 사용합니다.
		ThreadE e1 = new ThreadE();
		ThreadE e2 = new ThreadE();
		ThreadE e3 = new ThreadE();
		e1.run();		e2.run();		e3.run();
		e1.start();		e2.start();		e3.start();

	}

}
