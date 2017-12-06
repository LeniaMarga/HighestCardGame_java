import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    ArrayList<Card> cards;
    Card card;


    @Before  //did it with four cards for now. should have a for loop to select enums form card class
    public void before(){
        card = new Card (SuitType.DIAMONDS, ValueType.ACE);
        cards = new ArrayList<Card>();
        deck = new Deck(cards);
    }

    @Test
    public void cardsSetUpCorrectly(){
        cards.add(card);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void testHas52Cards() {
        deck.fill52Cards ();
        assertEquals (52, deck.cardCount ());
    }

    @Test
    public void giveCard() {
      deck.fill52Cards ();
      Card selectedCard = deck.randomize ();
      assertEquals (selectedCard, deck.randomize ());
    }




}


