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
    private Location[][] locations;

    public Map() {
    }

    public Map(int numRows, int numColumns) {
        if (numRows < 1 || numColumns < 1) {
            System.out.println("The number of rows and columns must be greater than zero.");
            return;
        }
        
        this.numRows = numRows;
        this.numColumns = numColumns;
        
        this.locations = new Location[numRows][numColumns];
        
        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
        
    }
    
    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
