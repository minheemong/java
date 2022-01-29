package days13;
//int 형 데이터하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩 된 생성자를 
// 갖는 클래스 제작
//멤버 필드로는 int dan; 하나 생성
//멤버 메서드 : dan 값이 0이면 1~9단의 구구단 모두 출력, 0 이 아니면 해당 구구단만 
// 출력하는 메서드 제작
//디폴트 생성자는 dan 변수를 0으로 저장, 전달인수가 있는 생성자는 dan 변수를 전달인수 
// 값으로 저장
//메서드 이름 : print()
//클래스 이름 Gugudan

class Gugudan{
	int dan;
	Gugudan(){ dan = 0;}
	Gugudan(int dan){ this.dan = dan;}
	void print() {
		if(dan==0) {
			for(int k=2; k<=9; k++)
				prngugudan(k);
				//for(int i=1; i<=9; i++)
					//		System.out.println(k + "x" + i + "=" + k*i );
		}	else {
			prngugudan(dan);
			//for(int i=1; i<=9; i++)
			//		System.out.println(dan + "x" + i + "=" + dna*i );
		}
	}
	void prngugudan(int n) {
		for(int i=1; i<=9; i++)
			System.out.println(n + "x" + i + "=" + n*i );
	}
}
public class Class12 {

	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(8);
		Gugudan g2 = new Gugudan();
		//g1.print();
		g2.print();

	}

}
