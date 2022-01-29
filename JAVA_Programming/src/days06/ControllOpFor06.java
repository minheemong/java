package days06;

import java.util.Scanner;

public class ControllOpFor06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact=1, i, k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		// 6을 입력했다면   6! = 1×2×3×4×5×6 = 720
		// 1. 6! = 
		System.out.printf("%d! = ",k);
		// 2. 1×2×3×4×5×6×
		for(i=1;i<k;i++) {
			System.out.printf("%d×",i);
			fact = fact * i;
		}
		// 3. 720
		//for(i=1;i<=k;i++) fact = fact * i; 
		System.out.printf("%d = %d",k, fact*k);


	}

}
