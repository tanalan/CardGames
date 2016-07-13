/*
	Alan Tan
	7.2.16

	This class represents a player who can play poker
*/
import java.io.*;

public class PokerPlayer {

	private PlayingCard[] hand;
	private int cash;
	private int current;

	// Constructs a PokerPlayer with the given cash amount
	// Usually default 500
	// Throws an IllegalArgumentException if cash is negative
	public PokerPlayer(int cash) {
		if (cash < 0)
			throw new IllegalArgumentException();
		this.cash = cash;
		this.hand = new PlayingCard[7];
		this.current = 0;
	}

	// Adds the card to the player's hand
	public void addCard(PlayingCard card) {
		if(this.current > 7) {
			throw new IllegalArgumentException();
		}else if(this.current == -1) {
			this.current++;
			this.hand[this.current] = card;
		}else {
			hand[this.current] = card;
			this.current++;
		}
	}

	// Starts a new hand
	public void clearHand() {
		this.current = -1;
	}
	
	// Please proof read this
	// Insertion Sort of the hand
	// Sorts the current size of the hand
	public void sortHand() {
		int max = this.hand[0].getRankValue();
		for(int i = 1; i < this.current; i++) {
			int currCardRank = this.hand[i].getRankValue();
			if(currCardRank < max) {
				for(int j = 0; j < i; j++) {
					if(currCardRank >= this.hand[j].getRankValue() && 
							currCardRank <= this.hand[j+1].getRankValue()) {
						insert(i,j);
						break;
					}
				}
			}
		}
	}
	
	// Please proof read this
	// Inserts by shifting the cards right one 
	// position starting at the curr until here
	public void insert(int curr, int here) {
		PlayingCard currCard = this.hand[curr];
		for(int i = curr; i > here; i--) {
			PlayingCard temp = this.hand[i-1];
			this.hand[i] = temp;
		}
		this.hand[here] = currCard;
	}
}