public class ControllOpFor161 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println("\n");
		//----------------------------------------------------------------------------------------
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		//----------------------------------------------------------------------------------------0
		// for(int i=1; i<=10; i++) {
		//  	for(int j=1; j<= 11-i  ; j++) {
		for(int i=10; i>=1; i--) {
			for(int j=1; j<= i  ; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		//----------------------------------------------------------------------------------------
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if( j>=i  ) System.out.printf("#");
				else 	System.out.printf(" ");
			}
			System.out.println();
		}
	
		System.out.println("\n");
		//----------------------------------------------------------------------------------------
		for(int i=10; i>=1; i--) {
			for(int j=1; j<=10; j++) {
				if( j>=i ) System.out.printf("#");
				else 	System.out.printf(" ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		//----------------------------------------------------------------------------------------
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=9+i; j++) {
				if( j>=11-i ) System.out.printf("#");
				else 	System.out.printf(" ");
			}
			System.out.println();
		}
	}
}




