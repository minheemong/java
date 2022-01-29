package days10;

public class Array14 {

	public static void main(String[] args) {
		int [] a = new int[10];
		int k = 1;
		
		for(int i=0;i<a.length;i++) 
			a[i] = k++;
		
		for(int i=0;i<a.length;i++) System.out.print(a[i] + " ");
		System.out.println();
		for(int j : a) {
			System.out.print(j + " ");
		}
		// a :  반복실행에 사용될 배열
		// j : 배열의 값을 반복 1회당 하나씩 차례로 전달받을 변수
		// 작성조건 
		// 1. j변수는 a배열의 하나의 요소와 자료형이 반드시 같아야 합니다.
		// 2. 배열은 배열의 이름만 ':' 뒤에 간단히 써줍니다.
		// 동작 원리
		// - a배열의 값이 차례로 j변수에 전달되면서 반복실행합니다
		// - a배열의 요소갯수만큼 반복 실행합니다.
		
		System.out.println();
		k=1;
		int [][] b = new int [5][5];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=k++;
			}
		}
		for(int [] bAddr : b) { 
			for(int j : bAddr) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
