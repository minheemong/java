package days09;

public class Array07 {

	public static void main(String[] args) {
		// 배열에 있는 값들중 최대값과 최소값을 찾아서 출력하세요
		int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
		
		int max = a[0]; //  지금까지 나왔던 숫자중 가장 큰값을 저장해둘 변수
		
		for(int i = 1; i<a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		System.out.println("최대값 : " + max);
		
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(min > a[i]) min = a[i];
		}
		System.out.println("최소값 : " + min);
		
		// 배열의 값들을 오름차순 또는 내림차순으로 재배치(정렬)
		// int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
		// i 를 첨자로한 값과 그 뒤를 있는j 를 첨자로 한 값들을 모두 한번씩 비교하여 
		// i번째 값보다 작은 숫자가 나오면 그 둘의 값을 맞바꿔서 작은값이 앞으로 
		// 오게 합니다
		
		// 실행 결과 j 가 마지막 첨자까지 도달했을때 i번째에는 가장 작은 숫자가 
		// 저장되게 하는 원리 입니다
		
		// 변수들의 값을 맞교환 동작이 필요
		int a1 = 30, b1 = 50;
		//a1 = b1;
		//b1 = a1;
		int t = a1;
		a1 = b1;
		b1 = t;
		
		int i, j;
		for(i=0; i<a.length; i++) {
			for(j=i+1; j<a.length; j++) {
				if( a[i] > a[j] ) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for(i = 0; i<a.length; i++)	System.out.printf("%d  ", a[i]);
		System.out.println();
		for(i=0; i<a.length; i++) {
			for(j=i+1; j<a.length; j++) {
				if( a[i] < a[j] ) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for(i = 0; i<a.length; i++)	System.out.printf("%d  ", a[i]);
	}

}
