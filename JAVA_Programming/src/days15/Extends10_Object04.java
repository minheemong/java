package days15;
class Student {
	private String name;
	private int age;
	public Student(String name, int age) {	
			this.name = name;	this.age = age;
	}
	public String toString() {
		String info = "name = " + this.name + ", ";
		info += "age = " + this.age;
		return info;
	}
	//s1.equals(s2) ->   this <- s1    obj <- s2
	public boolean equals(Object obj) {
		// 부모클래스의 레퍼런스는  자식인스턴스를 가졌을때, 부모가 물려준 멤버는 접근이
		// 가능하지만, 자식이 새로 만든 멤버는 접근이 불가능합니다
		// 따라서  this와 obj 가 비교가 되려면, obj 를 Student 형으로 변환해야합니다
		// Student target = (Student)obj;
		// 또한 전달된 obj 가 현재로선 어떤 인스턴스를 갖고 있는지 모르기때문에, 
		// instanceof  을 이용해서 형변환이 가능한지 보고 변환합니다.
		// 이상한 클래스가 왔으면 그냥 바로 return  (메서드 종료)
		if( !(obj instanceof Student) ) return false;
		Student target = (Student)obj;
		
		boolean flag_name = this.name.equals(target.name);
		boolean flag_age = this.age == target.age;
		boolean result = flag_name && flag_age;
		
		return result;
	}
}
public class Extends10_Object04 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 21);
		Student s2 = new Student("홍길동", 21);
		Student s3 = new Student("홍길서", 22);
		System.out.println("학생 1번의 정보 : " + s1);
		System.out.println("학생 2번의 정보 : " + s2);
		System.out.println("학생 3번의 정보 : " + s3);

		// 레퍼런스 변수들간의 비교
		if( s1 == s2 )	
			System.out.println("s1 변수와 s2 변수는 같습니다.(s1==s2)");
		else	
			System.out.println("s1 변수와 s2 변수는 다릅니다.(s1==s2)");
		// 결과 : s1 변수와 s2 변수는 다릅니다.(s1==s2)
		
		// .equals 메서드를 사용하여 비교(equals 메서드 오버라이드 이전)
		if( s1.equals(s2) )	
			System.out.println("s1 변수와 s2 변수는 같습니다.(s1.equals(s2))");
		else	
			System.out.println("s1 변수와 s2 변수는 다릅니다.(s1.equals(s2))");
		// 결과 : s1 변수와 s2 변수는 다릅니다.(s1.equals(s2))
		// Object 클래스의 equals 메소드는 기본적으로 두 객체의 레퍼런스 값을 비교하는
		// 연산만을 수행합니다
		
		
		// .equals 메서드를 사용하여 비교(equals 메서드 오버라이드 이후)
		if( s1.equals(s2) )	
			System.out.println("s1 변수와 s2 변수는 같습니다.(s1.equals(s2))");
		else	
			System.out.println("s1 변수와 s2 변수는 다릅니다.(s1.equals(s2))");
		
		if( s1.equals(s3) )	
			System.out.println("s1 변수와 s3 변수는 같습니다.(s1.equals(s3))");
		else	
			System.out.println("s1 변수와 s3 변수는 다릅니다.(s1.equals(s3))");
	}

}
