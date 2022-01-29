package days018;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception08 {

	public static void main(String[] args) {
		//순수하게 숫자만으로 이루어진 정수를 입력 받는  while 과 try-catch 를 제작하세요
		// sc.nextInt() 는 입력 내용에 문자가 섞이면  (InputMismatchException  에러가
		// 발생합니다
		// 에러가 발생하면, 입력 버퍼를  sc.next(); 를 실행해서 비우고
		// 잘못입력했습니다 메세지를 출력후 정상 입력까지 입력을 반복하는 코드를 작성합니다
		// 문자를 입력 받아 날짜로 변한하는 코드 참조

		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			try {
				System.out.print("정수를 입력하세요 : ");
				num = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("정수가 아닌 잘못된 타입이 입력되었습니다.");
				// 키보드 버퍼에 남아있는 문자열(엔터 등)의 값을 제거
				sc.next(); // 입력 버퍼를 비움
			}
		}
	}
}
