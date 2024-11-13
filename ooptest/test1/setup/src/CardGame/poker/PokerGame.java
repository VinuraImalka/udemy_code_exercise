package CardGame.poker;

import CardGame.card;

import java.util.*;
import java.util.function.Consumer;

public class PokerGame {

    private final List<card> deck = card.getStandardDeck();

    private int playerCount;

    private int cardsInHands;

    private List<PokerHand> pokerHands;

    private List<card> remainingCards;

    public PokerGame(int playerCount, int cardsInHands) {
        this.playerCount = playerCount;
        this.cardsInHands = cardsInHands;
        pokerHands = new ArrayList<>(cardsInHands);
    }

    public void startPlay(){
        Collections.shuffle(deck);
        card.printDeck(deck);
        int random = new Random().nextInt(15,35);
        Collections.rotate(deck,random);
        card.printDeck(deck);
        deal();
        System.out.println("-".repeat(30));
        Consumer<PokerHand> checkHand = PokerHand :: evalHand;
        pokerHands.forEach(checkHand.andThen(System.out::println));

        int cardsDealt = playerCount * cardsInHands;
        int cardsRemaining = deck.size() - cardsDealt;

        remainingCards = new ArrayList<>(Collections.nCopies(cardsRemaining,null));
        remainingCards.replaceAll(c -> deck.get(cardsDealt + remainingCards.indexOf(c)));
        card.printDeck(remainingCards,"remaining",2);
    }

    private void deal(){
        card[][] hands = new card[playerCount][cardsInHands];
        for(int index = 0, i=0; i < cardsInHands;i++){
            for(int j = 0; j<playerCount; j++){
                hands[j][i] =  deck.get(index++);
            }
        }
        int playerNo= 1;
        for(card[] hand : hands){
            pokerHands.add(new PokerHand(playerNo++, Arrays.asList(hand)));
        }
    }
}
