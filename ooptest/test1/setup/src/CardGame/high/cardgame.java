package CardGame.high;

import CardGame.card;
import CardGame.poker.PokerHand;

import java.util.*;

public class cardgame {

    private final List<card> deck = card.getStandardDeck();

    private int playerCount;

    private ArrayList<cardhand> cardHands;

    public cardgame(int playerCount) {
        this.playerCount = playerCount;
        cardHands = new ArrayList<>(52/playerCount);
    }

    public void startPlay(){
        Collections.shuffle(deck);
        card.printDeck(deck);
        int random = new Random().nextInt(15,35);
        Collections.rotate(deck,random);
        card.printDeck(deck);
        deal();
    }

    private void deal(){
        card[][] hands = new card[playerCount][52/playerCount];
        for(int index = 0, i=0; i < (52/playerCount);i++){
            for(int j = 0; j<playerCount; j++){
                hands[j][i] =  deck.get(index++);
            }
        }
        int playerNo= 1;
        for(card[] hand : hands){
            cardHands.add(new cardhand(playerNo++, Arrays.asList(hand)));
        }
    }
}
