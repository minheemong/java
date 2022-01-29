package days19;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class ButtonTest2 extends JFrame{
	ButtonTest2(){
		JButton b1 = new JButton("1"); 		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3"); 		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");		JButton b0 = new JButton("0");
		JButton b11 = new JButton("+");		JButton b12 = new JButton("-");
		JButton b13 = new JButton("x");		JButton b14 = new JButton("÷");
		JButton b15 = new JButton("=");		JButton b16 = new JButton("C");
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(b7); 			con.add(b8);		con.add(b9);		con.add(b11);
		con.add(b4);			con.add(b5);		con.add(b6);		con.add(b12);
		con.add(b1);			con.add(b2);		con.add(b3);		con.add(b13);
		con.add(b15);	    	con.add(b0);		con.add(b16);		con.add(b14);
		setTitle("버튼 컴퍼넌트 테스트"); 
		setSize(200, 200); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Swing02 {

	public static void main(String[] args) {
		new ButtonTest2();

	}

}
