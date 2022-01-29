import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiChatServer2 {
	HashMap clients;  //�������� Ŭ���̾�Ʈ �� ������� ������ ����Ʈ
	// key : Ŭ���̾�Ʈ�� �̸� - Ŭ���̾�Ʈ ���Ӱ� �Բ� ���޵� �̸�:���ڷ� ������
	// Value : Ŭ���̾�Ʈ�� ����� �̸�(key��)���� ������ out ��ü, key ���� Ŭ���̾�Ʈ ���� ���۰�ü
	// �ؽ��ʿ� ����� Ŭ���̾�Ʈ���� out ��ü�� �ϳ��� ������ �ѻ���� �����޼����� ��ο��� �������ݴϴ�
	
	MultiChatServer2(){
		clients = new HashMap();
		Collections.synchronizedMap(clients);
		//��Ƽ ������ ȯ�濡�� ���� �ؽ��㿡  ��Ʈ�����尡 ���� �����Ͽ� ���� �����ϴ°��� ���� ����ȭ ����.
	}
	
	// Ŭ���� ���ο� �����ϴ� Ŭ����
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		ServerReceiver( Socket s){
			this.socket = s;
			try {
				in  = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				// �ۼ����� ���� ��ü ���� (������)
			} catch (IOException e) {	System.out.println("�ۼ��Ű�ü ������ �����߽��ϴ�"); }
		}
		public void run() {
			String name = "";
			try {
				//���Ӱ� �Բ� ���޵� �̸��� ����
				name = in.readUTF();
				// ����� Ŭ���̾�Ʈ�� �ؽ��㿡 ����
				clients.put(name, out);  // �ؽ��ʿ� Ŭ���̾�Ʈ �Ѹ� �߰�(Ű:�̸�, ���:out ��ü)
				sendToAll("#"+name+"���� �����̽��ϴ�."); // �̸��� ���(��� Ŭ���̾�Ʈ����)
				System.out.println("���� ���������� ���� "	+ clients.size()+"�Դϴ�.");
				// ��Ư�� ��ȭ�����ڵ��� ������ �͵��� ��ο��� ����...(���ѹݺ�-���� �������� ���ΰ��� ����������)
				while(in != null) sendToAll( in.readUTF() ); 
			} catch (IOException e) { e.printStackTrace();
			} finally {
				sendToAll("#"+name+"���� �����̽��ϴ�.");
				clients.remove(name);  //�ؽ��ʿ��� ���� ����� ����
				System.out.println("["+socket.getInetAddress() +":"+socket.getPort()+"]"+"���� ������ �����Ͽ����ϴ�.");
				System.out.println("���� ���������� ���� "+ clients.size() + "�Դϴ�.");
			}	
		}
	}
	
	public void sendToAll(String msg) {
		//�ؽ����� Ű�鿡 ���ʷ� ������ �� �ִ� ���ͷ����� ����
		Iterator it = clients.keySet().iterator();
		while(it.hasNext()) { // ���� Ű���� �ִٸ� true �� �ݺ�, Ű���� ���������� �ٴٸ������� �ݺ�����
			try {
				// clients���� (next)Ű������ �� Value(Ŭ���̾�Ʈ���� out ��ü)�� ������ out�� ����
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);  // �ؽ��ʿ��� ������ out ��ü�� ���� �޼��� ����
			} catch (IOException e) { e.printStackTrace();	}  
		}
	}
	
	public void sijack() {
		// ���������� �ϰ� Ŭ���̾�Ʈ ������ ��ٸ��ϴ�.
		// Ŭ���̾�Ʈ�� ������ �Ǹ� ����� �ұB�� ���� ��������� ServerReceiver ��ü�� �����ϰ�, 
		// �� ���ῡ ���� �����尡  start �˴ϴ�.
		// �׸��� ���� ������ ��ٸ��ϴ�.
		// �ο��� ���Ѿ��� ����ǰ�, ���� �������� �������� �ۼ��մϴ�.
		
		ServerSocket ss = null;  // Ŭ���̾�Ʈ�� �� ������ ����
		Socket s = null;   // �� Ŭ���̾�Ʈ �� �������
		
		try {
			while(true) {
				ss = new ServerSocket(7777);
				System.out.println("������ ���۵Ǿ����ϴ�."); 
				s = ss.accept();
				System.out.println("["+s.getInetAddress()+":" +s.getPort()+"]" + "���� �����Ͽ����ϴ�.");
				ServerReceiver th = new ServerReceiver(s);
				// �� �����ϴ� Ŭ���̾�Ʈ ���� ���ο� ���ϰ� �����尡 �����Ǿ� ���� ������ �ۼ����� �����ϰ� �մϴ�
				th.start(); // ������ ����
			}
		} catch (IOException e) {  e.printStackTrace();	}
	}
	public static void main(String[] args) {
		MultiChatServer2 k = new MultiChatServer2();
		k.sijack();
	}

}
