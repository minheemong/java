package days23;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpipServer01 {

	public static void main(String[] args) {
		
		ServerSocket ss = null;
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		
		try {
			ss = new ServerSocket(7777);// 서버 소켓 객체 생성
			// 여기까지 완료 되면 서버가 클라이언트의 연결요청을 기다리며, 수락할 준비가 완료됩니다
			System.out.println( f.format(new Date()) + " 서버가 준비되었습니다");
		} catch (IOException e) {		e.printStackTrace();		} 
		// 서버소켓은 준비 완료 이후 클라이언트의 연결요청이 올 때까지 실행을 잠시 멈추고 계속 기다립니다
		
		while(true) {
			try {
				System.out.println( f.format(new Date()) + " 연결요청을 기다립니다.");
				Socket s = ss.accept();// 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 통신용 
				// 소켓을 연결정보와 함께 생성하고, 소켓이 요청받은 클라이언트 연결정보를 전달합니다
				System.out.println( f.format(new Date()) + s.getInetAddress() + " 로부터 연결요청이 들어왔습니다.");	
				
				OutputStream out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);// 최종 통신 출력 도구 : dos
				dos.writeUTF("[공지] 연결 성공~!!! 204호 00번 서버에 접속되셨습니다. ");
				System.out.println(f.format(new Date()) + " 메세지를 전송했습니다.");
				dos.close();
				s.close();
				// ss.close();
			} catch (IOException e) { e.printStackTrace();	}  
		}
	}

}
