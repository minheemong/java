package days018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exception06 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		Date inDate = null;
		System.out.print("날짜를 예와 같이 입력해주세요.(입력예:2015-12-31)");
		while(true) {
			try {
				String s = sc.nextLine();
				inDate = sdf.parse(s);
				break;
			} catch (ParseException e) {
				System.out.print("형식이 다릅니다. 예와 같이 다시 입력해주세요.(입력예:2015-12-31)");
			}
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf2.format(inDate));
	}

}
