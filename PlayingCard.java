/* 
	Alan Tan
	6.28.16

	PlayingCard is able to be used for games like
	Poker, Thirteen, etc.
*/

public class PlayingCard {
	public enum Rank {
		ACE("One"), DEUCE("Two"), THREE("Three"), FOUR("Four"), FIVE("Five"),
        SIX("Six"), SEVEN("Seven"), EIGHT("Eight"), NINE("Nine"), TEN("Ten"),
        JACK("Jack"), QUEEN("Queen"), KING("King")
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
	// Red otherwise yeahe
	public PlayingCard(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		if (this.suit == Suit.CLUBS || this.suit == Suit.SPADES) {
			this.color = Color.BLACK;
		} else {
			this.color = Color.RED;
		}
	}

	// Returns the rank of the card
	public Rank getRank() {
		return this.rank;
	}

	// Returns the rank as a String
	public String getRankString() 
	    return this.rank.name();

	// Returns the rank as an int
	// -1 is returned if invalid rank
	public int getRankValue() {
		switch (this.rank) {
		case ACE: return 1;
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

	public String toString() {
		return getRankString() + " of " + getSuitString();
	}

	// Cards are compared by their ranks
	// Returning -1 if this rank is less than
	// 1 if greater than
	// Otherwise 0
	public int compareTo(PlayingCard other) {
		return this.getRankValue() - other.getRankValue();
	}
	
}
