package days04;

import java.util.Scanner;

public class PracticeVariable07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.printf("포장할 사과의 갯수를 입력하세요 : ");
		int apple, oneBoxQuantity, boxQuantity, rest;
		apple = sc.nextInt();
		/* 하나의 상자에 포장되는 사과의 갯수
		 포장된 사과박스의 갯수
		 포장하고 남은 사과의 갯수
		 */
		System.out.printf("하나의 상자에 포장되는 사과의 갯수 : ");
		oneBoxQuantity = sc.nextInt();
		boxQuantity = apple / oneBoxQuantity;
		System.out.println("포장된 사과박스의 갯수 : " + boxQuantity);
		rest = apple % oneBoxQuantity;
		System.out.println("포장하고 남은 사과의 갯수 : "+ rest);

	}

}
