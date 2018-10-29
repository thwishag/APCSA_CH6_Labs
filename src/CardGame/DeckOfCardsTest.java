package CardGame;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Name: Thwisha Guru
 * Date: 10/25/18
 * Period: 1
 *
 * CardGame.DeckOfCardsTest.java
 *
 * Tester program to shuffle and deal a deck of Card objects
 */

public class DeckOfCardsTest
{
    public static void main (String[] args)
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        Scanner scan = new Scanner(System.in);
        myDeckOfCards.shuffle(); // put Card objects in random order
        ArrayList<Card> player = new ArrayList<Card>();
        ArrayList<Card> dealer = new ArrayList<Card>();
        int playerValue = 0, dealerValue = 0;
        boolean isItBust = false;

        //First 2 cards
        for(int i =0; i < 2; i++)
        {
            dealer.add( myDeckOfCards.dealCard());
            player.add( myDeckOfCards.dealCard());
        }
        //Option-2 Solution to the assignment - 0-1
        System.out.println("The Dealers First Card: " + dealer.get(0).toString());
        //if (dealer)
        System.out.printf("The Players First Card: %s, Second Card: %s\n", player.get(0).toString(), player.get(1).toString());
        playerValue = player.get(0).getvalue() + player.get(1).getvalue();
        dealerValue = dealer.get(0).getvalue() + dealer.get(1).getvalue();
        System.out.println("The Total Value of the Cards is " + playerValue + ".");

        System.out.print("Would you like to hit or stay?");
        String response = scan.nextLine();


//        if ((playerValue == 21)) {
//            System.out.println("Player has won");
//        } else {
//
//        }
//        do {
//
//
//        }//


//        // -----------------------------------------------------------
//        //  print all 52 Cards in the order in which they are dealt
//        // -----------------------------------------------------------
//        for (int i = 0; i < 13; i++)
//        {
//            // printf method is used for formatting output
//            // print string (%) in a space of 20 characters (20s)
//            // the - in the (-20s) makes the String left align
//            // printf can be used with floats, ints and other types as well
//            // cheat sheet @ https://thejavacheatsheet.wordpress.com/2015/04/11/printf/
//            // Guide #2 https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
//            System.out.printf("%-20s%-20s%-20s%-20s\n",
//                myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
//                myDeckOfCards.dealCard(), myDeckOfCards.dealCard());
//
//        }
    }
}
