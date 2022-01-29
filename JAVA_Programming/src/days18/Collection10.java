package days18;

import java.util.ArrayList;

class Point{
	private int x;
	private int y;
	public Point(int x, int y) { this.x=x; this.y=y;}
	public String toString() { return "x:"+x+",y:"+y;}
	public boolean equals(Object obj) { //시험출제
		if(! (obj instanceof Point)) return false;
		Point target = (Point) obj;
		boolean flag = (this.x == target.x) && (this.y == target.y);
		return flag;
	}
	
}
public class Collection10 {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point>();
		Point p1 = new Point(10,10);
		list.add(p1);
		list.add( new Point(20,20) );
		list.add( new Point(30,30) );
		for( Point p : list) System.out.println(p.toString() );
		
		int index = list.indexOf(new Point (30,30));
		System.out.printf("(30,30)의 위치 : %d\n",index);
		boolean con = list.contains(new Point(30,30));
		System.out.printf("(30,30)의 저장유무 : %b\n",con);
		
		// 사용자 정의 클래스에 equals 메소드가 오버라이딩되지 않은 경우
		// 컬렉션 내부에서 동일한 형태의 객체를 검색 및 비교할 수 없습니다.
		
	}

}
