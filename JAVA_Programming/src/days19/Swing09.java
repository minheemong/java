package days19;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//이미지 apple.jpg  persimmon.jpg  pear.jpg   banana.jpg  cherry.jpg
//다섯개의 이미지를 아이콘으로 만들고   버튼 다섯개를 이미지와 함께 생성하세요
//그리드 레이아웃을 이용하여  3행 2열로 배치하고 
//액션 리스너를 붙여서  버튼 클릭시에 이미지에 해당하는 과일 이름이 result 라벨에 나오도록 작성하세요
//생성할 클래스 이름은 GridFruts 입니다.

// 버튼을 클릭하면 과일 이름이 result 라벨에 표시되도록 해주세요
// "사과를 선택하셨습니다"
class GridFruts extends JFrame implements ActionListener{
	JLabel result;
	GridFruts(){
		Container con = getContentPane();
		con.setLayout(new GridLayout(3,2));
		
		ImageIcon i1 = new ImageIcon("images/apple.jpg");
		ImageIcon i2 = new ImageIcon("images/persimmon.jpg");
		ImageIcon i3 = new ImageIcon("images/pear.jpg");
		ImageIcon i4 = new ImageIcon("images/banana.jpg");
		ImageIcon i5 = new ImageIcon("images/cherry.jpg");
		
		JButton apple = new JButton("사과", i1);
		JButton persimmon = new JButton("감", i2);
		JButton pear = new JButton("배", i3);
		JButton banana = new JButton("바나나", i4);
		JButton cherry = new JButton("체리", i5);
		result = new JLabel("");
		con.add(apple);   		con.add(persimmon);   		con.add(pear);
		con.add(banana);   		con.add(cherry);   		con.add(result);
		
		apple.addActionListener(this);
		persimmon.addActionListener(this);
		pear.addActionListener(this);
		banana.addActionListener(this);
		cherry.addActionListener(this);
		
		setTitle("과일선택하기  실습");
		setSize(260,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText(e.getActionCommand()+"을(를) 선택하였습니다");		
	}
}
public class Swing09 {
	public static void main(String[] args) {
		new GridFruts();

	}

}
