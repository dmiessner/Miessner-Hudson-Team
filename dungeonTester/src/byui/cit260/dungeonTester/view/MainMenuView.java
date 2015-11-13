 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.view;

import byui.cit260.dungeonTester.control.GameControl;
import dungeontester.DungeonTester;

/**
 *
 * @author meezl
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n==============================================="
                + "\n| Main Menu                                   |"
                + "\n==============================================="
                + "\nG - Start Game"
                + "\nN - Start New Game"
                + "\nH - Help menu for the game"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n===============================================");
    }

    /**
     *
     * @param input
     * @return
     */
    @Override
    public boolean doAction(Object input) {
        
        String value = (String) input;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
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
                return true;
            default:
                System.out.println("\n*** Invalid selection, try again ***");
                break;

        }
        return false;
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
        SaveMenuView saveMenu = new SaveMenuView();
        saveMenu.displayMenu();
    }

}
