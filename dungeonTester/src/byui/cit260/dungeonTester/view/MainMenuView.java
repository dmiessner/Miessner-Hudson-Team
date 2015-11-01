 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.view;

import byui.cit260.dungeonTester.control.GameControl;
import dungeontester.DungeonTester;
import java.util.Scanner;

/**
 *
 * @author meezl
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n==============================================="
            + "\n| Main Menu                                   |"
            + "\n==============================================="
            + "\nG - Start Game"
            + "\nN - Start New Game"
            + "\nH - Help menu for the game"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n===============================================";

    public void displayMenu() {

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
            case 'N': // Create a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // exit the program
                    return;
            default:
                System.out.println("\n*** Invalid selection, try again ***");
                break;
 
        }
    }

    private void startNewGame() {
        // Create a new game
        GameControl.createNewGame(DungeonTester.getPlayer());
        
        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called. ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called. ***");
    }

}
