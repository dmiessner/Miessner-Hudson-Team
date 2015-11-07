/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.view;

import java.util.Scanner;

/**
 *
 * @author meezl
 */
public class BackpackView {

    private final String MENU = "\n"
            + "\n==============================================="
            + "\n| Backpack                                   |"
            + "\n==============================================="
            + "\nI - View items"
            + "\nU - Use items"
            + "\nW - Wear items"
            + "\nE - Exit"
            + "\n===============================================";

    void displayMenu() {
        char selection = ' ';
        do {

            System.out.println(MENU); // Displays the main menu

            String input = this.getInput(); // Get the user's input
            selection = input.charAt(0); // Get the first character of the string

            this.doAction(selection); // Do an action based on the user's selection 
        } while (selection != 'E'); // Any selection that is not exit will cause a loop
    }

    private String getInput() {
        boolean valid = false; // indicates that the input still needs to be retrieved.  
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) { // a valid name has yet to be retrieved

            // prompt for the player's name
            System.out.println("Enter your input");

            // get the name from the keyboard, trim off blanks.
            input = keyboard.nextLine();
            input = input.trim();

            // if the players name is less than 2 characters in length then this happens
            if (input.length() > 1) {
                System.out.println("Invalid input - the input must be G, H, S, or E, and only one character");
                continue;
            }
            break; // exit the repetition
        }
        return input; // return the input
    }

    private void doAction(char selection) {
        switch (selection) {
            case 'I': // Create a new game
                this.viewItems();
                break;
            case 'U': // get and start an existing game
                this.useItems();
                break;
            case 'W': // display the help menu
                this.wearItems();
                break;
            case 'E': // exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection, try again ***");
                break;
        }

    }

    private void wearItems() {
        System.out.println("*** Wear items fucntion called ***");
    }

    private void useItems() {
        System.out.println("*** Use items function called ***");
    }

    private void viewItems() {
        System.out.println("*** View items function called ***");
    }
}
