package days09;

import java.util.Random;
import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		// 야구 게임 프로그램
		// 상대가 나에게 알려주지 않은 숫자를  질문과 답변을 통해 맞춰가는 게임
		// 나에게 알려주지 않은 숫자 : 6 5 7 같은 한자리 숫자 세개
		// 질문 : 3 6 7  같은 한자리 숫자 세개
		// 답변 : 같은 숫자가 자리수가까 같으면 S   숫자만 같으면 B
		// 숫자 하나는 0~9 까지...  세개의 숫자 중 중복 숫자 없음
		
		//1. 컴퓨터가 기억할 숫자를 저장할 배열, 사용자가 입력한 숫자를 저장할 배열생성
		//    각각 세칸짜리 배열
		int [] com = new int[3];
		int [] user = new int[3];
		//2. 컴퓨터가 나에게 알려주지 않은 숫자 세개를 결정->생성한 배열에 저장
		Random rd = new Random();
		int i, j, s=0, b=0;
		for(i= 0; i<com.length; i++) {
			com[i] = rd.nextInt();
			if( com[i] < 0) com[i] *= -1;
			com[i] = com[i] % 10;
			for(j = 0; j<i; j++) 
				if(com[i]==com[j]) break;
			if(i!=j)i--;  // 동일한 숫자 발생시 다시 추첨
		}
		// System.out.println(com[0] + " " + com[1] +" " + com[2]);
		Scanner sc = new Scanner(System.in);
		while(true) {
			//3.  컴퓨터에게 사용자가 맞추고자 하는 숫자를 입력
			/*System.out.print("입력(반드시 한자리숫자) : ");
			user[0] =  sc.nextInt();
			System.out.print("입력(반드시 한자리숫자) : ");
			user[1] =  sc.nextInt();
			System.out.print("입력(반드시 한자리숫자) : ");
			user[2] =  sc.nextInt();*/
			System.out.print("입력(세자리숫자-중복되지 않게) : ");
			/*int num = sc.nextInt();
			user[0] = num/100;
			user[1] = (num%100) / 10;
			user[2] = num%10;*/
			String num = sc.nextLine(); 
			// 세개의 아라비아 기호를 한번에 입력 받아 하나씩 분리->숫자로 변환
			user[0] = num.charAt(0) - '0';  //'4' - '0'  ->  4
			user[1] = num.charAt(1) - '0';
			user[2] = num.charAt(2) - '0';
			// System.out.println(user[0] + " " + user[1] +" " + user[2]);
			//4.  입력 받은 숫자와 저장한 컴퓨터숫자를 비교새허 스트라이크와 볼을 카운트
			s = 0; 
			b = 0;
			for(i=0; i<com.length; i++) {
				for(j=0; j<user.length; j++) {
					if( com[i] == user[j] ) {
						if( i == j )s++;
						else b++;
					}
				}
			}
			//5. 스트라이크과 볼을 출력
			System.out.println(s + " Strike  " + b + " Ball");
			if(s==3)break;
		}
		//6. 3~5 까지를 컴퓨터숫자와 동일한 숫자를 입력할때까지 반복
		System.out.println("프로그램 종료");
	}

}
