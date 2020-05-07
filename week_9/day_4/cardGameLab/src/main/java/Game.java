import java.util.ArrayList;

public class Game {

    ArrayList<Player> players;
    Deck deck;

    public Game() {
        this.players = new ArrayList<Player>();
        this.deck = null;
    }


//    Add deck

    public void addDeck(Deck deck) {
        this.deck = deck;
    }


//    Add a player

    public void addPlayer(Player player) {
        this.players.add(player);
    }

//    Deal to players
    public void dealToPlayers() {
        if (this.players.size() > 2) {

            this.deck.shuffleCards();

            for (int playerIndex = 0; playerIndex < this.players.size(); playerIndex++) {
                Card cardDealtFromDeck;
                cardDealtFromDeck = this.deck.dealACard();
                this.players.get(playerIndex).takeCard(cardDealtFromDeck);
            }
        }
    }


//    Check results

    public Player whoWins() {

        Player currentHighest = null;

        for (int playerIndex = 0; playerIndex < this.players.size(); playerIndex++) {
            if (playerIndex == 0) {
                currentHighest = this.players.get(playerIndex);
            } else if (this.players.get(playerIndex).getCardInHand().getValueFromEnum() > currentHighest.getCardInHand().getValueFromEnum()) {
                currentHighest = this.players.get(playerIndex);
            }
        }
        return currentHighest;
    }



//    GETTERS
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }

//    SETTERS

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}
