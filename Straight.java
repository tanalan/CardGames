public class Straight extends HandRank {
	
	public boolean qualifies(PlayingCard[] hand) {
		for (int i = 0; i < hand.length - 1; i++) {
			if (hand[i].getRankValue() + 1 != hand[i + 1].getRankValue()) {
				return false;
			}
		}
		return true;
	}
}