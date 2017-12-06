import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;


    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int cardCount() {
        return this.cards.size ( );
    }

    public Card randomize() {
        Collections.shuffle(this.cards);
        return cards.get(0);
    }

    public void fill52Cards() {

        for (SuitType suit : SuitType.values ( )) {
            for (ValueType value : ValueType.values ( )) {
                cards.add (new Card (suit, value));
            }
        }
    }




//
//    public void fill52Cards() {
//        int i =0;
//        for (SuitType suit : SuitType.values ()){
//            for (ValueType value : ValueType.values()){
//                cards.set (i, new Card (suit, value));
//                i++;
//             }
//        }
//    }


//
//    public ArrayList<String> getMultipleAnswers(int number0fAnswers) {
//
//        ArrayList<String> ListToReturn = new ArrayList<> ( );
//        for (int i = 0; i < number0fAnswers; i++) {
//            ListToReturn.add (this.answers.get (i));
//        }
//        return ListToReturn;
//
//    }
}