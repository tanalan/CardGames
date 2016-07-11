public class TwoPair extends HandRank {

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