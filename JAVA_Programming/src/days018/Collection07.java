package days018;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

//Hashtable, HashMap 클래스
//데이터베이스 내부의 키 값을 검색하기 위해서 만들어진 알고리즘을 기반으로 작성된 클래스
//- 검색을 위해서 사용되는 클래스
//- Key, Value를 저장할 수 있는 클래스
//- Key 는 중복을 허용하지 않습니다
//- Value 는 중복을 허용합니다.
//저장 예
//HashMap hm = new HashMap(); 
//hm.put(1, "One");	hm.put(2, "Two");	hm.put(3, "Three");


public class Collection07 {

	public static void main(String[] args) {
		// Key 값은 문자열, Value 값은 정수로 입력받는 Hashtable 객체 생성
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

		// Key 값은 정수, Value 값은 문자열로 입력받는 HashMap 객체 생성
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// 사용예의 확장1
		// HashMap<Integer, ArrayList<String>> kk = new HashMap<>();
		
		// Hashtable, HashMap 클래스는 put 메소드를 사용하여 데이터를 추가
		ht.put("One", 1);	    ht.put("Two", 2);	    ht.put("Three", 3);
		hm.put(1, "One");		hm.put(2, "Two");		hm.put(3, "Three");

		// Hashtable, HashMap 클래스는 get 메소드에  Key 값을 전달하여 Value를 반환
		System.out.printf("\"One\" = %d\n", ht.get("One"));
		System.out.printf("1 = %s\n", hm.get(1));
		
		// Hashtable, HashMap 클래스 내부의 데이터를 반복문을 통해서 접근하는 예
		// 1. Enumeration 타입을 사용하는 방법
		// Enumeration 은 열거형 자료형식(인터페이스)입니다
		Enumeration<String> e1 = ht.keys();
		while(e1.hasMoreElements()) {
			// 키 값을 추출
			String key = e1.nextElement();  // 키값을 얻어내고
			int value = ht.get(key);   // 키값으로 검색한 밸류값을 얻어냅니다
			System.out.printf("key(%s)=Value(%d)   ", key, value);
		}
		System.out.println();
		// 2. for 문을 활용하여 Key 값을 순회하는 방법
		for( Integer k : hm.keySet() ) {   //hm.keySet() : 키값들만 모아서 리스트로 생성
			String v = hm.get(k);
			System.out.printf("key(%d)=Value (%s)   ", k, v);
		}
	}

}
