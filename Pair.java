public class Pair extends HandRank {

	public boolean qualifies(PlayingCard[] hand) {
		for (int i = 0; i < hand.length - 1; i++) {
			if (hand[i].getRankValue() == hand[i + 1].getRankValue()) {
				return true;
			}
		}
		return false;
	}
}