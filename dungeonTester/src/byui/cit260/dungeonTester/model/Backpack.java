/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.model;

import java.io.Serializable;

/**
 *
 * @author meezl
 */
public class Backpack implements Serializable{
    
    // Class instance variables
    private String equipment;
    private String useItems;

    public Backpack() {
    }
    
    

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getUseItems() {
        return useItems;
    }

    public void setUseItems(String useItems) {
        this.useItems = useItems;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public String toString() {
        return "Backpack{" + "equipment=" + equipment + ", useItems=" + useItems + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Backpack other = (Backpack) obj;
        return true;
    }
    
}
