public class Card {

    //    declare suit var as enum type SuitType
    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }


    //    GETTERS
    public SuitType getSuit() {
        return suit;
    }

    public RankType getRank() {
        return rank;
    }

    //    SETTERS

    public void setSuit(SuitType suit) {
        this.suit = suit;
    }

    public void setRank(RankType rank) {
        this.rank = rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }



}