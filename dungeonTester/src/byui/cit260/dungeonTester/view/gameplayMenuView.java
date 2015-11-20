/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.view;

import byui.cit260.dungeonTester.control.MapControl;
import java.util.Scanner;

/**
 *
 * @author Mitchell
 */
public class gameplayMenuView {
    
            String promptMessage = ("***********************************************"
                + "\n*                                             *"
                + "\n* What would you like to do now?              *"
                + "\n*                                             *"
                + "\n*  M  - Display map                           *"
                + "\n*  F  - Move Forward                          *"
                + "\n*  B  - Move Backward                         *"
                + "\n*  R  - Move Right                            *"
                + "\n*  L  - Move Left                             *"
                + "\n*  S  - Open Save Menu                        *"
                + "\n*  I  - Inspect Surroundings                  *"
                + "\n*  P  - Opens Backpack Menu                   *"
                + "\n*                                             *"
                + "\n***********************************************");

    public void gameplayMenu() {

        char selection = ' ';
        do{
            
            //Display the Game Menu
            //System.out.println(gameMenu);
            
            //Get User selection
            String input = this.getInput();
            //get first character of string
            selection = input.charAt(0);
            
            // do action from selection
            this.doAction(selection);
            
        } while (selection != 'E'); //e = exit

    }
    
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //While a valid name is not retrived
        while(!valid) {
            
            //Get value entered from keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid Option, try again.***");
                continue;
            }
            
            break;
        }
        
        return selection; //return name
    }
    
        public void doAction(char choice) {

        switch (choice) {
            case 'M': //Display map
                MapControl.mapDisplay();
                break;
            case 'F': //Move Forward
                MapControl.moveForward();
                break;
            case 'B': //Move Backward
                MapControl.moveBack();
                break;
            case 'R': //Move Right
                MapControl.moveRight();
                break;
            case 'L': //Move Left
                MapControl.moveLeft();
                break;
            case 'S': //Display Save Menu
                MapControl.saveDisplay();
                break;
            case 'I': //Inspect surroundings
                MapControl.inspectSurround();
                break;
            case 'P': //Open Backpack menu
                MapControl.openBackpack();
                break;
            default:
                System.out.println("\n***Invalid Input, try again.***");
                break;

        }

    }


    }
