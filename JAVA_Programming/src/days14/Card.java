package days14;

public class Card {
	final static int spade = 4;
	final static int diamond = 3;
	final static int heart = 2;
	final static int clover = 1;
	// final : 변수의 값을 접근 가능, 변경 불가능하도록 하는 키워드
	
	private int kind;
	private int number;
	
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public Card() {
		//this.kind = spade;
		//this.number = 1;
		this(spade, 1);
	}
	
	public String toString() {
		// kind : 4, number : 13 이라면 문자열 "[Spade:K]" 리턴
		String[] kinds = {"", "Clover", "Heart", "Diamond", "Spade"};
		String[] numbers = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String result = "[" + kinds[this.kind] + ":" + numbers[this.number] + "]";
		return result;
	}
	// toString() 메소드가 있는 클래스 객체를 System.out.println()으로 출력하면
	// 클래스이름@해시코드가 아닌 toString()에서 리턴해주는 내용이 출력된다.
	// Card c = new Card(4, 13);
	// System.out.println(c); -> 출력 [Spade:K]
	// System.out.println( c.toSthing() ); 과 같은 출력
}
