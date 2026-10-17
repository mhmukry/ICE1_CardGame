/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author mhmukry
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(1,13));
            c.setSuit(Card.SUITS[random.nextInt(0,3)]);
            magicHand[i] = c;
        }
        // add one luckcard hard code 2,clubs
        //lucky card 2
        
        magicHand[3].setValue(2);
        magicHand[3].setSuit("Clubs");
        
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.println("Card value:" + magicHand[i].getValue() + "  Card Suit: " + magicHand[i].getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Card userCard = new Card();
        System.out.println("Please enter the card value (1-13): ");
        Scanner sc = new Scanner(System.in);
        int userValue = Integer.parseInt(sc.nextLine());
        userCard.setValue(userValue);
        
        System.out.print("Please enter the card suit: \"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\"");
        String userSuit = sc.nextLine();
        userCard.setSuit(userSuit);
        
       boolean isMagicHandfound = false; 
        for(int i = 0; i<magicHand.length; i++){
            if((userCard.getValue() == magicHand[i].getValue()) && (userCard.getSuit().equals(magicHand[i].getSuit()))){
                isMagicHandfound = true;
            } 
        }
        //Then report the result here
        
        if (isMagicHandfound){ 
            System.out.print("Magic Hand found. Card value:" + userCard.getValue() + "  Card Suit: " + userCard.getSuit());
        }
        else{
            System.out.print("No Magic Hand found.");
        }
    

    }
    
}
