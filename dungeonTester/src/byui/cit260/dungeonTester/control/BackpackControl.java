/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.control;

/**
 *
 * @author meezl
 */
public class BackpackControl {
    public double packWeight(double packWeight, double carrySkill, double speedStat, double speedBattle) {
        
        if (packWeight < 0 || carrySkill <=0){
            return -1;
        }
        
        if (packWeight - carrySkill <= 0){
        
            return speedBattle = speedStat * 1;
        }
        
        if (packWeight - carrySkill > 0){
            return speedBattle = (carrySkill / packWeight) * speedStat; 
        }
    
        else{
            return -1;
        }
    }
}
