package days21;

import java.io.IOException;

//입출력
//자바에서 입출력은 스트림의 개념을 사용합니다
//스트림 : 단방향 통신
//입력과 출력에 관한 스트림이 각각 클래스로 제공됩니다
//모든 입출력 클래스는 java.io 패키지에 정의 되어 있습니다

//입출력 클래스
//1. 바이트 타입
//- 이진데이터(눈으로 읽을 수 없는 데이터) :  이미지, 실행파일, 엑셀파일 등등
//- InputStream(입력의 최상위 부모클래스), - OutputStream(출력의 최상위 부모클래스)
//2. 문자 타입
//- 텍스트 데이터 :  txt 파일과 같은 내용을 처리할 수 있는 클래스
//- Reader(입력의 최상위 부모클래스), - Writer(출력의 최상위 부모클래스)

public class IO01 {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);  기본 입력 -  키보드 입력
		// Scanner 없이 System.in 객체를 사용하여 기본입력을 처리할 수 있습니다
		// 자바의 모든 입출력 작업은 명시적으로 예외처리를 선언해야 합니다.
		// (IOException 타입의 예외가 발생됨) : System.in.read();
		System.out.print("정수를 입력하세요 : ");
		int num = System.in.read();  // 1바이트(한글자) 읽어서 아스키코드값으로 최종 입력됩니다
		// 위와 같은 바이트 입출력 클래스는 스트림으로 부터 1바이트씩 읽거나 쓸수 있습니다
		// 기본입력을 제공하는 System.in 객체는 키보드와 연결된 기본입력 스트림으로부터
		// 1바이트씩 읽어 올수 있으며, 읽어 들이는 값은 문자의 코드(아스키코드) 값입니다
		// 따라서 num 변수에는 입력한 글자의 아스키코드값이 저장됩니다.  A - 65     0 - 48    a - 97
		System.out.printf("입력된 정수 : %d\n", num);
		System.out.printf("입력된 문자 : %c\n", (char)num);
		// 입력 스트림의 동작 방식
		// 입력 스트림의 경우 데이터를 입력받을 버퍼를 검색하여  해당 버퍼에 내용이 존재하지 않는 경우 
		// 버퍼에 데이터가 쌓일 때까지 대기함(키보드 입력의 경우 사용자가 데이터를 입력하고 엔터키 입력할 때까지 )
		// 연결된 버퍼에 데이터가 존재하는 경우, 해당 버퍼에서
		// 바이트 스트림은 1byte씩 데이터를 읽어오고, 문자스트림의 경우 2byte씩 데이터를 읽어옵니다
		// 기본 입력은 1바이트 읽기실행
		int input;
		System.in.read();
		System.in.read();
		System.out.print("키보드 입력을 실행하세요 : ");
		input = System.in.read();		
		System.out.printf("\n입력된 값 : %d\n", input);
		System.out.printf("입력된 문자 : %c\n", (char)input);
	}

}
