package days04;

public class Operator02 {

	public static void main(String[] args) {
		// 연산에 사용할 변수선언 및 값의 초기화
		// 초기화 : 변수 생성 후 처음 값을 넣는 동작
		int n = 50;
		double d = 50.0;
		System.out.println("n의 최초값 : " + n);
		// 피연산자로 쓰인 변수와 연산의 결과를 저장할 변수가 같은 연산
		// 연산의 순서
		n = n + 10; // 간략하게 다음과 같이 사용합니다. n+=10;
		//  1. 현재 n값(50) 과 두 번째 피연산자인 10이 CPU로 전달되어 덧셈
		//  2. 연산 결과가 돌아와서 다시 n변수에 저장됩니다
		//    연산에 참여했던 n값 50은 사라지고, 연산의 결과인 60이 n변수에 남습니다
		System.out.println("n = n + 10 -> n : " + n);
		n=n-10; // n-=10;
		System.out.println("n = n - 10 -> n : " + n);
		n=n*10; // n*=10;
		System.out.println("n = n * 10 -> n : " + n);
		System.out.println("d 의 최초값 : " + d);
		d=d/10; // d/=10;
		System.out.println("d = d / 10 -> d : " + d);
		n=n%10; // n%=10;
		System.out.println("n = n % 10 -> n : " + n);
		
		// n = n + 1; n = n - 1;
		// 1씩 증가 또는 감소하는 증가/감소 연산자 ++, --
		// 특정 변수의 값을 1 증가하거나, 감소시킬 수 있는 연산자
		// 대입연산자(=)를 사용하지 않고 값을 변경합니다.
		n = 50;
		n++; //n+=1; n=n+1;
		System.out.println("n++ -> n : " + n);
		++n; //n+=1; n=n+1;
		System.out.println("n++ -> n : " + n);
		// 위와 같은 단항연산일때는 ++나 --를 앞 또는 뒤 어느 곳에 붙여도 똑같이 연산됩니다
		
		// 앞 또는 뒤가 차이가 나는 곳은 다른연산에 섞여 있을 때 입니다
		System.out.println("현재 n값 :" +n);
		// 다른 연산 참여 후 1 증가
		System.out.println("println(n++) -> :" + n++);
		System.out.println("출력연산 후 n값 :" + n);
		
		n = 52;
		System.out.println("현재 n값 : " + n);
		// 1증가 후 다른 연산에 참여
		System.out.println("println(++n) -> :" + ++n);
		System.out.println("출력연산 후 n값 :" + n);

	}

}
