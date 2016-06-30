import java.util.Random;

/* 
	Alan Tan
	6.28.16

	Deck class used for storing 52 PlayingCards
*/

public class PlayingDeck {
	private PlayingCard[] deck;

	// Constructs a PlayingDeck with each of the 52
	// PlayingCards  
	public PlayingDeck() {
		this.deck = new PlayingCard[52];
		int i = 0;
		for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
			for (PlayingCard.Rank rank : PlayingCard.Rank.values()) {
				this.deck[i++] = new PlayingCard(rank, suit);
			}
		}
	}

	// Shuffles the cards in the deck
	public void shuffle() {
		Random r = new Random();
		// Using Fisher-Yates algorithm
		for (int i = this.deck.length - 1; i >= 0; i--) {
			int next = r.nextInt(52);
			swap(i, next);
		}
	}

	// Swaps the elements in the card
	// Element at first becomes at second
	// Element at second is first
	private void swap(int first, int second) {
		PlayingCard temp = this.deck[first];
		this.deck[first] = this.deck[second];
		this.deck[second] = temp;
	}
}