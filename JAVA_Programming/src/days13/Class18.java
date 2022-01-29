package days13;
class StaticB {
	static int count = 0;
	int num;
	public StaticB() {
		this.num = count+1;  
		//생성자 메서드에서 count 값을 1씩 증가시키며, 그값을 num 에 저장
		count++;
	}
}
public class Class18 {

	public static void main(String[] args) {
		StaticB b1 = new StaticB();
		System.out.printf("b1.num = %d, count = %d\n", b1.num, StaticB.count);
		StaticB b2 = new StaticB();
		System.out.printf("b2,num = %d, count = %d\n", b2.num, StaticB.count);
		StaticB b3 = new StaticB();
		System.out.printf("b3,num = %d, count = %d\n", b3.num, StaticB.count);
	}

}
