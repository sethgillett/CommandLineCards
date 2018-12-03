import java.util.Scanner;
import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        // Instantiates a new deck object and a scanner
        Deck d = new Deck();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to War!\n");

        // Special testing condition that allows the tester to bypass input and delays
        boolean testing = false;
        System.out.print("Are you testing this game? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            testing = true;
        }

        // Integers to track points for AI and player
        int myPoints=0, aiPoints=0;

        // Game will play until the deck is empty
        while (!d.isEmpty()) {
            // Prints current point values
            System.out.println("My Points: " + myPoints + "\t" + "AI Points: " + aiPoints);
            System.out.print("Draw a card? (y/n): ");

            // Asks the user if they want to draw a card
            if (testing || sc.next().equalsIgnoreCase("y")) {

                // If testing, y is automatically filled in
                if (testing) {
                    System.out.print("y");
                    System.out.println();
                }

                // Cards for AI and user
                Card myCard, aiCard;
                // Delay to add drama to reveal of user's card
                if (!testing) Thread.sleep(1000);
                myCard = d.draw();
                // Prints user's card
                System.out.println("You drew: " + myCard);
                // Delay to add drama to reveal AI's card
                if (!testing) Thread.sleep(1000);
                aiCard = d.draw();
                // Prints AI's card
                System.out.println("AI drew: " + aiCard);
                // Delay before winner is announced
                if (!testing) Thread.sleep(1000);
                // Announces winner
                if (myCard.compareTo(aiCard) > 0) {
                    System.out.println(myCard + " wins!!\n");
                    myPoints++;
                } else {
                    System.out.println(aiCard + " wins!!\n");
                    aiPoints++;
                }
                // Delay before next match starts
                Thread.sleep(500);
            } else {
                // If the user doesn't want to draw more cards, program exits
                System.out.println("\nOk, exiting the program.\n");
                sc.close();
                return;
            }
        }

        // Game ends once deck is empty
        System.out.println("\nDeck is empty.\n");
        // Prints winner
        if (myPoints > aiPoints) {
            System.out.print("You win!!");
        } else {
            System.out.print("You lose.");
        }
        // Final points tally
        System.out.print("\t\tYour points: " + myPoints + "\tAI Points: " + aiPoints + "\n");

        sc.close();
    }
}