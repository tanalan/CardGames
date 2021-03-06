/*
 * HandRank tells what kind of hand
 * 5 poker cards are
 * It currently works for 5 cards, but it is limited
 * such that it assumes high ranks have been checked
 * 
 * For example, a hand of 5, 5, 5, 5 (different suits) and 4 (hearts)
 * 				can qualify as a Pair although a Four of a Kind
 * 				is better suited and is the actual
 */

public abstract class HandRank {
	public abstract boolean qualifies(PlayingCard[] hand);
}

class HighCard extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		return hand.length != 0;
	}
}

class Pair extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		for (int i = 0; i < hand.length - 1; i++) {
			if (hand[i].getRankValue() == hand[i + 1].getRankValue()) {
				return true;
			}
		}
		return false;
	}
}

class TwoPair extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		int numOfPairs = 0;
		for (int i = 0; i < hand.length - 1; i++) {
			if (hand[i].getRankValue() == hand[i + 1].getRankValue()) {
				numOfPairs++;
			}
		}
		return numOfPairs > 1;
	}
}

class ThreeOfAKind extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		for (int i = 0; i < hand.length - 2; i++) {
			if (hand[i].getRankValue() == hand[i + 1].getRankValue() &&
					hand[i].getRankValue() == hand[i + 2].getRankValue()) {
				return true; 
			}
		}
		return false;
	}
}

class Straight extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		for (int i = 0; i < hand.length - 1; i++) {
			if (hand[i].getRankValue() + 1 != hand[i + 1].getRankValue()) {
				return false;
			}
		}
		return true;
	}
}

class Flush extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		for (int i = 1; i < hand.length; i++) {
			if (hand[i].getSuit() != hand[0].getSuit()) {
				return false;
			}
		}
		return true;
	}
}

class FullHouse extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		if (hand[0].getRank() == hand[1].getRank()) {
			return (hand[2].getRank() == hand[3].getRank()) &&
						hand[2].getRank() == hand[4].getRank();
		} else if (hand[3].getRank() == hand[4].getRank()) {
			return (hand[0].getRank() == hand[1].getRank()) &&
						hand[0].getRank() == hand[2].getRank();
		} else {
			return false;
		}
	}
}

class FourOfAKind extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		boolean firstFour = (hand[0].getRank() == hand[1].getRank()) &&
							(hand[0].getRank() == hand[2].getRank()) &&
							(hand[0].getRank() == hand[3].getRank());
		if (!firstFour) {
			boolean lastFour = (hand[1].getRank() == hand[2].getRank()) &&
							(hand[1].getRank() == hand[3].getRank()) &&
							(hand[1].getRank() == hand[4].getRank());
			return lastFour;
		}
		return true;
	}
}

// Unsure how to utilize Straight and Flush classes
// Static vs non static reference
class StraightFlush extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		return (new Straight()).qualifies(hand) && (new Flush()).qualifies(hand);
	}
}

class RoyalFlush extends HandRank {
	public boolean qualifies(PlayingCard[] hand) {
		if (hand[0].getRankValue() != 1) {
			return false;
		}
		return hand[1].getRankValue() == 10 &&
				hand[2].getRankValue() == 11 &&
				hand[3].getRankValue() == 12 &&
				hand[4].getRankValue() == 13 &&
				(new Flush()).qualifies(hand);
	}
}

