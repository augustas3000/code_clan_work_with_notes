import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Player> playerList = new ArrayList<Player>();
        Deck deck = new Deck();
        deck.getDeck();
        deck.shuffleDeck();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of players:");
        int numPlayers = in.nextInt();

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Please enter the player name:");
            Scanner player = new Scanner(System.in);
            String name = player.nextLine();
            Player newplayer = new Player(name, deck.dealCard());
            playerList.add(newplayer);
        }
        Player highestPlayer = playerList.get(0);
        for (Player player : playerList) {
            if (player.getCardValue() > highestPlayer.getCardValue()){
                highestPlayer = player;
            }
        }
        playerList.remove(highestPlayer);
        System.out.println("The winner is " + highestPlayer.getName() + " with card " + highestPlayer.getHeldCard().getRank().toString() + " of " + highestPlayer.getHeldCard().getSuit().toString());
        System.out.println("All other players had the following cards:");

        for (Player player : playerList) {
            System.out.println(player.getName() + " Had card " + player.getHeldCard().getRank().toString() + " of " + player.getHeldCard().getSuit().toString());

        }
    }
}
