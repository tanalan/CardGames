/* 
	Alan Tan
	6.28.16

	PlayingCard is able to be used for games like
	Poker, Thirteen, etc.
*/

public class PlayingCard {
	public enum Rank {
		ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN,
		EIGHT, NINE, TEN, JACK, QUEEN, KING
	}
	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}
	public enum Color {
		BLACK, RED
	}

	private final Rank rank;
	private final Suit suit;
	private final Color color;

	// Constructs a PlayingCard of the given rank and suit
	// Color of the card is black if suit is clubs or diamonds
	// Red otherwise
	public PlayingCard(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		if (this.suit == Rank.CLUBS || this.suit == Rank.SPADES) {
			this.color = Color.BLACK;
		} else {
			this.color = Color.Red;
		}
	}

	// Returns the rank of the card
	public Rank getRank() {
		return this.rank;
	}

	// Returns the rank as a String
	public String getRankString() {
		switch (this.rank) {
		case ACE: return "Ace";
		case DEUCE: return "Deuce";
		case THREE: return "Three";
		case FOUR: return "Four";
		case FIVE: return "Five";
		case SIX: return "Six";
		case SEVEN: return "Seven";
		case EIGHT: return "Eight";
		case NINE: return "Nine";
		case TEN: return "Ten";
		case JACK: return "Jack";
		case QUEEN: return "Queen";
		case KING: return "King";
		default: return "Invalid Rank";
		}
	}

	// Returns the suit of the card
	public Suit getSuit() {
		return this.suit;
	}

	// Returns the suit as a String
	public String getSuitString() {
		switch (this.suit) {
		case CLUBS: return "Clubs";
		case DIAMONDS: return "Diamonds";
		case HEARTS: return "Hearts";
		case SPADES: return "Spades";
		default: return "Invalid Suit";
		}
	}

	
}
