package days15;
class SuperE{
	int x = 10;
	SuperE(int a){  x = a;	}
	void superEMethod() { 
		 System.out.println("superEMethod exe\nthis.x=" + this.x); 
	}
}
class SubE extends SuperE{
	int y =20;
	SubE(int a, int b){ super(a);		y = b;	}
	void subEMethod() {
		System.out.println("\nsubEMethod실행\nthis.x="+this.x
				+"\nsuper.x="+super.x);
	}
}

class SubsubE extends SubE{
	int z =30;
	SubsubE( int a, int b, int c ){ super(a, b);	 z = c; }
	void subsubEMethod() {
		System.out.println("\nsubsubEMethod실행\nthis.x="+this.x
				+"\nsuper.x="+super.x);
	}
}
public class Extends07 {
	public static void main(String[] args) {
		SuperE s = new SuperE(100);
		s.superEMethod();
		
		SubE s1 = new SubE(200, 300);
		s1.subEMethod();
		s1.superEMethod();
		
		SubsubE s2 = new SubsubE(400,500,600);
		s2.subsubEMethod();
		s2.subEMethod();
	    s2.superEMethod();
	}
}
