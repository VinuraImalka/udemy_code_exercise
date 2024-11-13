package CardGame.high;

import CardGame.card;

import java.util.List;

public class cardhand {

    private List<card> hand;

    private int playerNo;

    public cardhand(int playerNo, List<card> hand) {
        hand.sort(card.sortRankReversedSuit());
        this.playerNo = playerNo;
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "%d. %-40s". formatted(
                playerNo, hand
        );
    }
}
