import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;




public class DeckTest {

    Deck deck;


    @Before
    public void before() {
        deck = new Deck();
    }


    @Test
    public void canGenerateCards() {
        assertEquals(0,deck.getCards().size());
        deck.generateCards();
        assertEquals(52, deck.getCards().size());

    }

    @Test
    public void howEqualsWorks() {

        ArrayList<Card> cards1 = new ArrayList<Card>();
        ArrayList<Card> cards2 = new ArrayList<Card>();

        Card card1 = new Card(SuitType.HEARTS,RankType.ACE);
        Card card2 = new Card(SuitType.CLUBS,RankType.EIGHT);
        Card card3 = new Card(SuitType.DIAMONDS,RankType.EIGHT);

        cards1.add(card1);
        cards1.add(card2);
        cards1.add(card3);

        cards2.add(card2);
        cards2.add(card3);
        cards2.add(card1);

        assertFalse(cards1.equals(cards2));
    }

//    List.equals() method return true if both elements are of same size and both contains same set of elements in exactly same order.

    @Test
    public void canShuffleCards() {
        deck.generateCards();
        ArrayList<Card> beforeShuffle = deck.getCards();
        System.out.println(beforeShuffle);
        deck.shuffleCards();
        ArrayList<Card> afterShuffle = deck.getCards();
        System.out.println(afterShuffle);


        System.out.println(beforeShuffle.equals(afterShuffle));
        boolean result =  beforeShuffle == afterShuffle;
        System.out.println(result);

    }

    @Test
    public void canDealACard() {
        deck.generateCards();
        assertTrue(deck.dealACard() instanceof Card);
    }

}
