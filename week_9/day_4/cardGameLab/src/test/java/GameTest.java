import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    Game game;
    Deck deck;

    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before() {

        game = new Game();
        deck = new Deck();

        player1 = new Player("John");
        player2 = new Player("Mary");
        player3 = new Player("Stanley");

    }


    @Test
    public void canAddPlayer() {
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        assertEquals(3,game.getPlayers().size());
    }

    @Test
    public void canAddDeck() {
        game.addDeck(deck);
        assertTrue(game.getDeck() instanceof Deck);
    }


    @Test
    public void canDealToPlayers () {
        deck.generateCards();
        game.addDeck(deck);

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        game.dealToPlayers();

        assertTrue(player1.getCardInHand() instanceof Card);
        assertTrue(player2.getCardInHand() instanceof Card);
        assertTrue(player3.getCardInHand() instanceof Card);
    }


    @Test
    public void canCheckWhoWins() {
        deck.generateCards();
        game.addDeck(deck);

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        game.dealToPlayers();

        System.out.println(game.whoWins().getName());

    }

}
