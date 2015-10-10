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
public class Game implements Serializable{
    
    // class instance variables
    private String newGame;
    private String continueGame;

    public Game() {
    }

    public String getNewGame() {
        return newGame;
    }

    public void setNewGame(String newGame) {
        this.newGame = newGame;
    }

    public String getContinueGame() {
        return continueGame;
    }

    public void setContinueGame(String continueGame) {
        this.continueGame = continueGame;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.newGame);
        hash = 41 * hash + Objects.hashCode(this.continueGame);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "newGame=" + newGame + ", continueGame=" + continueGame + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.newGame, other.newGame)) {
            return false;
        }
        if (!Objects.equals(this.continueGame, other.continueGame)) {
            return false;
        }
        return true;
    }
    
}
