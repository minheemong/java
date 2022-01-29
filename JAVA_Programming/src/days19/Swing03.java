package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonEvent extends JFrame implements ActionListener{
	
	JLabel result;
	
	ButtonEvent(){
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은?");
		result = new JLabel(""); // 버튼 클릭 에 의해서 실행 결과가 담길 라벨
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(label);
		con.add(male);
		con.add(female);
		con.add(result);
		
		male.addActionListener(this);
		female.addActionListener(this);
		
		
		setTitle("버튼 이벤트 테스트");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();  // 클릭된 버튼의 표시된 값이 문자변수 s에 저장
		result.setText(s);
	}
	
}

public class Swing03 {

	public static void main(String[] args) {
		
		new ButtonEvent();
	}

}
