/*
	Alan Tan
	7.2.16

	This class represents a player who can play poker
*/

public class PokerPlayer {

	private List<PlayingCard> hand;
	private int cash;

	// Constructs a PokerPlayer with the given cash amount
	// Usually default 500
	// Throws an IllegalArgumentException if cash is negative
	public PokerPlayer(int cash) {
		if (cash < 0)
			throw new IllegalArgumentException();
		this.cash = cash;
		this.hand = new ArrayList<PlayingCard>();
	}

	// Adds the card to the player's hand
	public void addCard(PlayingCard card) {
		this.hand.add(card);
	}

	// Starts a new hand
	public void clearHand() {
		this.hand.clear();
	}
}