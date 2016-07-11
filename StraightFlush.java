public class StraightFlush extends HandRank {
	
	public boolean qualifies(PlayingCard[] hand) {
		return Straight.qualifies(hand) && Flush.qualifies(hand);
	}
}