import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiChatServer2 {
	HashMap clients;  //접속중인 클라이언트 와 연결들을 관리할 리스트
	// key : 클라이언트의 이름 - 클라이어트 접속과 함께 전달된 이름:숫자로 구성됨
	// Value : 클라이언트에 연결된 이름(key값)으로 생성된 out 객체, key 값의 클라이언트 전용 전송객체
	// 해쉬맵에 저장된 클라이언트들의 out 객체를 하나씩 꺼내서 한사람이 보낸메세지를 모두에게 전송해줍니다
	
	MultiChatServer2(){
		clients = new HashMap();
		Collections.synchronizedMap(clients);
		//멀티 쓰레드 환경에서 단일 해쉬멥에  멀트스레드가 동시 접근하여 값을 변경하는것을 막는 동기화 도구.
	}
	
	// 클래스 내부에 존재하는 클래스
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		ServerReceiver( Socket s){
			this.socket = s;
			try {
				in  = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				// 송수신을 위한 객체 생성 (생성자)
			} catch (IOException e) {	System.out.println("송수신객체 생성에 실패했습니다"); }
		}
		public void run() {
			String name = "";
			try {
				//접속과 함께 전달된 이름을 저장
				name = in.readUTF();
				// 연결된 클라이언트를 해쉬멥에 저장
				clients.put(name, out);  // 해쉬맵에 클라이언트 한명 추가(키:이름, 밸류:out 객체)
				sendToAll("#"+name+"님이 들어오셨습니다."); // 이름을 출력(모든 클라이언트에게)
				System.out.println("현재 서버접속자 수는 "	+ clients.size()+"입니다.");
				// 불특정 대화참여자들이 보내는 것들을 모두에게 전송...(무한반복-현재 스레드의 주인공이 나갈때까지)
				while(in != null) sendToAll( in.readUTF() ); 
			} catch (IOException e) { e.printStackTrace();
			} finally {
				sendToAll("#"+name+"님이 나가셨습니다.");
				clients.remove(name);  //해쉬맵에서 현재 사용자 삭제
				System.out.println("["+socket.getInetAddress() +":"+socket.getPort()+"]"+"에서 접속을 종료하였습니다.");
				System.out.println("현재 서버접속자 수는 "+ clients.size() + "입니다.");
			}	
		}
	}
	
	public void sendToAll(String msg) {
		//해쉬맵의 키들에 차례로 접근할 수 있는 이터레이터 생성
		Iterator it = clients.keySet().iterator();
		while(it.hasNext()) { // 다음 키값이 있다면 true 로 반복, 키값의 마지막까지 다다를때까지 반복실행
			try {
				// clients에서 (next)키값으로 얻어낸 Value(클라이언트전용 out 객체)를 꺼내서 out에 저장
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);  // 해쉬맵에서 꺼내온 out 객체를 통해 메세지 전송
			} catch (IOException e) { e.printStackTrace();	}  
		}
	}
	
	public void sijack() {
		// 서버설정을 하고 클라이언트 연결을 기다립니다.
		// 클라이언트가 연결이 되면 연결된 소켃을 새로 만들어지는 ServerReceiver 객체에 전달하고, 
		// 그 연결에 대한 쓰레드가  start 됩니다.
		// 그리고 다음 연결을 기다립니다.
		// 인원수 제한없이 연결되고, 각각 독립적인 소켓으로 송수합니다.
		
		ServerSocket ss = null;  // 클라이언트들 과 연결을 제어
		Socket s = null;   // 각 클라이언트 와 통신제어
		
		try {
			while(true) {
				ss = new ServerSocket(7777);
				System.out.println("서버가 시작되었습니다."); 
				s = ss.accept();
				System.out.println("["+s.getInetAddress()+":" +s.getPort()+"]" + "에서 접속하였습니다.");
				ServerReceiver th = new ServerReceiver(s);
				// 매 접속하는 클라이언트 마다 새로운 소켓과 쓰레드가 생성되어 각각 독립적 송수신이 가능하게 합니다
				th.start(); // 쓰레드 시작
			}
		} catch (IOException e) {  e.printStackTrace();	}
	}
	public static void main(String[] args) {
		MultiChatServer2 k = new MultiChatServer2();
		k.sijack();
	}

}
