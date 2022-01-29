package days18;

import java.util.ArrayList;

public class Collection09 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10); list.add(20); list.add(30); 
		
		int target_index = list.indexOf(20);
		System.out.printf("20의 위치 : %d\n", target_index);
		
		//검색할 값이 존재하지 않는 경우 -1이 반환
		target_index = list.indexOf(50);
		System.out.printf("50의 위치 : %d\n", target_index);
		
		System.out.printf("20의 저장유무 : %b\n", list.contains(20));
		System.out.printf("50의 저장유무 : %b\n", list.contains(50));
	}

}
