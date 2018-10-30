package CardGame;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Name: Thwisha Guru
 * Date: 10/25/18
 * Period: 1
 *
 * CardGame.BlackJack.java
 *
 * Tester program to shuffle and deal a deck of Card objects
 */

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("Hello and let us begin!");

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.generate();
        myDeckOfCards.shuffle();

        DeckOfCards player = new DeckOfCards();
        DeckOfCards dealer = new DeckOfCards();

        Scanner userInput = new Scanner(System.in);
        boolean end = false;
        //Player gets 2 cards
        player.draw(myDeckOfCards);
        player.draw(myDeckOfCards);
        //Dealer gets 2 cards
        dealer.draw(myDeckOfCards);
        dealer.draw(myDeckOfCards);

        while (true) {
            System.out.println("Your hand is: ");
            System.out.print(player.toString());
            System.out.println("Your deck has a value of: " + player.valueofcard());

            System.out.println("Dealer Hand is: " + dealer.getCard(0).toString());

            System.out.println("Would you like to Hit or Stay?");
            int answer = userInput.nextInt();

            //Hit
            if (answer == 1) {
                player.draw(myDeckOfCards);
                System.out.println("You drew a: " + player.getCard(player.deckSize() - 1).toString());
                //Bust if they end up going over 21
                if (player.valueofcard() > 21) {
                    System.out.println("you BUSTED! and your current value is:" + player.valueofcard());
                    end = true;
                    break;
                }
                if (answer == 2) {
                    break;
                }
            }
            //The dealer's cards are now revealed.
            System.out.println("The Dealer's Cards: " + dealer.toString());
            if (dealer.valueofcard() > player.valueofcard() && end == false) {
                System.out.println("The Dealer won!");
                throw new InputMismatchException();
            }
            while ((dealer.valueofcard() < 17) && end == false) {
                dealer.draw(myDeckOfCards);
                System.out.println("Dealer draws: " + dealer.getCard(dealer.deckSize() - 1).toString());
            }
            System.out.println("The dealer's hand value is: " + dealer.valueofcard());
            if ((dealer.valueofcard() > 21) && end == false) {
                System.out.println("The Dealer busted! You win!!");
                end = true;
            }
        }
    }
}

