package CardGame.poker;

import CardGame.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerHand {

    private List<card> hand;

    private List<card> keepers;

    private List<card> discard;

    private Rank score = Rank.NONE;

    private int playerNo;

    public PokerHand(int playerNo, List<card> hand) {
        hand.sort(card.sortRankReversedSuit());
        this.playerNo = playerNo;
        this.hand = hand;
        keepers = new ArrayList<>(hand.size());
        discard = new ArrayList<>(hand.size());
    }

    @Override
    public String toString() {
        return "%d. -%16s Rank:%d %-40s %s". formatted(
                playerNo , score ,score.ordinal() , hand ,(!discard.isEmpty()) ? "Discard: " + discard :""
        );
    }

    private void setRank(int faceCount){
        switch (faceCount){
            case 4 -> score = Rank.FOUR_OF_KIND;
            case 3 -> {
                if(score == Rank.NONE) score = Rank.THREE_OF_KIND;
                else score = Rank.FULL_HOUSE;
            }
            case 2 -> {
                if(score == Rank.NONE) score = Rank.ONE_PAIR;
                else if (score == Rank.THREE_OF_KIND) score = Rank.FULL_HOUSE;
                else score = Rank.TWO_PAIR;
            }
        }
    }

    public void evalHand(){
        List<String> faceList = new ArrayList<>(hand.size());
        hand.forEach(card -> faceList.add(card.face()));

        List<String> duplicateFaceCards = new ArrayList<>();
        faceList.forEach(face -> {
            if(!duplicateFaceCards.contains(face) &&
                    Collections.frequency(faceList,face) > 1){
                duplicateFaceCards.add(face);
            }
        });

        for(String duplicate : duplicateFaceCards){
            int start = faceList.indexOf(duplicate);
            int last = faceList.lastIndexOf(duplicate);
            setRank(last- start+1);
            List<card> sub = hand.subList(start,last+1);
            keepers.addAll(sub);
        }
    }
}
