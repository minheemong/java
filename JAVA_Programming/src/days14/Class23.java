package days14;
class Complex{
	private int real; //실수부 자료 저장용 변수
	private int image; //허수부 자료 저장용 변수
	Complex() {
		real = 10;
		image = 20;
	}
	public void prn() {
		System.out.println(real + "+" + image + "i");
	}
	Complex(int a, int b) {
		real = a;
		image = b;
	}
	public Complex add(Complex c2) {
		Complex c = new Complex();
		c.real = this.real+c2.real;
		c.image = this.image+c2.image;
		return c;
	}
	public Complex minus(Complex c2) { // this <- c1        c2 <- c2
		Complex c = new Complex();
		c.real = this.real-c2.real;
		c.image = this.image-c2.image;
		return c;
	}
}
public class Class23 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.prn();
		Complex c2 = new Complex(8, 6);
		c2.prn();
		Complex c3;
		c3 = c1.add(c2); //(5+3i) + (2+2i) -> (7+5i)
		c3.prn();
		Complex c4 = c1.minus(c2); // (5+3i) - (2+2i) -> (3+1i)
		c4.prn();

	}

}
