import java.util.Random;

public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        
        // Initialize the deck with "rank of suit"
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;
        
        // Shuffle using the Fisher-Yates algorithm (or Knuth shuffle)
        for (int i = 0; i < n; i++) {
            // Generate a random index between i and n-1
            int randomCardNumber = i + rand.nextInt(n - i);
            
            // Swap cards at index i and randomCardNumber
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }

    // Method to distribute the deck of n cards to x players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        int totalCards = numPlayers * cardsPerPlayer;
        
        // Check if the total number of cards is enough for all players
        if (deck.length < totalCards) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        // Create a 2D array to store cards for each player
        String[][] playersCards = new String[numPlayers][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }

        return playersCards;
    }

    // Method to print the players' cards
    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) {
            return;
        }

        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : playersCards[i]) {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Number of players and cards per player
        int numPlayers = 4;  
        int cardsPerPlayer = 5;  

        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Distribute the cards to players
        String[][] playersCards = distributeCards(deck, numPlayers, cardsPerPlayer);

        // Print the players' cards
        printPlayersCards(playersCards);
    }
}
