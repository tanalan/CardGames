/*
	Alan Tan
	7.2.16

	This class represents a player who can play poker
*/

public class PokerPlayer {

	private PlayingCard[] hand;
	private int cash;
    private int position; // Shows where to put a new card

	// Constructs a PokerPlayer with the given cash amount
	// Usually default 500
	// Throws an IllegalArgumentException if cash is negative
	public PokerPlayer(int cash) {
		if (cash < 0)
			throw new IllegalArgumentException();
		this.cash = cash;
		this.hand = new PlayingCard[7];
	}

	// Adds the card to the player's hand
	public void addCard(PlayingCard card) {
		this.hand[position % 7] = card;
        this.position++;
	}

	// Starts a new hand
	public void clearHand() {
		this.position = 0;
	}

    // Returns a String representation of the cards
    // that the player has
    public String toString() {
        if (this.position == 0) {
            return "[]";
        } else {
            String result = "[";
            result += this.hand[0];
            for (int i = 1; i < this.position % 7; i++) {
                result += ", " + this.hand[i];
            }   
            return result;
        }
    
    }
}
