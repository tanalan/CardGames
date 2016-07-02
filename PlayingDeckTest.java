public class PlayingDeckTest {
	public static void main(String[] args) {
		PlayingDeck myDeck = new PlayingDeck();
		myDeck.shuffle();
		System.out.println(myDeck);
		myDeck.draw();
		System.out.println(myDeck);
		for (int i = 0; i < 5; i++) {
			System.out.println(myDeck.draw());
		}
		System.out.println(myDeck);
	}
}