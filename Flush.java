public class Flush extends HandRank {

	public boolean qualifies(PlayingCard[] hand) {
		Suit first = hand[0].getSuit();
		for (int i = 1; i < hand.length; i++) {
			if (hand[i].getSuit() != first) {
				return false;
			}
		}
		return true;
	}
}