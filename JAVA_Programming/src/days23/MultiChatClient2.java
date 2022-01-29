import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiChatClient2 {
	static class ClientSender extends Thread{
		Socket socket;
		DataOutputStream out;
		String name;
		ClientSender(Socket s, String name){
			this.socket = s; 
			this.name = name;
			try {
				this.out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {e.printStackTrace();}
		}
		public void run() {
			Scanner sc = new Scanner(System.in);
			if(out!=null) {
				try {
					out.writeUTF(name); // 최초 접속시 이름을 서버로 보냄
					while(out!=null) out.writeUTF("["+name+"]"+sc.nextLine());
					// 이후 화면에 쓰는 내용을 모두 서버로 전송(프로그램 종료시까지 무한 반복)
				} catch (IOException e) {}
			}
		}
	}
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		ClientReceiver(Socket s){
			this.socket = s;
			try {
				this.in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {e.printStackTrace();}
		}
		public void run() {
			while(in!=null) {
				try {
					System.out.println(in.readUTF());
				} catch (IOException e) {}
			}
		}
	}
	public static void main(String[] args) {
		//for(int i=0; i<args.length; i++) {
		//	System.out.println(args[i]);
		//}
		
		String serverIp ="192.168.35.5";
		try {
			Socket s = new Socket(serverIp,7777);
			System.out.println("서버에 연결되었습니다");
			
			ClientSender cs = new ClientSender(s,args[0]);
			ClientReceiver cr = new ClientReceiver(s);
			
			cs.start();
			cr.start();
			
			
		} catch(UnknownHostException e) {
			System.out.println("해당 아이피의 서버(호스트를 찾을 수 없습니다");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("해당 아이피의 서버(호스트)와 연결에 실패했습니다");
			System.exit(0);
		}
	}
	

}
