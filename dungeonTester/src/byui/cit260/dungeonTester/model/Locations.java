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
public class Locations implements Serializable{
    
    // class instance variables
    private String row;
    private String column;
    private String visited;
    private String staircase;

    public Locations() {
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getStaircase() {
        return staircase;
    }

    public void setStaircase(String staircase) {
        this.staircase = staircase;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.row);
        hash = 17 * hash + Objects.hashCode(this.column);
        hash = 17 * hash + Objects.hashCode(this.visited);
        hash = 17 * hash + Objects.hashCode(this.staircase);
        return hash;
    }

    @Override
    public String toString() {
        return "Locations{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", staircase=" + staircase + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locations other = (Locations) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.staircase, other.staircase)) {
            return false;
        }
        return true;
    }
    
}
