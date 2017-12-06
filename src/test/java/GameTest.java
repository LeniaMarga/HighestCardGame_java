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
    Hand hand;
//    Card card;

    @Before
    public void before(){
//        card = new Card (SuitType.DIAMONDS, ValueType.ACE);
        deck = new Deck(cards);
        Player player1 = new Player("Eleni");
        Player player2 = new Player("George");
        game = new Game(deck, player1, player2);
        gameCards = new ArrayList<Card>();
        deck.randomize ();
    }


//    @Test
//    public void playerPickCard(){
//       Card card1 = game.addCard(deck.randomize ());
//
//
//       assertEquals (2, game.gameCardCount());
//    }





//
//    @Test
//    public void canAddBook(){
//        library.addBook(book);
//        assertEquals (1, library.bookCount());
//
//    }
//
//    @Test
//    public void canRemoveBook(){
//        library.addBook(book);
//        library.removeBook();
//        assertEquals (0, library.bookCount());
//
//    }
//
//    @Test
//    public void canCollectBook(){
//        publisher.addBook(book);
//        library.collectBook(publisher);
//        assertEquals (1, library.bookCount());
//    }


}


