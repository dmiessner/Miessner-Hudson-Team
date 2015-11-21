/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.control;

import byui.cit260.dungeonTester.model.Game;
import byui.cit260.dungeonTester.model.Inventory;
import byui.cit260.dungeonTester.model.Map;
import byui.cit260.dungeonTester.model.Player;

/**
 *
 * @author meezl
 */
public class GameControl {

    public static void createNewGame(Player player) {

        Game game = new Game(); // Creates new game
        dungeonTester.setCurrentGame(game); // save in dungeonTester

        game.setPlayer(player); // saves the player

        // create inventory and the list of their items
        Inventory[] inventory = GameControl.createInventoryList();

        // create and set the map
        Map map = MapControl.createMap(); // create and initialize a new map

        // move your actors
        MapControl.moveActorsToStartingLocation(map);
    }

}
