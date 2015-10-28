/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeontester;

import byui.cit260.dungeonTester.model.Actors;
import byui.cit260.dungeonTester.model.Backpack;
import byui.cit260.dungeonTester.model.Game;
import byui.cit260.dungeonTester.model.Inventory;
import byui.cit260.dungeonTester.model.Locations;
import byui.cit260.dungeonTester.model.Map;
import byui.cit260.dungeonTester.model.MonsterScene;
import byui.cit260.dungeonTester.model.Player;
import byui.cit260.dungeonTester.model.RegularScene;
import byui.cit260.dungeonTester.model.StairScene;
import byui.cit260.dungeonTester.model.TrapScene;
import byui.cit260.dungeonTester.view.StartProgramView;

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
        
        Inventory inventory = new Inventory();
        
        inventory.setInventoryType("Sword");
        inventory.setQuantity(24);
        inventory.setKeyItems("Key of Unlocking");
        inventory.setAttribute("Titanium");
        
        String InventoryInfo = inventory.toString();
        System.out.println(InventoryInfo);
        
        TrapScene trapScene = new TrapScene();
        
        trapScene.setDescription("Push to front wall");
        trapScene.setTrapType("Push Trap");
        
        String TrapSceneInfo = trapScene.toString();
        System.out.println(TrapSceneInfo);
        
        StairScene stairScene = new StairScene();
        
        stairScene.setDescription("Climb to next floor");
        stairScene.setGuardianType("Troll");
        stairScene.setAttribute("Proceed");
        
        String StairSceneInfo = stairScene.toString();
        System.out.println(StairSceneInfo);
        
        RegularScene regularScene = new RegularScene();
        
        regularScene.setDescription("Look around but nothing found");
        
        String RegularSceneInfo = regularScene.toString();
        System.out.println(RegularSceneInfo);
        
        MonsterScene monsterScene = new MonsterScene();
        
        monsterScene.setDescription("Monster Engages in battle");
        monsterScene.setEnemyType("Orc");
        
        String MonsterSceneInfo = monsterScene.toString();
        System.out.println(MonsterSceneInfo);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }
    
    
}


