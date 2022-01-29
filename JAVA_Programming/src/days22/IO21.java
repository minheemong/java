package days22;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class IO21 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//특정 날짜를 입력 받아서 그날짜 파일만 출력하세요
		// 날짜 입력 양식을 정해서 잘못된 입력은 다시 입력 받게 설정해주세요
		System.out.print("출력할 날짜를 입력하세요.(2020-01-01)");
		String inputDate;
		SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd");
		BufferedReader in 
		= new BufferedReader(	new InputStreamReader(System.in));
		Date iDate;
		while(true) {
			try {
				inputDate = in.readLine();
				iDate = sdf1.parse(inputDate);
				break;
			} catch (ParseException e) {
				System.out.print("잘못 입력했어요. 2020-01-01 형식으로 입력하세요");
			}  
		}
		// 읽어올 파일 경로 설정
		File dir = new File("C:\\Workspace\\JAVA\\Java_se\\temp");
		// 폴더에서 모든 파일 목록 불러옴
		String [] f = dir.list();
		//for( String fn : f) System.out.println(fn);
		// 파일 명들을 이용한 반복실행문을 실행하여  입력한 파일만 대상으로 내용을 읽은 후 화면 출력
		for( int i=0; i<f.length; i++) {
			//2021-08-13 으로 된 날짜를 2021_08_13(날짜) -> 2021_08_13(String) 으로 변경하고, 
			// 파일이름에서 substring으로 추출한 앞 10글자를 비교해서 같은것만 출력합니다.
			// 파일이름에서 substring으로 10글자를 추출하는데, 파일이름 길이자체가 10글자가 넘지않으면,
			// 에러가 발생합니다.  8글자중  10글자를  substring 으로 추출 -> 에러
			// f[i] : 현재 i 번째 파일 이름
			if( f[i].length() > 10) {
				String s1 = f[i].substring(0, 10);// 현재 반복 실행 중인 파일이름의 날짜에 해당하는 앞 10글자를 추출
				SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy_MM_dd");
				String s2 = String.valueOf( sdf2.format(iDate) );
				//System.out.println("s1:" + s1);
				//System.out.println("s2:" + s2);
				if(s1.equals(s2)) {
					File file = new File(dir, f[i]);
					ObjectInputStream ois = new ObjectInputStream(
							new BufferedInputStream(new FileInputStream(file)));
					ArrayList<CalculatorResult> list 
					= 	(ArrayList<CalculatorResult>) ois.readObject();
					for( int j = 0 ; j < list.size() ; j++ ) 
						System.out.printf("%d. %s\n", j+1, list.get(j));
					ois.close();	
				}
			}
		}
	}
}
