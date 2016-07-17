import java.util.Arrays;

/*
    Alan Tan
    7.2.16

    This class will simulate a Poker game
*/

public class PlayPoker {
    public static void main(String[] args) throws Exception {
        PlayingDeck deck = new PlayingDeck();
        //deck.shuffle();
        PokerPlayer Alan = new PokerPlayer(500);
        Alan.addCard(deck.draw());
        Alan.addCard(deck.draw());
        System.out.println("Alan's cards are " + Alan);
        System.out.println("Cards up to river: ");
        System.out.println(deck.draw() + ", " + deck.draw() +
                            ", " + deck.draw() + ", " + deck.draw() + ", " + 
                            deck.draw());
        Alan.addCard(deck.draw());
        Alan.addCard(deck.draw());
        Alan.addCard(deck.draw());
        PlayingCard[] myDeck = new PlayingCard[5];
        for (int i = 0; i < 5; i++) {
            myDeck[i] = Alan.hand.get(i);
        }
        //System.out.println(Arrays.toString(myDeck));
        System.out.println("Alan's best hand: " + HandEvaluator.evaluate(myDeck));
        
    }
}

