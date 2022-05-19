package CardDealer;

public class CardDealer {

    public static void main(String[] args) {

        String cards = "23456789XJQKA";    // The deck of cards is represented in a string constant
        String suits = "HDCS";

        StringBuilder str = new StringBuilder();    // creates string variable for 5 printed cards

        for (int i = 0; str.length() < 14; i++) {    // loop for to get each card
            char newSuit = suits.charAt((int) (Math.random() * suits.length()));    // To get a random suit
            str.append(newSuit);    // adds suit
            char newCard = cards.charAt((int) (Math.random() * cards.length()));    // To get a random card out of the deck
            str.append(newCard);    // adds card
            str.append(" ");    // adds space between card/suit pair
        }
        
        System.out.println(str);    // prints out string of 5 random cards
    }

}