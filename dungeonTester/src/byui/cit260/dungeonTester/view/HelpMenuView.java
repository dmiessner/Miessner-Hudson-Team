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
public class HelpMenuView {

    private final String MENU = "\n"
            + "\n==============================================="
            + "\n| Help Menu                                  |"
            + "\n==============================================="
            + "\nP - Purpose of game"
            + "\nI - How to interact"
            + "\nC - How combat works"
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
                System.out.println("Invalid input - the input must be P, I, C, or E, and only one character");
                continue;
            }
            break; // exit the repetition
        }
        return input; // return the input
    }

    private void doAction(char selection) {
        switch (selection) {
            case 'P': // :Learn the purpose of the game
                this.learnPurpose();
                break;
            case 'I': // leran to interact
                this.learnToInteract();
                break;
            case 'C': // Learn combat
                this.learnCombat();
                break;
            case 'B': // exit the program
                    return;
            default:
                System.out.println("\n*** Invalid selection, try again ***");
                break;
 
    }

}

    private void learnPurpose() {
        System.out.println("*** The purpose of this game is to climb stair cases to reach the end of the dungeon, and not die while doing so. ***");
    }

    private void learnToInteract() {
        System.out.println("*** Interacting with your room causes you to search for keys, a stairwell, treasure, or monsters. ***");
    }

    private void learnCombat() {
        System.out.println("*** Combat is simple.  Your defense vs their attack, and vice versa.  Who ever hits 0 health first dies. ***");
    }
}
