package days18;

import java.util.ArrayList;

// 컬렉션 클래스 저장 방식
// 모든 컬렉션 클래스는 기본적으로 Object 타입을 저장/반환할 수 있습니다

// Object타입을 매개변수로 사용하는 모든 컬렉션클래스는 타입에 상관없이 저장할 수 있음
// 하지만, 저장된 데이터를 반환받는 과정에서 런타임에러가 발생될 수 있습니다
// Object -> 자식클래스의 타입 : 강제형변환
public class Collection02 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// 다양한 타입을 저장할 수 있는 컬렉션 클래스의 객체
		a.add(10);
		a.add(1.1);
		a.add("Hello");
		
		Integer i0 = (Integer)a.get(0);
		
		// 컬렉션 내부의 데이터를 추출하는 과정에서 일치하지 않는 타입으로 형변환이 일어나는 경우
		// 런타임 에러가 발생되어 프로그램이 강제 종료
		// Integer i1 = (Integer)a.get(1); //에러
		Double i1 = (Double)a.get(1);
		//String i2 = a.get(2); //에러
		String i2 = (String)a.get(2);
		
		System.out.printf("i0 -> %d\n", i0);
		System.out.printf("i1 -> %.1f\n", i1);
		System.out.printf("i2 -> %s\n", i2);
		
		// 위와 같이 하나의 ArrayList에 여러 자료형태를 섞어서 저장하고 사용할 수 있습니다
		// 다만 자료형을 섞어서 저장하고 사용할 경우 위의 에러 내역과 같이 꺼내고, 형변환할 때 
		// 자료형이 맞지 않아 에러가 발생하거나 형변환을 하지 않아 에러가 발생할 확률이 높아집니다.
		// 그래서 보통은 자료형을 하나로 통일해서 저장하는 형식을 사용하게 되고,
		// 규칙으로 만들어 지정한 자료형이 저장되지 못하도록 사용하기도 합니다
		ArrayList<Integer> list = new ArrayList<Integer>();
		// get()으로 자료를 꺼낼 때 강제형변환이 없어도 됩니다
		
		list.add(100);
		// list.add("String"); //에러 - 다른 자료형을 저장이 안되게
		Integer i = list.get(0); // 자료를 꺼낼 때 강제형병환을 안써도 되게
		
		
	}

}
