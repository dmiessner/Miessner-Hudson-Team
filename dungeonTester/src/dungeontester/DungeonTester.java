/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeontester;

import byui.cit260.dungeonTester.model.Game;
import byui.cit260.dungeonTester.model.Player;
import byui.cit260.dungeonTester.view.StartProgramView;

/**
 *
 * @author Mitchell
 */
public class DungeonTester {

    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DungeonTester.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DungeonTester.player = player;
    }
    private static Player player = null;


    
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();

    }

}
