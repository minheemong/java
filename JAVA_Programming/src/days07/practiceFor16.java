package days07;

public class practiceFor16 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=10;i++) {
			for(j=1;j<=i;j++)
				System.out.printf("#");
			System.out.println();
			} 
		
		System.out.println();
		
		for(i=10;i>=1;i--) {
			for(j=1;j<=i;j++)
				System.out.printf("#");
			System.out.println();
			} 
		
		System.out.println();
		
		for(i=1;i<=10;i++) {
			for(j=1;j<=10;j++)
				if(j>=i) System.out.printf("#");
				else System.out.printf(" ");
			System.out.println();
			} 
	}
}
