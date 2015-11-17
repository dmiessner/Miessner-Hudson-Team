/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.view;

/**
 *
 * @author meezl
 */
public class BackpackView extends View {

    public BackpackView() {

        super("\n"
                + "\n==============================================="
                + "\n| Backpack                                   |"
                + "\n==============================================="
                + "\nI - View items"
                + "\nU - Use items"
                + "\nW - Wear items"
                + "\nE - Exit"
                + "\n===============================================");
    }

    @Override
    public boolean doAction(Object input) {

        String value = (String) input;

        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'W': // Create a new game
                this.wearItems();
                break;
            case 'U': // get and start an existing game
                this.useItems();
                break;
            case 'I': // display the help menu
                this.viewItems();
                break;
            case 'E': // exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection, try again ***");
                break;

        }
        return false;
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
