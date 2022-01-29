package days13;
//static 변수, static 메서드, 인스턴스 변수, 인스턴스 메서드
class Mymath{
	 int a, b;
	 static int c=0;
	 Mymath(){  c++;  }
	 
	 // 인스턴스 메서드들은 인스턴스 변수에 자유롭게 접근이 가능합니다
	 int add() { return a+b;}
	 int subtract() {return a-b;}
	 int multiply() { return a* b;}
	 double divide() { return a/(double)b; } 
	 
	 // 인스턴스 메서드들은 스태틱 변수에도 자유롭게 접근이 가능합니다
	 void init() { a = c*20;  b = c*30; }
	 
	 // 스태틱 메서드들은 인스턴스 변수에 접근이 불가능합니다
	 static int add(int e, int d) { 
		 // return a+b+c+d;
		 return c+d;
	 }
	 static int subtract(int e, int d) {return e-d+c;}
	 static int multiply(int e, int d) {return e*d+c;}
	 static double divide(double e, double d) {return e/d+c;}
	 
	 // 스태틱 메서들은 스태틱 변수에 자유롭게 접근이 가능합니다.
}
public class Class21 {

	public static void main(String[] args) {
		Mymath mm = new Mymath();
		//mm.a = 200;		mm.b = 100;
		mm.init();
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide()); // 멤버 변수로 연산
		System.out.println(Mymath.add(10, 30));
		System.out.println(Mymath.subtract(10, 30));
		System.out.println(Mymath.multiply(10, 30));
		System.out.println(Mymath.divide(10, 30));  // 매개변수로 연산

	}

}
