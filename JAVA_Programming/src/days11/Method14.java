package days11;

public class Method14 {

	public static void main(String[] args) {
		sort( "asc", 78, 25, 56, 32, 45, 78, 98);
		System.out.println();
		sort( "desc", 87, 75, 23, 65, 45, 8, 56, 98, 78, 12);
	}
	// 같은형의 갯수가 정해지지 않은 전달인수와  다른 자료형의 전달인수가 동시에
	// 전달되어야 한다면, 반드시 ... 으로 처리할 데이터들 보다 왼쪽에 전달되게 위치시킵니다
	public static void sort( String op , int ... a) {
		if(op.equals("asc")) {  
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i]>a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}else {
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i]<a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for(int i=0; i<a.length; i++)	System.out.printf("%d ", a[i]);
	}
}
