import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;
    Deck deck;
    ArrayList<Card> cards;

    @Before
    public void before(){
        player = new Player("Eleni");
        card = new Card (SuitType.DIAMONDS, ValueType.ACE);
        cards = new ArrayList<Card>();
        deck = new Deck(cards);
    }

    @Test
    public void canPickCard(){
        player.addCard(deck);
        assertEquals (1, player.cardCount());
    }





}
