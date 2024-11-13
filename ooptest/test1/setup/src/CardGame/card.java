package CardGame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public record card (Suit suit, String face, int rank){
    public enum Suit{
        CLUB,DIAMOND,HEART,SPADE;

        public char getImage(){
            return (new char[]{9827,9830,9829,9824})[this.ordinal()];
        }
    }

    public static Comparator<card> sortRankReversedSuit(){
        return Comparator.comparing(card::rank).reversed().thenComparing(card :: suit);
    }

    @Override
    public String toString() {
        int index = face.equals("10") ? 2:1;
        String faceString = face.substring(0,index);
        return "%s%c(%d)".formatted(faceString,suit.getImage(),rank);
    }

    public static card getNumericCard(Suit suit , int cardNumber){
        if(cardNumber > 1 && cardNumber < 11){
            return new card(suit,String.valueOf(cardNumber),cardNumber-2);
        }
        System.out.println("invalid numeric");
        return null;
    }

    public static card getFaceCard(Suit suit , char letter){
        int charIndex = "JQKA".indexOf(letter);
        if(charIndex > -1){
            return new card(suit,String.valueOf(letter),charIndex+9);
        }
        System.out.println("invalid letter");
        return null;
    }

    public static List<card> getStandardDeck(){
        List<card> deck = new ArrayList<>(52);
        for(Suit suit : Suit.values()){
            for(int i = 2;i<= 10;i++) {
                deck.add(getNumericCard(suit, i));
            }
            for(char c : new char[]{'J','Q','K','A'}) {
                deck.add(getFaceCard (suit, c));
            }
        }
        return deck;
    }

    public static void printDeck(List<card> deck){
        printDeck(deck,"Current Deck",4);
    }


    public static void printDeck(List<card> deck,String description,int rows){
        System.out.println("-".repeat(20));
        if(description != null){
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;
        for(int i = 0;i<rows; i++){
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex,endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }

}
