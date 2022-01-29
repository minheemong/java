package days20;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// 실행화면과 같이 화면을 구성해주세요
// 확인 버튼을 클릭하면 입력 내용이 콘솔창에 나란히 표시되도록 해주세요
// 클래스 이름은 Resume입니다
class Resume extends JFrame implements ActionListener {
	JLabel jl1,jl2,jl3,jl4,jl5;
	JTextField jtf1,jtf2,jtf3;
	JButton jb;
	JComboBox jcb1, jcb2;
	JRadioButton jrb1, jrb2;
	JCheckBox jchb1, jchb2, jchb3, jchb4;
	Resume() {
		
		
		
		Font f = new Font("굴림",Font.BOLD,20);
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel(); //메인 컨테이너에 올라갈 패널1
		JPanel jp2 = new JPanel();
		jp1.setLayout(new GridLayout(6,1));
		jp2.setLayout(new GridLayout(6,1));
		
		//왼쪽 패널에 올라갈 라벨
		JLabel jl1 = new JLabel("성    명 : ");
		JLabel jl2 = new JLabel("성    별 : ");
		JLabel jl3 = new JLabel("취    미 : ");
		JLabel jl4 = new JLabel("전화번호 : ");
		JLabel jl5 = new JLabel("거주지역 : ");
		jl1.setFont(f); jl2.setFont(f); jl3.setFont(f); jl4.setFont(f); jl5.setFont(f);	
		jp1.add(jl1); jp1.add(jl2); jp1.add(jl3); jp1.add(jl4); jp1.add(jl5);
		con.add(jp1,BorderLayout.WEST);
		
		JPanel jp21 = new JPanel();
		JPanel jp22 = new JPanel();
		JPanel jp23 = new JPanel();
		JPanel jp24 = new JPanel();
		JPanel jp25 = new JPanel();
		JPanel jp26 = new JPanel();
		jp21.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp22.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp23.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp24.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp25.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp26.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		jtf1 = new JTextField(10);
		jtf1.setFont(f);
		jp21.add(jtf1);
		jp2.add(jp21);
		
		ButtonGroup bg = new ButtonGroup();
		jrb1 = new JRadioButton("여성");
		jrb2 = new JRadioButton("남성");
		jrb1.setFont(f); 	jrb2.setFont(f);
		bg.add(jrb1); bg.add(jrb2);
		jp22.add(jrb1); jp22.add(jrb2);
		jp2.add(jp22);
		
		jchb1 = new JCheckBox("스포츠");
		jchb2 = new JCheckBox("영화");
		jchb3 = new JCheckBox("독서");
		jchb4 = new JCheckBox("기타");
		jchb1.setFont(f); jchb2.setFont(f); jchb3.setFont(f); jchb4.setFont(f);
		jp23.add(jchb1); jp23.add(jchb2); jp23.add(jchb3); jp23.add(jchb4);
		jp2.add(jp23);
		
		jcb1 = new JComboBox();
		jcb1.addItem("010"); jcb1.addItem("032"); jcb1.addItem("02");
		jcb1.setFont(f);
		jtf2 = new JTextField(4); jtf3 = new JTextField(4);
		jtf2.setFont(f); jtf3.setFont(f);
		
		jp24.add(jcb1); jp24.add(new JLabel("-")).setFont(f); jp24.add(jtf2);
		jp24.add(new JLabel("-")).setFont(f); jp24.add(jtf3);
		jp2.add(jp24);
		
		jcb2 = new JComboBox();
		jcb2.addItem("서울"); jcb2.addItem("경기"); jcb2.addItem("국외");
		jcb2.setFont(f);
		jp25.add(jcb2);
		jp2.add(jp25);
		
		jb = new JButton("확인");
		jb.setFont(f);
		jp26.add(jb);
		jp2.add(jp26);
		con.add(jp2,BorderLayout.CENTER);
		
		jb.addActionListener(this);
		
		setTitle("Resume");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s;
		System.out.println("성명 : " +jtf1.getText());
		if(jrb1.isSelected()) s = jrb1.getActionCommand();
		else s = "남성";
		System.out.println("성명 : "+s);
		
		s="";
		if(jchb1.isSelected()) s= s+ jchb1.getActionCommand() + "  ";
		if(jchb2.isSelected()) s= s+ jchb2.getText() + "  ";
		if(jchb3.isSelected()) s= s+ jchb3.getText() + "  ";
		if(jchb4.isSelected()) s= s+ jchb4.getText() + "  ";
		System.out.println("취미 : "+s);
		
		s=(String) jcb1.getSelectedItem();
		s = s + "-" + jtf2.getText();
		s = s + "-" + jtf3.getText();
		System.out.println("전화번호 : "+s);
		
		System.out.println("거주지역 : "+jcb2.getSelectedItem());
	}
	
}
public class Swing18 {

	public static void main(String[] args) {
		new Resume();
	}

}
