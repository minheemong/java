package days17;

import java.text.MessageFormat;
import java.text.ParseException;

public class Formatter04 {

	public static void main(String[] args) throws ParseException {
		String msg = "Name: {0}     Tel: {1}     Age:{2}     Birthday:{3}";
		Object[] value = {"이자바","02-123-1234", 27, "07-09"};	
		String r = MessageFormat.format(msg, value); //메세지 포맷의 메서드에 의한 배열 병합 작업
		System.out.println(r);

		String tableName = "CUST_INFO";
		msg = "INSERT INTO CUST_INFO VALUES (''{0}'', ''{1}'', {2}, ''{3}'');";
		Object[] value2 = {"이자바","02-123-1234", 27, "07-09"};
		String result = MessageFormat.format(msg, value2);
		System.out.println(result);
		
		
		String[] data = {
			"INSERT INTO CUST_INFO VALUES ('이자바','02-123-1234',27,'07-09');",
			"INSERT INTO CUST_INFO VALUES ('김프로','032-333-1234',33,'10-07');" 
		};
		String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
		MessageFormat mf = new MessageFormat(pattern);
		
		for(int i=0; i<data.length; i++) {
			Object[] objs = mf.parse(data[i]);
			for(int j=0; j<objs.length; j++) {
				System.out.print(objs[j] + ", ");
			}
			System.out.println();
		}
		// {0} {1} {2} {3} 형식이 들어간 패턴에 의해 문자열의 ,로 구분되고
		// {0} {1} {2} {3} 위치에 있는 데이터들이 분리되어 objs 배열에 나눠저장됩니다
		// 분리되는 항목 이외의 글자들 INSERT INTO CUST_INFO VALUES( ~~)
		// 그 텍스트들이 반드시 같아야하는 조건이 있습니다
	}
}
