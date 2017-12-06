import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    ArrayList<Card> cards;
    ArrayList<Card> gameCards;
    Player player;
    Card card;

    @Before
    public void before(){
        Card card1 = new Card (SuitType.DIAMONDS, ValueType.ACE);
        Card card2 = new Card (SuitType.HEARTS, ValueType.ACE);
        cards = new ArrayList<Card>();
        deck = new Deck(cards);
        Player player1 = new Player("Eleni");
        Player player2 = new Player("George");
        game = new Game(deck, player1, player2);
        gameCards = new ArrayList<Card>();
        deck.randomize ();
    }


    @Test
    public void playerPickCard(){
       Card card1 = game.addCard(deck.randomize());
       Card card2 = game.addCard(deck.randomize ());
       assertEquals (2, game.gameCardCount());
    }




}


