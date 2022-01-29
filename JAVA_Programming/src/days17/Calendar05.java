package days17;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar05 {

	public static void main(String[] args) {
		int year, month; 
        int input=0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("년도 입력 : ");
        year=sc.nextInt();
        System.out.printf("월 입력 : ");
        month=sc.nextInt();
        
        Calendar sDay = Calendar.getInstance();  // 출력할 달력의 시작날짜 (1일)
    	Calendar eDay = Calendar.getInstance();  // 출력할 달력의 끝날자(말일)
    	while(true) {
	    	sDay.set( year, month-1, 1 );
	    	eDay.set(year, month, 1);
	    	eDay.add( Calendar.DATE, -1);
	    // while(true) {
	    	int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
	    	System.out.println("\n" + year + "년  " + month + "월  ");
	    	System.out.println("----------------------------------------------");
	        System.out.println("일\t월\t화\t수\t목\t금\t토");
	        System.out.println("----------------------------------------------");
	        for( int i=1; i<START_WEEK; i++) System.out.printf("\t");
	        for( int i=1; i<= eDay.get(Calendar.DATE) ; i++) {
	        	System.out.printf("%2d\t", i);
	        	if(START_WEEK%7 == 0) System.out.println();
	        	START_WEEK++;
	        }
	        System.out.println("\n----------------------------------------------");
	        System.out.print("\n[이전달(1)] | [다음달(2)] | [종료(3)]");
	        input = sc.nextInt();
	        if(input==3)break;
	        Calendar temp = Calendar.getInstance();
	        // 이전달과 다음달에 대한 계산후 출력이 이어지도록 캘린더 객체로 코딩하세요
	        temp.set( year, month-1, 1);  // 현재 년과 월로 날짜 세팅
	        if(input==1) {
	        	//sDay.add(Calendar.MONTH, -1);  // 시작날짜 이전달 1이로
	        	//eDay.add(Calendar.DATE, 1);  // 말일자 + 1 (다음달 1일)
	        	//eDay.add(Calendar.MONTH, -1); // 이전달로 이동
	        	//eDay.add(Calendar.DATE, -1);  // 그전달 말일로 이동
	        	temp.add(Calendar.MONTH, -1); // 이전달 계산
	        }else {
	        	//sDay.add(Calendar.MONTH, 1);
	        	//eDay.add(Calendar.DATE, 1);
	        	//eDay.add(Calendar.MONTH, 1);
	        	//eDay.add(Calendar.DATE, -1);
	        	temp.add(Calendar.MONTH, 1); // 다음달 계산
	        }
	        //year = sDay.get(Calendar.YEAR);
        	//month = sDay.get(Calendar.MONTH)+1;
	        year = temp.get(Calendar.YEAR);
        	month = temp.get(Calendar.MONTH)+1;
    	}
        System.out.println("프로그램 종료");
	}

}
