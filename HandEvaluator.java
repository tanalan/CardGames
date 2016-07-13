/*
	Alan Tan
	7.5.16

	This class evaluates a 5 card poker hand
*/

import java.util.*;

public class HandEvaluator {
	
	// Evaluates the given hand and returns the String representing
	// the best hand
	// Null is returned if the inputHand is invalid 
	// (not sorted and/or not 5 unique cards)
	public static String evaluate(PlayingCard[] inputHand) {
		List<HandRank> allHandTypes = new ArrayList<HandRank>();
		allHandTypes.add(new RoyalFlush());
		allHandTypes.add(new StraightFlush());
		allHandTypes.add(new FullHouse());
		allHandTypes.add(new Flush());
		allHandTypes.add(new Straight());
		allHandTypes.add(new ThreeOfAKind());
		allHandTypes.add(new TwoPair());
		allHandTypes.add(new Pair());
		allHandTypes.add(new HighCard());
		for (int i = 0; i < allHandTypes.size(); i++) {
			HandRank current = allHandTypes.get(i);
			if (current.qualifies(inputHand)) {
				return "" + current;
			}
		}
		return null;
		
	}
}