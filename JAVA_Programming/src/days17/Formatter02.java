package days17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatter02 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy년 MM월 dd일");
		
		//String s1 = "2020-11-24";
		String s2 = "2020/11/24";
		
		// SimpleDateFormat에는  parse메서드를 이용하여 문자열을 날짜로 변환해주는 기능이 있습니다
		// 다만 변환을 위해서는 설정된 서식을 반드시 지켜야하는 제약이 있습니다
		
		Date d = sdf1.parse(s2);
		System.out.println(sdf2.format(d));

	}

}
