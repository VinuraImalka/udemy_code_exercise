package CardGame;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<card> deck = card.getStandardDeck();
        card.printDeck(deck);
    }
}