public class Triple extends HandRank {

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