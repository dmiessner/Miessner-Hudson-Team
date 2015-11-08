/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.view;

import byui.cit260.dungeonTester.control.MapControl;

/**
 *
 * @author Mitchell
 */
public class gameplayMenuView {

    public void gameplayMenu() {

        //display banner
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println("\n\n***********************************************");

        System.out.println("*                                             *"
                + "\n* What would you like to do now?              *"
                + "\n*                                             *"
                + "\n*  M  - Map:Display map                       *"
                + "\n*  F  - Move Forward                          *"
                + "\n*  B  - Move Backward                         *"
                + "\n*  R  - Move Right                            *"
                + "\n*  L  - Move Left                             *"
                + "\n*  S  - Open Save Menu                        *"
                + "\n*  I  - Inspect Surroundings                  *"
                + "\n*  P  - Opens Backpack Menu                   *"
                + "\n*                                             *"
                + "\n***********************************************");
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
                System.out.println("\n*Invalid Input, try again.                    *");
                break;

        }
    }

}
