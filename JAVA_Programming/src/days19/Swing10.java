package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JTextFieldTest extends JFrame implements ActionListener{

	JTextField jtf;
	
	JTextFieldTest(){
		jtf = new JTextField(30);
		JButton bt1 = new JButton("방갑습니다");
		JButton bt2 = new JButton("안녕하세요");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(bt1);
		con.add(bt2);
		con.add(jtf);
		
		//jtf.setText("안녕하세요 방갑습니다");
		// 명령어로 값을 꺼내고할때는  String s = jtf.getText();
		setTitle("텍스트 필드 테스트");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = jtf.getText();
		String s2 = e.getActionCommand();
		jtf.setText(s1 + s2);
	}	
}
public class Swing10 {
	public static void main(String[] args) {
		new JTextFieldTest();

	}

}
