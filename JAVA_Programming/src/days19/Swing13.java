package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//컨테이너의 레이아웃 : 5행 1열의 GridLayout
// 1 행 :  JPanel p1 배치 -> p1에는 FlowLayout 으로 TextField 한개 배치(가로크기 적당히)
// 2 행 : JPanel p2 배치 -> p2 에는 GridLayout 으로 버튼 네개( 7, 8, 9, +)
// 3 행 : JPanel p3 배치 -> p3 에는 GridLayout 으로 버튼 네개( 4, 5, 6, -)
// 4 행 : JPanel p4 배치 -> p4 에는 GridLayout 으로 버튼 네개( 1, 2, 3, x)
// 5 행 : JPanel p5 배치 -> p5 에는 GridLayout 으로 버튼 네개( C, 0, =, ÷)
class Calculator extends JFrame implements ActionListener{
	
	JTextField jt;
	int firstNumber;
	int secondNumber;
	int result1;
	double result2;
	int operator=0;
	
	Calculator(){
		jt = new JTextField(10);
		Font f = new Font("굴림", Font.BOLD, 20); // 폰트 객체 생성.
		jt.setFont(f); // 텍스트 필드에 폰트 적용

		//JButton b = new JButton("폰트"); 
		//b.setFont(f); 		// 버튼에 폰트 적용
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,1));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		jt.setText("0");  // 텍스트 0 입력(최초 표시 값)
		jt.setHorizontalAlignment(SwingConstants.RIGHT);  // 텍스트 필드 오른쪽 정렬
		jt.setEditable(false);  //마우스 키보드로 편집 할수 없게 설정
		p1.add(jt);
		con.add(p1);
		
		JButton b7 = new JButton("7"); 
		JButton b8 = new JButton("8"); 
		JButton b9 = new JButton("9"); 
		JButton b11 = new JButton("+"); 
		b7.setFont(f);  b8.setFont(f);  b9.setFont(f);  b11.setFont(f);
		p2.setLayout(new GridLayout(1,4));
		p2.add(b7);  p2.add(b8);  p2.add(b9); p2.add(b11); 
		con.add(p2);
		
		JButton b4 = new JButton("4"); 
		JButton b5 = new JButton("5"); 
		JButton b6 = new JButton("6"); 
		JButton b12 = new JButton("-"); 
		b4.setFont(f);  b5.setFont(f);  b6.setFont(f);  b12.setFont(f);
		p3.setLayout(new GridLayout(1,4));
		p3.add(b4);  p3.add(b5);  p3.add(b6); p3.add(b12); 
		con.add(p3);
		
		JButton b1 = new JButton("1"); 
		JButton b2 = new JButton("2"); 
		JButton b3 = new JButton("3"); 
		JButton b13 = new JButton("x"); 
		b1.setFont(f);  b2.setFont(f);  b3.setFont(f);  b13.setFont(f);
		p4.setLayout(new GridLayout(1,4));
		p4.add(b1);  p4.add(b2);  p4.add(b3); p4.add(b13); 
		con.add(p4);
		
		JButton b15 = new JButton("C"); 
		JButton b0 = new JButton("0"); 
		JButton b16 = new JButton("="); 
		JButton b14 = new JButton("÷"); 
		b15.setFont(f);  b0.setFont(f);  b16.setFont(f);  b14.setFont(f);
		p5.setLayout(new GridLayout(1,4));
		p5.add(b15);  p5.add(b0);  p5.add(b16); p5.add(b14); 
		con.add(p5);
		
		JButton b17 = new JButton("◀");
		JButton b18 = new JButton("sqr");
		JButton b19 = new JButton("1/x");
		JButton b20 = new JButton("%");
		b17.setFont(f); b18.setFont(f); b19.setFont(f); b20.setFont(f);
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(1,4));
		p6.add(b17); p6.add(b18); p6.add(b19); p6.add(b20);
		con.add(p6); 
		
		
		b0.addActionListener(this);		b1.addActionListener(this);		
		b2.addActionListener(this);		b3.addActionListener(this);		
		b4.addActionListener(this);		b5.addActionListener(this);		
		b6.addActionListener(this);		b7.addActionListener(this);		
		b8.addActionListener(this);		b9.addActionListener(this);		
		b11.addActionListener(this);		b16.addActionListener(this);		
		b12.addActionListener(this);		b13.addActionListener(this);		
		b14.addActionListener(this);		b15.addActionListener(this);
		b17.addActionListener(this);		b18.addActionListener(this);
		b19.addActionListener(this);		b20.addActionListener(this);
		
		setTitle("계산기  실습");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			String oldText = jt.getText();
			// 변수 s에는 클릭된 버튼의 글자가 저장됩니다.
			switch(s) {
			case "0": case "1": case "2": case "3": case "4": 
			case "5": case "6": case "7": case "8": case "9": 
				if(oldText.equals("0")) oldText="";
				jt.setText(oldText+s); break;
			case "+" :
				firstNumber = Integer.parseInt( jt.getText() );
				jt.setText("0");
				operator=1;
				break;
			case "-" :
				firstNumber = Integer.parseInt( jt.getText() );
				jt.setText("0");
				operator=2;
				break;
			case "x" :
				firstNumber = Integer.parseInt( jt.getText() );
				jt.setText("0");
				operator=3;
				break;
			case "÷" :
				firstNumber = Integer.parseInt( jt.getText() );
				jt.setText("0");
				operator=4;
				break;
			case "%" :
				firstNumber = Integer.parseInt( jt.getText() );
				jt.setText("0");
				operator=5;
				break;
			case "=" :
				secondNumber=Integer.parseInt( jt.getText() );
				switch(operator) {
				case 1 :
					result1 = firstNumber + secondNumber;
					jt.setText( String.valueOf(result1));
					break;
				case 2 :
					result1 = firstNumber - secondNumber;
					jt.setText( String.valueOf(result1));
					break;
				case 3 :
					result1 = firstNumber * secondNumber;
					jt.setText( String.valueOf(result1));
					break;
				case 4 :
					result2 = (double)firstNumber / (double)secondNumber;
					jt.setText( String.valueOf(result2));
					break;
				case 5 :
					result2 = firstNumber % secondNumber;
					jt.setText( String.valueOf(result2));
					break;
				}
				break;
			case "C" : jt.setText("0"); break;
			case "◀" : 
				// substing과 length를 활용하여 백스페이스 키를 완성하세요
				// 총글자수 -1만큼 왼쪽부터 substring으로 취합니다... 그리고 다시 setText
			
			//jt.getText().length() : 텍스트 필드에 있는 글자의 총갯수
			// 98765가 있다면 총글자갯수 5, 인덱스에는 0번부터 4번까지 입니다
			// 이중 9876만 취하고 싶다면, substring에 0,4라고 써야 0번부터 3번 글자까지 추출됩니다
			// 그말은 곧 length()메소드를 사용했다면 문자열.substring(0, 문자열.length()-1);
			//jt.setText(jt.getText().substring(0, jt.getText().length()-1));
			
			// 백스페이스 키 사용시 현재 글자 갯수가 1개라면, 바로 0으로 치환
				if(jt.getText().length()==1) jt.setText("0");
				else {
					String t = jt.getText(); //글자추출
					int n = t.length(); //글자 수 계산
							String str = t.substring(0,n-1); //맨 왼쪽부터 글자수-1 까지 추출
							jt.setText(str);
				}
			case "sqr" : 
				result2 = Math.sqrt(Integer.parseInt(jt.getText()));
				jt.setText( String.valueOf(result2) );
			case "1/x" :
				result2 = 1.0/ (double)Integer.parseInt(jt.getText());
				jt.setText( String.valueOf(result2) );
			}
	}
}
public class Swing13 {

	public static void main(String[] args) {
		new Calculator();
	}

}
