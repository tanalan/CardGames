public class FullHouse extends HandRank {

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