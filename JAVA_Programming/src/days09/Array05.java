package days09;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		//  정해지지 않은 과목수의 성적을 입력받아, 총점과 평균을 출력
		int [] score = new int[100];
		// 총점, 배열의 첨자를 위한 변수
		int tot=0, i=0;
		// 반복 실행문을 이용하여 점수 입력(do while 이용)
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("점수입력(종료 0) : ");
			score[i] = sc.nextInt();
			i++;
		}while(score[i-1] != 0);
		// 총점 평균 계산
		for(int k=0; k<i-1; k++) tot += score[k];
		double ave;
		ave = tot / (double)(i-1);
		// 출력
		System.out.println("입력된 점수 : ");
		for(int k = 0; k<i-1; k++ )System.out.printf("%d ", score[k]);
		System.out.printf("\n총점 : %d 점, 평균 %.2f 점\n", tot, ave);
	}
}
