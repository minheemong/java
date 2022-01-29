package days04;

import java.util.Scanner;

public class Variable07 {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int apple, boxOneQuantity, boxQuantity, theRest;
		
		System.out.printf("포장할 사과의 갯수를 입력하세요 : ");
		apple = sc.nextInt();
		System.out.printf("하나의 상자에 포장되는 사과의 갯수를 입력하세요 : ");
		boxOneQuantity = sc.nextInt();
		boxQuantity = apple / boxOneQuantity;
		theRest = apple % boxOneQuantity;
		System.out.println("포장된 사과박스의 갯수 : " + boxQuantity);
		System.out.println("포장하고 남은 사과의 갯수 :" + theRest);
		

	}

}
