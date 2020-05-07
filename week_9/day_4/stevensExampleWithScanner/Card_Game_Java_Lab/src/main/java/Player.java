import java.util.ArrayList;

public class Player {

    private String name;
    private Card heldCard;

    public Player(String name, Card heldCard) {
        this.name = name;
        this.heldCard = heldCard;
    }

    public String getName() {
        return name;
    }

    public Card getHeldCard() {
        return heldCard;
    }

    public int getCardValue(){
        return heldCard.getValueFromEnum();
    }

}
