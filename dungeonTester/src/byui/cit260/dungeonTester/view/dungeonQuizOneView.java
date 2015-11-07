/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.view;

import byui.cit260.dungeonTester.control.ProgramControl;
import byui.cit260.dungeonTester.control.QuestionControl;
import byui.cit260.dungeonTester.model.Question;
import java.util.Scanner;

/**
 *
 * @author Mitchell
 */
public class dungeonQuizOneView {

    String promptMessage = ("*                                             *"
            + "\n* Congradulations on making it this far Hero. *"
            + "\n* But in order for you to progress further    *"
            + "\n* You need to answer three questions, if      *"
            + "\n* you fail then your stay on this level will  *"
            + "\n* last a little longer. So lets see how you   *"
            + "\n* do.                                         *"
            + "\n*                                             *"
            + "\n* What is the square root of 9?               *"
            + "\n*                                             *"
            + "\n***********************************************");

    public void dungeonQuizOneView(Question question) {

        do {
            System.out.println(question.getQuestion());
            String playerAnswer = this.getInput();

            //Get Input
            String playerAnswer = this.getPlayersAnswer();

            boolean quit = this.doAction(playerAnswer);

        } while (!quit);

    }

    public String getInput() {
        boolean valid = false; // indicates that the name still needs to be retrieved.  
        String playersAnwer = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) { // a valid name has yet to be retrieved

            // get the name from the keyboard, trim off blanks.
            playerAnswer = keyboard.nextLine();
            playerAnswer = playerAnswer.trim();

            // if the players name is less than 2 characters in length then this happens
            if (playerAnswer.length() < 3 || playerAnswer.length() > 3) {
                System.out.println("Sorry that is not correct, please try again when you are ready.");
                continue;
            }
            break; // exit the repetition
        }
        return playerAnswer; // return the name

    }

    private boolean doAction(Question question, String answer) {
    

    private void displaySecondQuestion(String answer) {
        //Call control function to calculate the correct answer
        int result = QuestionControl.checkAnswer(question, answer);

        if (result == 0) {
            System.out.println("\n\n===============================================");
            System.out.println("\tCongradulations, you guessed the correct number, " + player.getAnswer());
            System.out.println("\tPlease Proceded...");
            System.out.println("===============================================");
            return true;
        }
        //display invalid answer
        //prompt user to continue or quit
        //get input
        //if input = yes, return false
        //else = true
        //

        System.out.println("\n\n===============================================");
        System.out.println("\tCongradulations, you guessed the correct number, " + player.getAnswer());
        System.out.println("\tPlease Proceded...");
        System.out.println("===============================================");
    }
}

}
