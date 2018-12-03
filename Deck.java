import java.util.ArrayList;

public class Deck {
    // ArrayList holding all the cards in the deck
    public ArrayList<Card> cards;

    Deck() {
        // All possible values and suits for cards
        String[] vals = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};

        // Instantiates deck array
        cards = new ArrayList<Card>();

        // Generates cards using nested loops and all possible card values and suits
        for (String val : vals) {
            for (String suit : suits) {
                cards.add(new Card(val, suit));
            }
        }
    }

    public Card draw() {
        // Returns and removes a random card from the deck
        int i = (int) (Math.random() * cards.size());
        return cards.remove(i);
    }

    public boolean isEmpty() {
        // Returns whether or not the deck is empty
        return cards.isEmpty();
    }
}