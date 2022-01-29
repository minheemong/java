package days018;

import java.io.File;
import java.io.IOException;

public class Exception07 {

	public static void main(String[] args) {
		File f1 = createFile("");
		File f2 = createFile("abc.txt");
	}

	private static File createFile(String fileName) {
		try {
			if( fileName==null || fileName.equals("") )
				throw new Exception("파일이름이 유효하지 않습니다");
		} catch(Exception e) {
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 설정
			fileName = "제목없음.txt"; 
		} finally { // 예외처리가 생겼든 안생겼든 반드시 실행하고 지나갈 영역 : finally
			File f = new File(fileName);
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("파일 생성에 실패했습니다");
			}
			return f;
		}
	}

}
