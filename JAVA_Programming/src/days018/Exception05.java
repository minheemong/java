package days018;

//예외처리와 메서드 호출간의 관계
//예외 처리 가능성이 있는 구문을 포함 메서드는  throws Exception's name 을 표시하여
//본 메서들를 호출할 구문에 예외처리 권한을 일임합니다.
//또는 예외처리 가능성이 있는 구문을 try~catch 로 처리하여 호출구문에 부담을 주지 않고 처리 
//할 수도 있습니다
//아래 예제는 예외처리 메서드에게 예외처리 권한을 넘기고, 최초 호출 구문에 try~catch 로 처리하는 예

public class Exception05 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void method1() throws Exception {
		
		method2();
		//try {
		//	method2();
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}
	}
	
	// 2. 현재 메서드의 명령중에는 에러(예외)가 발생할 가능성이 있는 명령이 포함되어 있습니다
	// 라고 꼬리표( throws Exception)를 붙입니다. 
	// 그러면 이 메서드를 호출하는 지점에 빨간줄(에러)표시가 표시됩니다.
	public static void method2() throws Exception {
		System.out.println("Method2 실행");
		throw new Exception();  // 강제 예외 발생
		
		// 1. 아래와 같이 try~catch 를 직접 쓰면 간단히 해결이 되지만...
		//try{
		//	throw new Exception();  // 강제 예외 발생
		//}catch(Exception e) {
		//	
		//}
	}

}
