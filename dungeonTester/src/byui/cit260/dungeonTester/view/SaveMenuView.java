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
public class SaveMenuView {
    
    private final String MENU = "\n"
            + "\n==============================================="
            + "\n| Save Menu                                   |"
            + "\n==============================================="
            + "\nS - Save Game"
            + "\nO - Open a different save"
            + "\nC - Close Game"
            + "\nE - Exit"
            + "\n===============================================";
    
    public void displayMenu() {

        char selection = ' ';
        do {

            System.out.println(MENU); // Displays save menu

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
            case 'S': // Saves running game
                this.saveGame();
                break;
            case 'O': // Opens an existing save
                this.openSave();
                break;
            case 'C': // Closes the game
                this.closeSave();
                break;
            case 'E': // exit to previous menu
                    return;
            default:
                System.out.println("\n*** Invalid selection, try again ***");
                break;
    }
    
}

    private void closeSave() {
        System.out.println("*** Called close save function ***");
    }

    private void openSave() {
        System.out.println("*** Called open save function ***");
    }

    private void saveGame() {
        System.out.println("*** Called save game function ***");
    }
}