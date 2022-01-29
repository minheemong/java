package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBoxTest extends JFrame implements ItemListener{
	JLabel jl;
	ImageIcon ii;
	JComboBoxTest() {
		JComboBox<String> jcb = new JComboBox<String>();
		// 콤보상자는 목록으로 들어갈 데이터가 정해지지 않은 상태. 서로 다른 자료형도 입력 가능하지만...
		// 실제 사용시점에서 목록으로 사용할 데이터 형식을 결정함
		// (String, double, int 등 객체도 사용가능)
		// <>에 자료형을 써넣어서 현재 사용할 콤보상자 목록의 데이터 형식을 결정합니다.
		
		jcb.addItem("banana"); // .addItem() 콤보상자의 목록 추가
		jcb.addItem("apple");
		jcb.addItem("pear");
		jcb.addItem("cherry");
		jcb.addItem("grape");
		
		ii = new ImageIcon("images/banana.jpg");
		jl = new JLabel(ii);
		
		Font f = new Font("굴림",Font.BOLD,20);
		jcb.setFont(f);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jcb);
		con.add(jl);
		
		jcb.addItemListener(this);
		
		setTitle("콤보 박스 실습");
		setSize(500,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String jcb1 =(String)e.getItem();
		ImageIcon ni = new ImageIcon("images/"+jcb1+".jpg");
		jl.setIcon(ni);
	}
	
}
public class Swing17 {

	public static void main(String[] args) {
		new JComboBoxTest();
	}

}
