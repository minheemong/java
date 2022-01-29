package days12;

public class Array18 {

	public static void main(String[] args) {
		int [][] a=new int[9][];
		
		input(a); // 그림과 같이 배열을 구성하고 값을 대입
		prn(a); // 그림과 같이 출력
	}
	public static void prn(int [][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
		System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
	}
	public static void input(int [][] a) {
		//a=new int[9][];
		/* a[0]=new int[1]; a[1]=new int[2]; a[3]=new int[4]; a[4]=new int[5]; 
		 * int[4]; a[6]=new int[3]; a[7]=new int[2]; a[8]=new int[1];*/
		for(int i=0;i<9;i++) {
			if(i<=9/2) a[i]=new int[i+1];
			else a[i]=new int[9-i];
		}
		int k = 1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = k++;
			}
		}
	}
}
