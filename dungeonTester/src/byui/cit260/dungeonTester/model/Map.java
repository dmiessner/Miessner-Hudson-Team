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
public class Map implements Serializable{
    
    // Class instance variables
    private int numRows;
    private int numColumns;

    public Map() {
    }
    

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.numRows;
        hash = 41 * hash + this.numColumns;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "numRows=" + numRows + ", numColumns=" + numColumns + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.numRows != other.numRows) {
            return false;
        }
        if (this.numColumns != other.numColumns) {
            return false;
        }
        return true;
    }
    
}
