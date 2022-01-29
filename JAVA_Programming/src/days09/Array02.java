package days09;

public class Array02 {

	public static void main(String[] args) {
		// 배열의 선언과 생성 방법
		// 1. 배열 변수의 선언 후, 실제 배열 공간을 할당 받는 방법 
		int [] a1 = null;   // "A"  "ABCD"   " "  ""    ''
		// 변수에 null 을 초기화한것과 아무것도 초기화하지 않은 것은 다릅니다.
		// int [] a1;  // a1변수는 아무것도 초기화되지 않았으므로 초기화전까지
		// 사용(출력 및 연산)이 불가능 합니다 System.out.println(a1); X 에러
		a1 = new int[5];
		
		// 2. 배열 변수의 선언과 배열의 생성을 동시에 진행
		int [] a2 = new int[5];
		// HEAP 메모리의 특징 : 배열은 HEAP 메모리에 new 연산자를 통해서 생성되며
		// HEAP 메모리에 생성되는 모든 영역은 0 또는 0.0, null 값으로 초기화됩니다.
		System.out.println(a1[0] + " " + a1[1] + " " + a1[2] + " " + a1[3]);
		System.out.println(a2[0] + " " + a2[1] + " " + a2[2] + " " + a2[3]);
		
		// 3. 배열을 생성하면서 임의의 값으로 초기화하는 방법
		// 크기가 5 인 배열을 생성하면서, 각 요소의 값을 1,2,3,4,5 로 초기화하는 코드
		int [] a3 = new int[] {1,2,3,4,5};
		System.out.println(a3[0]+" "+a3[1]+" "+a3[2]+" "+a3[3]+" "+a3[4]);
		int [] a4 = {5,4,3,2,1};
		System.out.println(a4[0]+" "+a4[1]+" "+a4[2]+" "+a4[3]+" "+a4[4]);
		a4[0] = 100;
		System.out.println(a3[0] + " " + a4[0]);
		
		// 4. 배열 변수 arr5, arr6를 선언하는 코드
		int [] a5, a6;
		a5 = new int[3];
		a6 = new int[3];
		
		// 5. 배열 변수 arr7, arr8,  일반 int형 변수 arr9을 생성하는 코드
		int a7 [], a8 [], a9;
		a7 = new int[3];
		a8 = new int[3];
		a9 = 10;
	}

}
