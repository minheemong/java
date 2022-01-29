package days18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception08 {

	public static void main(String[] args) {
		// 순수하게 숫자만으로 이루어진 정수를 입력 받는 while과 try-catch를 제작하세요
		// sc.nextInt()는 입력내용에 문자가 섞이면 (InputMismatchException 에러가
		// 발생합니다
		// 에러가 발생하면, 입력 버퍼를 sc.next();를 실행해서 비우고
		// 잘못입력했습니다 메세지를 출력 후 정상 입력까지 입력을 반복하는 코드를 작성합니다.
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a=0;
		while(true) {
			try {
				a = sc.nextInt();
				break;
			}catch (InputMismatchException i) {
				System.out.println("형식이 다릅니다. 정수를 입력하세요 : ");
				// 키보드 버퍼에 남아있는 문자열(엔터 등)의 값을 제거
				sc.next(); // 입력 버퍼를 비움
			}
		}
	}

}
