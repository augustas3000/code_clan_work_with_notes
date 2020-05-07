
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;


    public Deck() {
        this.cards = new ArrayList<Card>();
    }

//    Generate cards

    public void generateCards() {
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();

        for (int suitsIndex = 0; suitsIndex < suits.length; suitsIndex++) {
            for (int ranksIndex = 0; ranksIndex < ranks.length; ranksIndex++ ) {
                SuitType currentSuite = suits[suitsIndex];
                RankType currentRank = ranks[ranksIndex];
                Card generatedCard = new Card(currentSuite, currentRank);
                this.cards.add(generatedCard);
            }
        }
    }

//    Shuffle deck

    public void shuffleCards() {
        Collections.shuffle(this.cards);
    }

//    Deal a card

    public Card dealACard() {
        return this.cards.remove(0);
    }


//    GETTERS

    public ArrayList<Card> getCards() {
        return cards;
    }


//    SETTERS


    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

}


//populating cards array:
//for every suit, loop through all ranks and create a card, for each rank;

