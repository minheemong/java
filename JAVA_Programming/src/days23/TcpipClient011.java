import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient011 {

	public static void main(String[] args) {
		 // ������ ��ǻ�ͷ� ���ߵ� �ϵ��� �ִ�.
        // �׷��� ������ ��ǻ�Ϳ� Ŭ���̾�Ʈ ��ǻ�Ͱ� ���еǴ°��� �ƴϴ�.
        // ipconfig��  Ipv4�� ���� ip�� �˾Ƴ���

		String serverIp = "192.168.35.5";		
		try {
			Socket s = new Socket(serverIp, 6666);
			// Socket : Ŭ���̾�Ʈ�� ������ ��û�� ����Ʈ����
			// serverIp : Ŭ���̾�Ʈ�� ��û�� ������ ������ �ּ�
			// 7777 : �������� ������ ������ �׷��ȣ
			
			// ������ �����ϸ� �Ʒ� ������ ����. �����ϸ� catch ���� ����
			InputStream in = s.getInputStream();  // ���Ͽ��� �Է�/��� ��Ʈ���� ���޹޾� ����µ����� ���
			// InputStream �� �ܼ� �ƽ�Ű�ڵ� ������� �����ڿ� ���� ����Ŭ���̾�Ʈ ��ſ� ��밡���� 
			// ��Ʈ���� �����մϴ�
			DataInputStream dis = new DataInputStream(in);
			// ������ ��û�� ������ ���� ���޵� �޼����� �����մϴ�
			String m = dis.readUTF();
			// �������� ���� ���� �����͸� ����Ѵ�.
			System.out.println("���� �޽��� : " + m);
			System.out.println("������ �����մϴ�.");
			// ��Ʈ���� ������ �ݽ��ϴ�
			dis.close();
			s.close();
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (UnknownHostException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
		
		

	}

}
