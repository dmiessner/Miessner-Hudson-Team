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
public class Actors implements Serializable{
    
    // class instance variables
    private String enemies;
    private String floorguardian;
    private String playerCharacter;
    private String attribute;

    public Actors() {
    }

    public String getEnemies() {
        return enemies;
    }

    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }

    public String getFloorguardian() {
        return floorguardian;
    }

    public void setFloorguardian(String floorguardian) {
        this.floorguardian = floorguardian;
    }

    public String getPlayerCharacter() {
        return playerCharacter;
    }

    public void setPlayerCharacter(String playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.enemies);
        hash = 13 * hash + Objects.hashCode(this.floorguardian);
        hash = 13 * hash + Objects.hashCode(this.playerCharacter);
        hash = 13 * hash + Objects.hashCode(this.attribute);
        return hash;
    }

    @Override
    public String toString() {
        return "Actors{" + "enemies=" + enemies + ", floorguardian=" + floorguardian + ", playerCharacter=" + playerCharacter + ", attribute=" + attribute + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actors other = (Actors) obj;
        if (!Objects.equals(this.enemies, other.enemies)) {
            return false;
        }
        if (!Objects.equals(this.floorguardian, other.floorguardian)) {
            return false;
        }
        if (!Objects.equals(this.playerCharacter, other.playerCharacter)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }  

    public String toStrign() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
