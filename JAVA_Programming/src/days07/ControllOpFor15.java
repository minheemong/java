package days07;

public class ControllOpFor15 {

	public static void main(String[] args) {
		
		int i, j;
		for(i=1; i<=9; i++) {
			for(j=2; j<=5; j++) {
				System.out.printf("%dx%d=%2d ", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(i=1; i<=9; i++) {
			for(j=6; j<=9; j++) {
				System.out.printf("%dx%d=%2d ", j, i, i*j);
			}
			System.out.println();
		}
	}
}
