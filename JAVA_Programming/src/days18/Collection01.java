0package days18;

import java.util.ArrayList;
import java.util.Vector;

// 컬렉션 클래스
// 자료구조를 구현하고 있는 클래스
// 자료구조 : 각각의 데이터를 효율적으로 저장하고 운용하기 위한 방법론

// 1. 배열
// - 다수의 요소를 저장할 수 있음, 번호(첨자)에 의해 손쉬운 접근 방법을 제공
// - 크기가 고정, 데이터의 중간 삽입과 중간삭제에 비효율적

// 2. 리스트(List)
// - 크기의 제약 없이 데이터를 저장할 수 있음, 데이터의 삽입과 삭제에 최적화
// - 검색에 취약 - (참조값(주소)을 저장하기 때문에)
// - 이를 개선하기 위한 더블 링크드 리스트를 사용하기도 함
// - 데이터 저장 시 불필요한 메모리 사용
// 자바의 모든 자료구조 클래스(컬렉션 클래스)는 java.util 패키지를 통해 제공받을 수 있음
// 위와 같은 동적 배열을 구현하고 있는 클래스 - Vector, ArrayList(가장 많이 사용)
// 링크드 리스트를 구현하고 있는 클래스 - LinkedList

// 3. Set 타입의 저장방법을 구현하고 있는 클래스
// Set 타입 : 데이터를 저장할 때, 중복을 허용하지 않는 방법 :
// 검색을 위해서 사용, 중복된 값을 제거하기 위해서 사용
// - HashSet(사용 빈도 : 중), TreeSet

// 4. Map 타입의 저장방법을 구현하고 있는 클래스
// Map 타입 : 데이터를 Key와 Value의 형태로 저장하는 방법
// (검색을 위해서 사용, Key의 값은 중복을 허용하지 않음, Value의 값은 중복을 허용)
// - Hashtable, HashMap(가장 많이 사용)

// 5. Vector, ArrayList 클래스
// - 두개의 클래스는 동일한 기능을 제공
// - 쓰레드 동기화의 지원여부 크기의 제약없이 데이터를 저장(동적으로 크기를 확장)
// - 배열과 같이 인덱스를 기반으로 데이터를 접근
// - 데이터의 중복을 허용
// - 데이터의 입력 순서를 유지
public class Collection01 {

	public static void main(String[] args) {
		// 동적 배열의 객체 생성 초기값으로 크기를 지정할 수 있지만 통상 크기 지정 없이 사용합니다
		Vector v = new Vector();
		ArrayList a = new ArrayList();
		
		// 데이터 입력 add 메소드를 사용하여 데이터 입력
		v.add(10);
		v.add(20);
		v.add(20);
		// 데이터의 저장은 add로 저장하는 데이터의 레퍼런스값을 저장합니다.
		a.add(10);
		a.add(20);
		a.add(30);
		
		// Vector, ArrayList 클래스의 size 메소드 : 현재 저장되어 있는 데이터의 개수를 반환
		for(int i=0;i<v.size();i++)
			System.out.printf("v[%d] = %d\t\t",i,v.get(i));
		// Vector, ArrayList 클래스의 get 메소드 : 특정 인덱스에 저장되어 있는 데이터를 반환
		
		System.out.println();
		for(int i=0;i<a.size();i++)
			System.out.printf("a[%d] = %d\t\t",i,a.get(i));
		
		a.set(2,100); // 인덱스 매개변수를 추가하여 데이터 삽입 가능 - set는 기존값을 지우고 대입
		System.out.println();
		for(int i=0;i<a.size();i++)
			System.out.printf("a[%d] = %d\t\t",i,a.get(i));

		a.add(2,300); // add는 기존값을 뒤로 밀고 중간에 삽입
		System.out.println();
		for(int i=0;i<a.size();i++)
			System.out.printf("a[%d] = %d\t\t",i,a.get(i));

	}

}
