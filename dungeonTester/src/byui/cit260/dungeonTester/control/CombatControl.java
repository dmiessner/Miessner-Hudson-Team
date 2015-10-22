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
public class CombatControl {

    public double playerAttack(double attackStat, double enemyDefense, double enemyHealth) {

        if (enemyHealth <= 0 || enemyHealth > 99) {
            return -1;
        }

        if (attackStat < 1 || attackStat > 99) {
            return -1;
        }

        if (enemyDefense < 1 || enemyDefense > 99) {
            return -1;
        }
        if (attackStat > enemyDefense) {
            double damageDealt = attackStat - enemyDefense;
            return damageDealt;
        } 
        
        else {
            return 0;
        }
    }
}
