package days02;

public class JavaFifth {

	public static void main(String[] args) {
	/*
 		\' : 작은 따옴표 출력
 		\" : 큰 따옴표 출력
 		%% : % 출력
 		\\ : 백슬래쉬 출력
 		\b : 백스페이스 - 커서 왼쪽으로 이동하면서 앞글자를 한글자씩 삭제
 		                    - 다만 이클립스 콘솔창에서는 정상작동하지 않습니다. 
 	*/
		System.out.printf("겁나 쉬운 \"자바 프로그래밍\"\n");
		// 큰따옴표를 화면에 직접 출력하면 \" 라고 써야 큰따옴표만 출력됩니다.
		// \ 없이 " 만 사용한다면 끝나는 따옴표로 인식되어 오류를 발생시킵니다.
		
		System.out.printf("대통령은 조약을 \"체결-비준\"하고,\n");  
		 System.out.printf("외교사절을 \"신임-접수\" 또는 \"파견\"하며,\n");
		 System.out.printf("\'선전포고\'와 \'강화\'를 한다.\n\n");
		 System.out.printf("대통령의 임기가 만료되는 때에는 \n");
		 System.out.printf("임기만료 70%% 내지 40%% 전에 후임자를 선거한다\n\n"); 
		
	}

}
