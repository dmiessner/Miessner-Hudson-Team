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
 * @author Mitchell
 */
public class Player implements Serializable{
    //class instant variables
    private String name;
    private double playerStats;

    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(double playerStats) {
        this.playerStats = playerStats;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.playerStats) ^ (Double.doubleToLongBits(this.playerStats) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerStats) != Double.doubleToLongBits(other.playerStats)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", playerStats=" + playerStats + '}';
    }
    
    
    
}
