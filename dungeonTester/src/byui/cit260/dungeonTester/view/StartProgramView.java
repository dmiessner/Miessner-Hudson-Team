/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.view;

import byui.cit260.dungeonTester.control.ProgramControl;
import byui.cit260.dungeonTester.model.Player;
import java.util.Scanner;

/**
 *
 * @author Mitchell
 */
public class StartProgramView {

    public void startProgram() {

        //Display Banner
        this.displayBanner();

        //Get Player Name
        String playersName = this.getPlayersName(); //get input

        //Create Player object
        Player player = ProgramControl.createPlayer(playersName); //

        //Display Personalized Welcome Message
        this.displayWelcomeMessage(player);

        // Display the banner
        this.displayBanner();

        // Prompt the player for their name
        

        //Display Banner
        this.displayBanner();

        //Get Player Name
        //Create Player object
        player = ProgramControl.createPlayer(playersName);

        //Display Personalized Welcome Message
        this.displayWelcomeMessage(player);

        // Display Banner
        this.displayBanner();

        // Create Player object
        // Display Personalized Welcome Message
        this.displayWelcomeMessage(player);

        // Display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void displayBanner() {
        System.out.println("\n\n***********************************************");

        System.out.println("*                                             *"
                + "\n* Hello                                       *"
                + "\n*                                             *"
                + "\n*                                             *"
                + "\n*                                             *"
                + "\n* Welcome to the testing dungeon              *"
                + "\n* You lucky person have been selected out of  *"
                + "\n* billions of people on earth, to explore this*"
                + "\n* treasure filled dungeon. As wonderful as it *"
                + "\n* may sound to be in a place filled with      *"
                + "\n* treasure, a dangerous journey awaits you.   *"
                + "\n*                                             *"
                + "\n* In order for you to escape this place with  *"
                + "\n* all of the treasures you find, you will need*"
                + "\n* to fight your way out. You will run into    *"
                + "\n* various enemies and traps that will attempt *"
                + "\n* to prevent your escape from this place.     *");
        System.out.println("*                                             *"
                + "\n* Good luck.                                  *");

        System.out.println("*                                             *"
                + "\n***********************************************");
    }

    /**
     *
     * @return
     */
    public String getPlayersName() {
        boolean valid = false; // indicates that the name still needs to be retrieved.  
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) { // a valid name has yet to be retrieved

            // prompt for the player's name
            System.out.println("Enter your name:");

            // get the name from the keyboard, trim off blanks.
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            // if the players name is less than 2 characters in length then this happens
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank or less than 2 characters.");
                continue;
            }
            break; // exit the repetition
        }
        return playersName; // return the name

    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n===============================================");

        System.out.println("\tWelcome to our dungeon " + player.getName());
        System.out.println("\tWe hope you enjoy your stay.");
        System.out.println("===============================================");
    }
}
