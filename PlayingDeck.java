import java.util.Random;

/* 
	Alan Tan
	6.28.16

	Deck class used for storing PlayingCards
*/

public class PlayingDeck {
	private PlayingCard[] deck;
	private int position;

	public static final int NUM_OF_CARDS = 52; // Total cards to have
											// Generally should be 52

	// Constructs a PlayingDeck with each NUM_OF_CARDS
	// PlayingCards  
	public PlayingDeck() {
		this.deck = new PlayingCard[NUM_OF_CARDS];
		this.position = 0;
		for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
			for (PlayingCard.Rank rank : PlayingCard.Rank.values()) {
				this.deck[position++] = new PlayingCard(rank, suit);
			}
		}
	}

	// Shuffles the cards in the deck
	public void shuffle() {
		Random r = new Random();
		// Using Fisher-Yates algorithm
		for (int i = this.position - 1; i >= 0; i--) {
			int next = r.nextInt(i + 1);
			swap(i, next);
		}
	}

	// Swaps the elements in the deck
	// Element at first becomes at second
	// Element at second is first
	private void swap(int first, int second) {
		PlayingCard temp = this.deck[first];
		this.deck[first] = this.deck[second];
		this.deck[second] = temp;
	}

	// Returns a String representing how many cards are in the deck
	public String toString() {
		return "Deck has " + this.position + " cards";
	}

	// Draws the card at the top of the deck and returns it
	// Decreasing the overall amount of cards by one
	// Throws an IllegalArgumentException if the deck is empty
	public PlayingCard draw() {
		if (this.position == 0) 
			throw new IllegalArgumentException("Empty deck, can't draw");
		this.position--;
		return this.deck[this.position - 1];
	}

	// Restarts the deck with NUM_OF_CARDS
	// Essentially a "new" deck
	// Deck is shuffled
	public void restart() {
		this.position = this.deck.length;
		this.shuffle();
	}
}