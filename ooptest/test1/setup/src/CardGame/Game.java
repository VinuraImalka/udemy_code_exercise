package CardGame;

import CardGame.poker.PokerGame;

public class Game {

    public static void main(String[] args) {
        PokerGame fiveCardDraw = new PokerGame(4,5);
        fiveCardDraw.startPlay();
    }

}
