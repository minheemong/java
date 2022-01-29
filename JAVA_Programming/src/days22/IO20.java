package days22;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IO20 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 2021_08_13_18_27.dat
		File dir = new File("C:\\Workspace\\JAVA\\Java_se\\temp");
		if( !dir.exists() )dir.mkdirs();	
		File file = new File( dir, "2021_08_13_18_27.dat");
		
		ObjectInputStream ois =new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(file)));
		
		ArrayList<CalculatorResult> list	=	(ArrayList<CalculatorResult>)ois.readObject();
		
		for( int i = 0 ; i < list.size() ; i++ )
			System.out.printf("%d. %s\n", i+1, list.get(i));
		ois.close();
	}
}
