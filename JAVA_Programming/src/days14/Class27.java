package days14;
// 객체 배열
class Student{
	int bun;
	String name;
	int [] score;
	static int count = 0;
	Student() { }
	Student(int a, int b, int c) {
		score = new int [3];
		bun = ++count;
		name = "std-" + bun;
		score[0] = a; score[1] = b; score[2] = c;
	}
}
public class Class27 {

	public static void main(String[] args) {
		Student [] std = new Student[5];
		// 객체를 만든 것이 아니라 배열을 만든 명령 // String [] a = new String[5];
		// new Student() X         new Student[5] O
		// 다섯 개의 참조(레퍼런스)변수가 배열로 만들어짐
		Student std1 = new Student();
		// 객체를 만드는 명령 Student std = new Student();
		std[0] = new Student(98,78,98);
		// 각 배열의 요소(레퍼런스 변수)에 new Student()로 확보된 메모리 주소를 전달 받음
		// 객체 std[0] 생성
		std[1] = new Student(78,78,56);
		std[2] = new Student(65,98,34);
		std[3] = new Student(89,65,54);
		std[4] = new Student(76,45,56);
	}

}
