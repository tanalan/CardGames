/* 
	Alan Tan
	6.28.16

	Deck class used for storing 52 PlayingCards
*/

public class PlayingDeck {
	private PlayingCard[] deck;

	// Constructs a PlayingDeck with each of the 52
	// PlayingCards
	// If shuffled, the deck is randomly sorted
	// Otherwise, will be sorted in groups of 13 cards
	// From Ace to King
	// First to last group: Clubs, Diamonds, Hearts, Spades  
	public PlayingDeck(boolean shuffled) {
		this.deck = new PlayingCard[52];
		int i = 0;
		for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
			for (PlayingCard.Rank rank : PlayingCard.Rank.values()) {
				this.deck[i] = new PlayingCard(rank, suit, false);
				i++;
			}
		}

		// if (shuffled) use shuffle method
	}
}