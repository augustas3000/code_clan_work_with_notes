public class Player {

    private String name;
    private Card cardInHand;

    public Player(String name) {
        this.name = name;
        this.cardInHand = null;
    }


    public void takeCard(Card dealtCard) {
        this.cardInHand = dealtCard;
    }


    public Card getCardInHand() {
        return cardInHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardInHand(Card cardInHand) {
        this.cardInHand = cardInHand;
    }
}
