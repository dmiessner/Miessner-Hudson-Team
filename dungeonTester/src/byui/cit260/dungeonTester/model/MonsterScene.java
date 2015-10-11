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
public class MonsterScene implements Serializable{
    
    //class instance variables
    private String description;
    private String enemyType;

    public MonsterScene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.enemyType);
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
        final MonsterScene other = (MonsterScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.enemyType, other.enemyType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MonsterScene{" + "description=" + description + ", enemyType=" + enemyType + '}';
    }
    
    
    
}
