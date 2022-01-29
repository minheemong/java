package days09;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		char [] grade = {'F','F','F','F','F','F','D','C','B','A','A'};
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력 하세요(0~99) : ");
		int score = sc.nextInt();
		
		// 입력 받은 점수에 따라 학점을 출력하되, if 사용하지 않고, 배열을 사용하세요
		
		// 힌트  98 / 10  -> 9
		System.out.println("학점 : " + grade[score/10]);
		

	}

}
