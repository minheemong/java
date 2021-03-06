public class Printf031 {

	public static void main(String[] args) {
		// JavaFourth.java 에 출력했던 성적표를 정확한 총점과 평균을 계산하여
		// 출력하세요.
		// 평균을 출력할 때 소수점은 한 자리만 출력하세요
		// '\t'를 두번 쓰는 곳이 없도록 자리수를 조절하세요
		// 각 항목은 모두 오른쪽 정렬되어 출력해주세요
		// (같은과목의 점수가 89점과 100점이어도 1번학생과 2번학생의 소수점이
		// 맞춰지게 출력
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("--------------------------------------------------\n");
		System.out.printf("%3s\t%10s\t%3s\t%3s\t%3s\t%3s\t%5s\n", "번호","성명","국어","영어","수학","총점","평균");
		System.out.printf("--------------------------------------------------\n");
		System.out.printf("%3d\t%10s\t%3d\t%3d\t%3d\t%3d\t%6.1f\n"
				, 1,"홍길동",89,87,69,89+87+69,(89+87+69)/3.0);
		System.out.printf("%3d\t%10s\t%3d\t%3d\t%3d\t%3d\t%6.1f\n"
				, 1,"HongGil",89,87,69,89+87+69,(89+87+69)/3.0);
	}

}
