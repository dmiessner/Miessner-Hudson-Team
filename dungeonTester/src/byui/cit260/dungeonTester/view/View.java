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
public abstract class View implements ViewInterface {

    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage;

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        String value = "";
        boolean done = false;

        do {
            System.out.println(this.displayMessage);
            value = this.getInput();
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates that the input still needs to be retrieved.  
        String selection = null;

        while (!valid) { // a valid name has yet to be retrieved

            // prompt for the player's name
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                System.out.println("You must enter a value.");
                continue;
            }

            break; // exit the repetition
        }
        return selection; // return the input
    }

}
