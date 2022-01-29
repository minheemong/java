package days20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calendars extends JFrame implements ActionListener{
	JTextField y;
	JComboBox m;
	
	
	
	Calendars() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		Font f = new Font("굴림", Font.BOLD,20);
		
		JButton b1 = new JButton("일");
		JButton b2 = new JButton("월");
		JButton b3 = new JButton("화");
		JButton b4 = new JButton("수");
		JButton b5 = new JButton("목");
		JButton b6 = new JButton("금");
		JButton b7 = new JButton("토");
		
		b1.setFont(f); b2.setFont(f); b3.setFont(f); b4.setFont(f);
		b5.setFont(f); b6.setFont(f); b7.setFont(f);
		
		b1.setForeground(Color.RED); b7.setForeground(Color.BLUE);
		
		//jp1 설정==============================
		jp1.setLayout(new GridLayout(1,7));
		jp1.add( b1 ); jp1.add( b2 ); jp1.add( b3 ); jp1.add( b4 );
		jp1.add( b5 ); jp1.add( b6 ); jp1.add( b7 );
		
		//jp3 설정==============================
		jp3.setLayout(new FlowLayout(FlowLayout.CENTER));
		y = new JTextField(8);
		y.setFont(f);
		y.setHorizontalAlignment(SwingConstants.CENTER);
		
		m = new JComboBox<String>();
		//반복실행문을 이용하여 콤보상자에 1월부터 12월까지의 항목을 i값으로 추가
		for(int i=1;i<=12;i++) m.addItem(String.valueOf(i));
		m.setFont(f);
		
		JButton b = new JButton("확인");
		JButton b11 = new JButton("이전달");
		JButton b12 = new JButton("다음달");
		b.setFont(f); b11.setFont(f); b12.setFont(f);
		
		jp3.add(b11); jp3.add(y); jp3.add(new JLabel("년 "));
		jp3.add(m); jp3.add(new JLabel("월 ")); jp3.add(b); jp3.add(b12);
		
		con.add(jp1, BorderLayout.NORTH);
		con.add(jp3, BorderLayout.SOUTH);
		setTitle("스윙 캘린더");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Swing19_Calender {

	public static void main(String[] args) {
		new Calendars();
	}

}
