import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread{
	DataOutputStream out; // �޼��� ����(�۽�)�� ��� ��Ʈ��
	Socket socket;
	String name;
	Sender( Socket s ){   // main ���� �����ϰ� �������� ��ż����� �������� �Ű������� �޽��ϴ�
		this.socket = s;  // ���޹��� ��ż����� ��������� �����ؼ� Ŭ���� �������� ����� �� �ְ� �մϴ�.
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
				out.writeUTF( name + sc.nextLine() );// ȭ�鿡 �Է��� ������ ������ ���Ӹ��� �Բ� ����
			} catch (IOException e) { e.printStackTrace();}
		}
	}
}

class Receiver extends Thread{
	DataInputStream in; // �޼��� ����(����)�� �Է� ��Ʈ��
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
			System.out.println("������ �غ�Ǿ����ϴ�.");
			s = sS.accept();
			// �ռ� ���������� DataOutputStream �� s �� ����Ͽ� ��� 
			// �Ǵ� DataInputStream �� s �� Ȱ���Ͽ� �Է�
			// �׷��� �� ������  s �� Sender �� Receiver �� �����ڿ� �����μ��� ������
			// ���� ������ �̿��� �Է� ����� ����� �����Ӱ� �����ϰ� �����մϴ�
			// �� Ŭ������ Thread �� ��� �޾�, ���ý����� �����ϰ� �մϴ�.
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();
		} catch (IOException e) { e.printStackTrace(); }
	}

}
