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
	private final boolean highAce;

	// Constructs a PlayingCard of the given rank and suit
	// Color of the card is black if suit is clubs or diamonds
	// Red otherwise
	// Aces will have a value of 14 if highAce
	// otherwise Aces will have 1
	public PlayingCard(Rank rank, Suit suit, boolean highAce) {
		this.rank = rank;
		this.suit = suit;
		if (this.suit == Suit.CLUBS || this.suit == Suit.SPADES) {
			this.color = Color.BLACK;
		} else {
			this.color = Color.RED;
		}
		this.highAce = highAce;
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

	// Returns the rank as an int
	// -1 is returned if invalid rank
	public int getRankValue() {
		switch (this.rank) {
		case ACE: if (highAce) return 14;
								return 1;
		case DEUCE: return 2;
		case THREE: return 3;
		case FOUR: return 4;
		case FIVE: return 5;
		case SIX: return 6;
		case SEVEN: return 7;
		case EIGHT: return 8;
		case NINE: return 9;
		case TEN: return 10;
		case JACK: return 11;
		case QUEEN: return 12;
		case KING: return 13;
		default: return -1;
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

	// Cards are compared by their ranks
	// Returning -1 if this rank is less than
	// 1 if greater than
	// Otherwise 0
	public int compareTo(PlayingCard other) {
		return this.getRankValue() - other.getRankValue();
	}
	
}
