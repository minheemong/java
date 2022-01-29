import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread{
	DataOutputStream out; // 메세지 전송(송신)용 출력 스트림
	Socket socket;
	String name;
	Sender( Socket s ){   // main 에서 연결하고 전달해준 통신소켓을 생성자의 매개변수로 받습니다
		this.socket = s;  // 전달받은 통신소켓을 멤버변수에 저장해서 클래스 전역에서 사용할 수 있게 합니다.
		try {
			// OutputStream o = socket.getOutputStream();
			// out = new DataOutputStream(o);
			out = new DataOutputStream( socket.getOutputStream() );
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (IOException e) {e.printStackTrace();		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		while( out != null ) {
			try {
				// String mesaage = sc.nextLine();
				// out.writeUTF( name + mesaage);
				out.writeUTF( name + sc.nextLine() );// 화면에 입력한 내용을 만들어둔 말머리와 함께 전송
			} catch (IOException e) { e.printStackTrace();}
		}
	}
}

class Receiver extends Thread{
	DataInputStream in; // 메세지 전송(수신)용 입력 스트림
	Socket socket;
	Receiver(Socket s){
		this.socket = s;
		try {
			in = new DataInputStream( socket.getInputStream() );
		} catch (IOException e) { e.printStackTrace(); }
	}
	public void run() {
		while(in!=null) {
			try {
				System.out.println( in.readUTF() );
			} catch (IOException e) { e.printStackTrace(); } 
		}
	}
}

public class TcpipServer031 {

	public static void main(String[] args) {
		ServerSocket sS = null;
		Socket s = null;
		try {
			sS = new ServerSocket(5555);
			System.out.println("서버가 준비되었습니다.");
			s = sS.accept();
			// 앞선 예제에서는 DataOutputStream 에 s 를 사용하여 출력 
			// 또는 DataInputStream 에 s 를 활용하여 입력
			// 그러나 본 예제는  s 를 Sender 와 Receiver 의 생성자에 전달인수로 보내서
			// 현재 연결을 이용한 입력 출력을 양방향 자유롭게 가능하게 제작합니다
			// 각 클래스는 Thread 를 상속 받아, 동시실행이 가능하게 합니다.
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();
		} catch (IOException e) { e.printStackTrace(); }
	}

}
