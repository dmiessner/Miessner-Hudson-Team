/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author meezl
 */
public enum Actors implements Serializable {

    MainCharacter("The lead character of the game who you play"),
    BasicEnemies("The small enemies that you will run into randomly on the floors"),
    DoorGuardian("Guardians that keep you from progressing to the next floor");
    


    // class instance variables
    private final String enemies;
    private final String floorguardian;
    private final String playerCharacter;
    private final String attribute;

    Actors (String description){
            this.discription = discription;
            coordinates = new Point(1,1);
        
    }


    public String getEnemies() {
        return enemies;
    }


    public String getFloorguardian() {
        return floorguardian;
    }


    public String getPlayerCharacter() {
        return playerCharacter;
    }


    public String getAttribute() {
        return attribute;
    }




    @Override
        public String toString() {
        return "Actors{" + "enemies=" + enemies + ", floorguardian=" + floorguardian + ", playerCharacter=" + playerCharacter + ", attribute=" + attribute + '}';
    }
    

    public String toStrign() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
