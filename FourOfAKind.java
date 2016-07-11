public class FourOfAKind extends HandRank {
	
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