package days08;

import java.util.Scanner;

public class ControllOpWhile05 {

	public static void main(String[] args) {
		int std, k, i, j; // 학생수, 과목수, 반복실행 변수 i, j
		int tot, num; // 총점, 방금 입력받은 점수가 저장될 변수
		double avg; // 평균이 저장될 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생수 입력 : ");
		std = sc.nextInt();
		System.out.printf("과목수 입력 : ");
		k = sc.nextInt();
		
		// 입력된 학생 수 만큼 성적을 총점과 평균만 성적표 양식으로 출력
		for(i=0;i<std;i++) {
			System.out.println((i+1) + " 번 학생--------------------");
			tot=0;
			for(j=0;j<k;j++) {
				System.out.printf("%d 번째 과목 점수 :", j+1);
				num = sc.nextInt();
				tot+=num;
			}
			avg = tot/ (double)k;
			System.out.printf("총점 : %d, 평균 %.2f\n",tot,avg);
			System.out.println("---------------------------------------------");
		}

		
	}

}
