import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;


    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card> ( );
    }


    public int cardCount() {
        return this.hand.size ( );
    }

    public void addCard(Deck deck){
            this.hand.add(deck.randomize()); }

}
