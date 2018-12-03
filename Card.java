public class Card implements Comparable<Card>{
    // Uses ENUMS internally to represent suits and face card values
    public static final int JACK=11, QUEEN=12, KING=13, ACE=14;
    public static final int SPADES=0, HEARTS=1, DIAMONDS=2, CLUBS=3;

    // Private ints for suit and value of the card
    private int val, suit;

    public Card() {
        this.val = JACK;
        this.suit = CLUBS;
    }

    public Card(String valStr, String suitStr) {
        // Uses the class's setters to validate input
        setVal(valStr);
        setSuit(suitStr);
    }

    public String getVal() {
        String valStr;

        // If val is in the range 2 -> 10 it can simply be converted to a string and returned
        if (val >= 2 && val <= 10) {
            valStr = Integer.toString(val);
        }
        // Otherwise we use a switch statement to determine the proper face card string to return
        else {
            switch(val) {
                case JACK:
                    valStr = "Jack";
                    break;
                case QUEEN:
                    valStr = "Queen";
                    break;
                case KING:
                    valStr = "King";
                    break;
                case ACE:
                    valStr = "Ace";
                    break;
                default:
                    valStr = "Error";
            }
        }

        return valStr;
    }

    public String getSuit() {
        String suitStr;

        // We use a switch statement to find the proper suit string to return
        switch(suit) {
            case HEARTS:
                suitStr = "Hearts";
                break;
            case CLUBS:
                suitStr = "Clubs";
                break;
            case SPADES:
                suitStr = "Spades";
                break;
            case DIAMONDS:
                suitStr = "Diamonds";
                break;
            default:
                suitStr = "Error";
        }

        return suitStr;
    }

    public void setVal(String valStr) {
        // Use regex to check if card value is in the 1-10 range
        if (valStr.matches("\\d+")) {
            int val = Integer.parseInt(valStr);
            if (val >= 2 && val <= 10) {
                this.val = val;
            } else {
                System.out.println("Error: " + val + " is not a valid card value.");
            }
        }
        // Otherwise we will manually check what the face value is
        else {
            if (valStr.equalsIgnoreCase("Jack")) {
                this.val = JACK;
            } else if (valStr.equalsIgnoreCase("Queen")) {
                this.val = QUEEN;
            } else if (valStr.equalsIgnoreCase("King")) {
                this.val = KING;
            } else if (valStr.equalsIgnoreCase("Ace")) {
                this.val = ACE;
            } else {
                // Face value is not valid
                System.out.println("Error: " + valStr + " is not a valid card value.");
            }
        }
    }

    public void setSuit(String suitStr) {
        // Sets the corresponding enum for the suit string
        if (suitStr.equalsIgnoreCase("Spades")) {
            this.suit = SPADES;
        } else if (suitStr.equalsIgnoreCase("Hearts")) {
            this.suit = HEARTS;
        } else if (suitStr.equalsIgnoreCase("Clubs")) {
            this.suit = CLUBS;
        } else if (suitStr.equalsIgnoreCase("Diamonds")) {
            this.suit = DIAMONDS;
        } else {
            // Suit is not valid
            System.out.println("Error: " + suitStr + " is not a valid suit.");
        }
    }

    public int compareTo(Card other) {
        // Comparator to find the greater of two cards
        if (this.val != other.val) {
            return this.val - other.val;
        }
        else {
            return this.suit - other.suit;
        }
    }

    public String toString() {
        // Returns the string representation of the card using the class's getters
        return getVal() + " of " + getSuit();
    }
}