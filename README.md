# Homework3
Write two classes that will handle the definition of a deck of cards. For this program you will need to
provide a Deck class, a Card class, and a tester class (which we will use to play a simple game). The
definitions of these classes are below:
Card:
Default constructor: Create an Ace of Clubs
Parameterized constructor: Create a given card value of a given suit (given via parameters)
Getter/Setter for value and suit, note that you must use the setters to sanitize inputs, and the getters
to present the output in a proper manner*
Deck:
Default constructor: Create an ArrayList of the typical fifty-two cards in a deck (Ace-Kings of
Clubs/Spades/Diamonds/Hearts)
Function to draw a card, this function should pick a card at random from the ArrayList, remove it from
the ArrayList, and return it
Using these objects, we will play a game of War in our tester against the computer. In a loop, draw two
cards at a time, with one being for the player and one being for the computer. You must compare the
two cards to each other, and whichever card is the largest is the winner of that round. The winner
gains one point, and at the end of the game (when no more cards are in the deck) report the winner
to chat and end the program. In the event of a tie, compare the suits to determine a winner (from
highest value to lowest: spades, hearts, diamonds, clubs).
*One more note: You might find it handy to store the value of a card as a string to handle king, queen,
etc. If so, you can use the getters to return a value from 1-13 to (11-13 = jack/queen/king) to make
comparison simple. You can handle this any way you wish of course.
Submit a zipfile containing each .java file (Deck.java, Card.java, (someTesterYouName).java) to
Blackboard. Note that while you have the whole rest of the semester to do this, you will absolutely
want to start early!