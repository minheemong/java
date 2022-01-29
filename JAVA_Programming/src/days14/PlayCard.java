package days14;
class CardDeck {
	private Card [] cards = new Card[52];
	public CardDeck() {
		int i =0; // cards의 첨자로 사용될 변수
		for(int k=1;k<=4;k++) { // 카드 종류 1~4 반복
			for(int n=1;n<=13;n++) { // 카드 번호 1~13 반복
				cards[i] =new Card(k,n); // 카드 장 수 i는 0~51
				i++;
			}
		}
	}
	public void shuffle() {
		for(int i=0;i<52;i++) {
			int r = (int)(Math.random() * 52);
			Card temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}
	public Card pick(int i) {
		return cards[i];
	}
}
public class PlayCard {

	public static void main(String[] args) {
		CardDeck d = new CardDeck();
		d.shuffle();
		//System.out.println(d.cards[0].toString());
		/*System.out.printf("%s",d.pick(0).toString());
		System.out.printf("%s",d.pick(1));
		System.out.printf("%s",d.pick(2));
		System.out.printf("%s",d.pick(3)); 
		System.out.printf("%s",d.pick(4));*/
		
		Card [] player1 = new Card[5];
		Card [] player2 = new Card[5];
		Card [] player3 = new Card[5];
		Card [] player4 = new Card[5];
		
		// 카드를 1명당 5장씩 분배하고 한 명당 1줄에 보유카드를 출력해서
		// 세줄을 출력해주세요
		int k=0;
		for(int i=0;i<5;i++) {
			player1[i] = d.pick(k++);
			player2[i] = d.pick(k++);
			player3[i] = d.pick(k++);
			player4[i] = d.pick(k++);
		}
		for(int i=0;i<5;i++) System.out.printf("%s", player1[i]);
		System.out.println();
		for(int i=0;i<5;i++) System.out.printf("%s", player2[i]);
		System.out.println();
		for(int i=0;i<5;i++) System.out.printf("%s", player3[i]);
		System.out.println();
		for(int i=0;i<5;i++) System.out.printf("%s", player4[i]);
		System.out.println();
	}

}
