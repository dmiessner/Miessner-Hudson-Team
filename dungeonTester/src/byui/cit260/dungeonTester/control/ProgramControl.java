/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.control;

import byui.cit260.dungeonTester.model.Player;
import dungeontester.DungeonTester;



/**
 *
 * @author Mitchell
 */
public class ProgramControl {
    
    //Create Player
    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        DungeonTester.setPlayer(player);
        
        return player;
    }
    
    public static Answer readAnswer(String answer) {
        
        if (answer == null){
            return null;
        }
        
        Answer answer = new Answer();
        answer.getAnswer(answer);
        
        return answer;
        
    }
    
}
