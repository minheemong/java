package days13;

class Student{
	private int bunho;
	private String name;
	private int [] scores; // 성적을 저장하기 위한 배열 변수
	private String [] subjects;
	private int tot; // 총점을 저장하기 위한 변수
	private double avg; // 평균을 저장하기 위한 변수
	private char grade; // 학점을 저장하기 위한 변수
	
	Student(){
		subjects = new String[3];
		subjects[0] = "국어"; subjects[1] = "영어"; subjects[2] = "수학";
		scores = new int[subjects.length];
	}
	Student(String name) {
		this();
		this.name = name;
	}
	Student(String name, int score1, int score2, int score3){
		this(name);
		scores[0] = score1; 	
		scores[1] = score2; 	
		scores[2] = score3;
	}
	public void copy1(Student b) {  // std1.copy1(std3);
		// this <- std1     b <- std3
		this.bunho = b.bunho;
		this.name = b.name;
		for(int i=0; i<subjects.length; i++) this.scores[i] = b.scores[i];
	}
	public Student copy2() {  //Student std4 = std3.copy2();
		// this <- std3
		Student t = new Student();
		t.bunho = this.bunho;
		t.name = this.name;
		for(int i=0; i<subjects.length; i++) t.scores[i] = this.scores[i];
		return t;  //  std4 <-  t
	}
}

public class Class16 {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("홍길동");
		Student std3 = new Student("홍길남", 100, 100, 100);
		std1.copy1(std3);
		Student std4 = std3.copy2();	
	}
}
