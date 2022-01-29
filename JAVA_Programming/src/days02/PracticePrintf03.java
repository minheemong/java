package days02;

public class PracticePrintf03 {
	public static void main(String [] args) {
		System.out.printf("%30s\n","###성적표###");
		System.out.printf("----------------------------------------------------\n");
		System.out.printf("%-2s\t%6s\t%4s\t%4s\t%4s\t%4s\t%7s\n"," 번호","성명","국어","영어","수학","총점","평균");
		System.out.printf("----------------------------------------------------\n");
		System.out.printf("%-2d\t%6s\t%4d\t%4d\t%4d\t%4s\t%7.2f\n",1,"홍길동",89,87,69,89+87+69,(89+87+69)/3.0);
		System.out.printf("%-2d\t%6s\t%4d\t%4d\t%4d\t%4s\t%7.2f\n",2,"HongGli",100,100,100,100+100+100,(100+100+100)/3.0);
		System.out.printf("----------------------------------------------------\n");
		}

}
