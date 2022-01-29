package days23;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpipServer02 {

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(6666); 
			System.out.println(getTime()+" 서버가 준비되었습니다.");
		} catch (IOException e) {	e.printStackTrace();	} 

		while(true) {
			try {
				System.out.println(getTime()+"연결요청을 기다립니다.");
				ss.setSoTimeout(6000);// 서버 소켓이 클리이언트 요청을 기다리는 시간 설정
				// 설정된 시간이 지날때까지 요청이 없으면 SocketTimeoutException 예외가 발생합니다
				Socket s = ss.accept();
				System.out.println(getTime() + " " + s.getInetAddress() + " 이(가) 연결요청하였습니다" );
				OutputStream out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF(" [연결완료] 요청한 서버로 연결이 완료되었습니다.");
				System.out.println(getTime()+"데이터를 전송했습니다.");
				dos.close();
				s.close(); 
			} catch (SocketTimeoutException  e) { 
				System.out.println(getTime() + "접속시간 초과. 서버를 종료합니다");
				System.exit(0);
			} catch (IOException e) {e.printStackTrace();		}
		}
	}

}
