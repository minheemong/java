package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO14 {

	public static void main(String[] args) throws IOException {
		// "C:\Workspace\JAVA\Java_se\temp 폴더안의  "eclipse.exe"  파일을
		// "C:\Workspace\JAVA\Java_se\temp" 폴더로 복사 
		// 이진 형식으로 읽어... 바로 써넣는 방식
				
		//BufferedInputStream     BufferedOutputStream  를 사용
		String CopyPath = "C:\\Workspace\\JAVA\\Java_se\\copy";
		String OriginalPath = "C:\\Workspace\\JAVA\\Java_se\\temp";
		String Filename = "eclipse.exe";
		File originDir = new File(OriginalPath);  // 경로 설정
		File fileOriginal = new File( originDir, Filename);  // 파일 설정
		
		File copyDir = new File(CopyPath);  // 경로 설정
		if( !copyDir.exists() ) copyDir.mkdirs(); // 경로 생성
		File fileCopy = new File( copyDir, Filename);  // 파일 설정
		
		BufferedInputStream  bis 
		= new BufferedInputStream( new FileInputStream(fileOriginal) );
		BufferedOutputStream bos
		= new BufferedOutputStream( new FileOutputStream( fileCopy ) );
		
		//int data;
		//while( ( data = bis.read() ) != -1 ) bos.write( data );
		
		byte [] data = new byte[1024];
		int size;
		while( (size = bis.read(data)) != -1 ) bos.write(data, 0, size);
			
		bis.close();
		bos.close();
	}
}
