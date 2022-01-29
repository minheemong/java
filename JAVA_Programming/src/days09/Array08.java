package days09;

import java.util.Random;

public class Array08 {
	public static void main(String[] args) {
		
		// 현재 프로그램을 이용하여, 로또 번호 5세트가 출력되도록 
		// 코딩해주세요
		 
		int[] a = new int[6];
		Random rd = new Random(); 
		int i, j;
		
		for(int k=1; k<=5; k++) {
			for(i=0; i<a.length; i++) {
				a[i] = rd.nextInt();
				if(a[i]<=0) a[i]=a[i] * -1;
				a[i] =  a[i] % 45 + 1;
				for(j = 0; j<i; j++) 
					if( a[j] == a[i]) break;
				
				if(i != j) i--;
			}
			
			for(i=0; i<a.length; i++) {
				for(j=i+1; j<a.length; j++) {
					if( a[i] > a[j] ) {
						int t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}
			}
			
			for(i=0; i<a.length; i++)	System.out.printf("%d ", a[i]);
			System.out.println();
		}
	}
}
