package days10;

public class Array16 {

	public static void main(String[] args) {
		// 1차원 배열의 복사
		int [] a = {1,2,3,4,5};
		int [] b;
		b = a;
		for(int k : a) System.out.printf("%d ", k);
		System.out.println();
		for(int k : b) System.out.printf("%d ", k);
		System.out.println();
		a[2] = 100;
		for(int k : a) System.out.printf("%d ", k);
		System.out.println();
		for(int k : b) System.out.printf("%d ", k);
		System.out.println();
		// 레퍼런스 변수간의 값의 복사로는 배열의 복사까지 이루어지지 않습니다
		// 위의 동작  b=a; 는 a가 갖고 있는 참조값(주소)를 b 변수에 복사한 것이므로
		// 배열공간은 하나, 그 배열 주소를 저장한 변수는 두개로 설정한것과 같습니다
		// 따라서  a[2]값 변경은 b[2] 값 변경과 같습니다
		
		//1.  배열복사의 방법1번 : 새로운 공간을  new 로 만들고 각 요소를 일일이 복사
		b = new int[5];
		for(int i=0; i<a.length; i++)b[i] = a[i];
		a[4] = 300;
		for(int k : a) System.out.printf("%d ", k);
		System.out.println();
		for(int k : b) System.out.printf("%d ", k);
		System.out.println();
		
		// 2. 배열복사의 방법2번
		// clone 메소드를 사용한 배열의 복사 : 배열명.clone()
		// 해당 배열변수가 레퍼런스(참조)하고 있는 장소의 배열을 새로운 공간에 복제합니다.
		// arr2는 arr1 배열이 복제된 배열을 참조하는 변수
		int [] c = a.clone(); // 힙 영역에 배열의 복사본을 새로 만들고 그 주소를 전달
		a[1] = 200;
		for(int k : a) System.out.printf("%d ", k);
		System.out.println();
		for(int k : c) System.out.printf("%d ", k);
		System.out.println();
		
		// 2차원 배열의 복사
		// 이차원배열(다차원배열)은 clone 메소드의 결과로 실제 일차원 배열을 관리하고 있는
		// 참조 변수들의 배열만 복사합니다. (2차원 배열의 전체적 행갯수만 복사한다는 뜻)
		int [][] arr4 = {{1,2,3}, {4,5,6}};
		System.out.println("arr4 : ");
		for( int i = 0 ; i < arr4.length ; i++ ) {
			for( int j = 0 ; j < arr4[i].length ; j++ )
				System.out.printf("%d   ", arr4[i][j]);
			System.out.println();
		}
		int [][] arr5 = arr4.clone(); 
		// arr4 과 공유하고 있는 1차원 배열의 값이 수정
		// 얕은 복사로 복사된 arr5의 값을 수정하게 되면  arr4도 변경된 값을 출력하게됨
		arr4[1][0] = 400;  
		System.out.println("arr5 (arr4 clone) : ");
		for( int i = 0 ; i < arr4.length ; i++ ) {
			for( int j = 0 ; j < arr4[i].length ; j++ )
				System.out.printf("%d   ", arr5[i][j]);
			System.out.println();
		}
		arr5[0] = new int[3];
		arr5[1] = new int[3];
		// 새로 공간 생성후 각각의 값을 다시 복사해야 완벽한 복사가 실행됩니다
	}

}
