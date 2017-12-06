import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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


//

//
//public class CountriesPopulations {
//
//    public static void main(String[] args) {
//        HashMap<String, Long> countriesPopulations = new HashMap<> ();
//        countriesPopulations.put("UK", (long) 64100000);
//        countriesPopulations.put("Germany", (long) 80620000);
//        countriesPopulations.put("France", (long) 66030000);
//        countriesPopulations.put("Japan", (long) 127300000);
//
//        System.out.println(countriesPopulations.get("UK"));
//        System.out.println(countriesPopulations.get("France"));
//
//        countriesPopulations.put("Japan", (long) 128300000);
//        System.out.println(countriesPopulations.get("Japan"));
//
//
//        countriesPopulations.containsValue ((long) 128300000);
//        System.out.println("Populations are "+countriesPopulations.values ());
//        System.out.println("Countries are "+countriesPopulations.keySet ());
//
//    }
//}
//methods:
//.put(key, value)
//.get(key)
//.size()
//.clear()
//.containsValue(value)
//.remove(key)
