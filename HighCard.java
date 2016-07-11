public class HighCard extends HandRank {
	
	public boolean qualifies(PlayingCard[] hand) {
		return hand.length != 0;	
	}
}