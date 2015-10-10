/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeontester;

import byui.cit260.dungeonTester.model.Actors;
import byui.cit260.dungeonTester.model.Backpack;
import byui.cit260.dungeonTester.model.Game;
import byui.cit260.dungeonTester.model.Locations;
import byui.cit260.dungeonTester.model.Map;
import byui.cit260.dungeonTester.model.Player;

/**
 *
 * @author Mitchell
 */
public class DungeonTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Edward Scissorhands");
        playerOne.setPlayerStats(9001);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game gameOne = new Game();  
        
        gameOne.setNewGame("Start New Game");
        gameOne.setContinueGame("Continue Game");
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);   
        
        Backpack backpack = new Backpack();
        
        backpack.setEquipment("Equipment list here");
        backpack.setUseItems("Use items go here");
        
        String backpackInfo = backpack.toString();
        System.out.println(backpackInfo);
        
        Map map = new Map();
        
        map.setNumRows(4);
        map.setNumColumns(4);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        Actors actors = new Actors();
        
        actors.setEnemies("List of enemies");
        actors.setFloorguardian("List of riddles and problems here");
        actors.setPlayerCharacter("List player stats here");
        actors.setAttribute("Attributes here");
        
        String actorsInfo = actors.toString();
        System.out.println(actorsInfo);
        
        Locations locations = new Locations();
        
        locations.setRow("Row number");
        locations.setColumn("Column number");
        locations.setVisited("Visted or not");
        locations.setStaircase("Staircase or not");
        
        String locationsInfo = locations.toString();
        System.out.println(locationsInfo);
    }
    
    
}
