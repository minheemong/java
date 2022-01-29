package days07;

public class ControllOpFor17 {

	public static void main(String[] args) {
		// 1부터 100 사이의 소수(Prime Number) 를 출력하세요
		for( int i = 2; i<=100; i++) {
			// 반복실행중  i 값이 소수인지 검사합니다.
			int cnt = 0;
			// 검사를 위해서 1~i 까지의 숫자로 i 를 나눠봅니다. 
			//for(int j=2; j<i/2; j++) {
			//for(int j=2; j<i; j++) {
			for(int j=1; j<=i; j++) {
				if( i%j == 0) {
					cnt++; // i를 j 로 나눈 나머지가 0일때마다 cnt 는 1증가합니다
				}
			}
			// 1~i 까지 검사를 끝내고 cnt 가 2와 같은지 검사합니다
			// if( cnt == 0)
			if( cnt == 2)
				System.out.printf("%d ", i);
		}
		// i변수 값 1 : j변수값 1~1 을 이용하여 나눈 나머지를 계산하고 
		//                   결과가 0인경우가 두번 이었는지 그 이상이었는지 검사
		// i변수 값 2 : j변수값 1~2 를 이용하여 나눈 나머지를 계산하고 
		//                    결과가 0인경우가 두번 이었는지 그 이상이었는지 검사
		// i변수 값 3 : j변수값 1~2 를 이용하여 나눈 나머지를 계산하고 
		//                    결과가 0인경우가 두번 이었는지 그 이상이었는지 검사
		// ...
		// 나눈나머지 값이 0이었던 횟수가 딱 2번이었던 숫자만 출력
	}
}
