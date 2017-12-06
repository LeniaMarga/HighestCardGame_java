import java.util.ArrayList;

public class Game {

    private Deck deck;
    private Player player1;
    private Player player2;
    private Hand hand;
    private ArrayList<Card> gameCards;
//    private UI ui;

    public Game (Deck deck, Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
        this.gameCards = gameCards;
    }

    public void addCard(Card card){
          this.gameCards.add(card); }

//
     public int gameCardCount(){
      return this.gameCards.size();
    }


//    public void takeCard(Card card){
//        addCard(card);
//    }

//
//


}
