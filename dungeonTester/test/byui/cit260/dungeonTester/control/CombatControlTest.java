/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author meezl
 */
public class CombatControlTest {

    public CombatControlTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of playerAttack method, of class CombatControl.
     */
    @Test
    public void testPlayerAttack() {

        System.out.println("playerAttack");

        System.out.println("\tTest Case #1");

        double attackStat = 10.0;

        double enemyDefense = 5.0;

        double enemyHealth = 10.0;

        CombatControl instance = new CombatControl();

        double expResult = 5.0;

        double result = instance.playerAttack(attackStat, enemyDefense, enemyHealth);

        assertEquals(expResult, result, 5.0);

        // Test Case 2
        System.out.println("playerAttack");

        System.out.println("\tTest Case #2");

        attackStat = 10.0;

        enemyDefense = 15.0;

        enemyHealth = 10.0;

        instance = new CombatControl();

        expResult = 0.0;

        result = instance.playerAttack(attackStat, enemyDefense, enemyHealth);

        assertEquals(expResult, result, 0.0);

        // Test case 3
        System.out.println("playerAttack");

        System.out.println("\tTest Case #3");

        attackStat = 100.0;

        enemyDefense = 10.0;

        enemyHealth = 10.0;

        instance = new CombatControl();

        expResult = -1.0;

        result = instance.playerAttack(attackStat, enemyDefense, enemyHealth);

        assertEquals(expResult, result, -1.0);

        // Test case 4
        System.out.println("playerAttack");

        System.out.println("\tTest Case #4");

        attackStat = 0.0;

        enemyDefense = 10.0;

        enemyHealth = 10.0;

        instance = new CombatControl();

        expResult = -1.0;

        result = instance.playerAttack(attackStat, enemyDefense, enemyHealth);

        assertEquals(expResult, result, -1.0);

        // Test case 5
        System.out.println("playerAttack");

        System.out.println("\tTest Case #5");

        attackStat = 10.0;

        enemyDefense = 100.0;

        enemyHealth = 10.0;

        instance = new CombatControl();

        expResult = -1.0;

        result = instance.playerAttack(attackStat, enemyDefense, enemyHealth);

        assertEquals(expResult, result, -1.0);

        // Test case 6
        System.out.println("playerAttack");

        System.out.println("\tTest Case #6");

        attackStat = 10.0;

        enemyDefense = 0.0;

        enemyHealth = 10.0;

        instance = new CombatControl();

        expResult = -1.0;

        result = instance.playerAttack(attackStat, enemyDefense, enemyHealth);

        assertEquals(expResult, result, -1.0);

        // Test case 7
        System.out.println("playerAttack");

        System.out.println("\tTest Case #7");

        attackStat = 10.0;

        enemyDefense = 10.0;

        enemyHealth = 100.0;

        instance = new CombatControl();

        expResult = -1.0;

        result = instance.playerAttack(attackStat, enemyDefense, enemyHealth);

        assertEquals(expResult, result, -1.0);

        // Test case 8
        System.out.println("playerAttack");

        System.out.println("\tTest Case #8");

        attackStat = 10.0;

        enemyDefense = 10.0;

        enemyHealth = 0.0;

        instance = new CombatControl();

        expResult = -1.0;

        result = instance.playerAttack(attackStat, enemyDefense, enemyHealth);

        assertEquals(expResult, result, -1.0);

    }

    /**
     * Test of enemyAttack method, of class CombatControl.
     */
    @Test
    public void testEnemyAttack() {
        // test case 1
        System.out.println("enemyAttack");
        System.out.println("\tTest Case #1");
        double enemyAttack = 5.0;
        double playerDefense = 10.0;
        double playerHealth = 10.0;
        CombatControl instance = new CombatControl();
        double expResult = 0.0;
        double result = instance.enemyAttack(enemyAttack, playerDefense, playerHealth);
        assertEquals(expResult, result, 0.0);
        
        // test case 2
        System.out.println("enemyAttack");
        System.out.println("\tTest Case #2");
        enemyAttack = 10.0;
        playerDefense = 5.0;
        playerHealth = 10.0;
        instance = new CombatControl();
        expResult = 5.0;
        result = instance.enemyAttack(enemyAttack, playerDefense, playerHealth);
        assertEquals(expResult, result, 5.0);
        
        // test case 3
        System.out.println("enemyAttack");
        System.out.println("\tTest Case #3");
        enemyAttack = 100.0;
        playerDefense = 5.0;
        playerHealth = 10.0;
        instance = new CombatControl();
        expResult = -1.0;
        result = instance.enemyAttack(enemyAttack, playerDefense, playerHealth);
        assertEquals(expResult, result, -1.0);
        
        // test case 4
        System.out.println("enemyAttack");
        System.out.println("\tTest Case #4");
        enemyAttack = 10.0;
        playerDefense = 100.0;
        playerHealth = 10.0;
        instance = new CombatControl();
        expResult = -1.0;
        result = instance.enemyAttack(enemyAttack, playerDefense, playerHealth);
        assertEquals(expResult, result, -1.0);
        
        // test case 5
        System.out.println("enemyAttack");
        System.out.println("\tTest Case #5");
        enemyAttack = 0.0;
        playerDefense = 10.0;
        playerHealth = 10.0;
        instance = new CombatControl();
        expResult = -1.0;
        result = instance.enemyAttack(enemyAttack, playerDefense, playerHealth);
        assertEquals(expResult, result, -1.0);
        
        // test case 6
        System.out.println("enemyAttack");
        System.out.println("\tTest Case #6");
        enemyAttack = 10.0;
        playerDefense = 0.0;
        playerHealth = 10.0;
        instance = new CombatControl();
        expResult = -1.0;
        result = instance.enemyAttack(enemyAttack, playerDefense, playerHealth);
        assertEquals(expResult, result, -1.0);
        
        // test case 7
        System.out.println("enemyAttack");
        System.out.println("\tTest Case #7");
        enemyAttack = 10.0;
        playerDefense = 5.0;
        playerHealth = 100.0;
        instance = new CombatControl();
        expResult = -1.0;
        result = instance.enemyAttack(enemyAttack, playerDefense, playerHealth);
        assertEquals(expResult, result, -1.0);
        
        // test case 8
        System.out.println("enemyAttack");
        System.out.println("\tTest Case #8");
        enemyAttack = 10.0;
        playerDefense = 5.0;
        playerHealth = 0.0;
        instance = new CombatControl();
        expResult = -1.0;
        result = instance.enemyAttack(enemyAttack, playerDefense, playerHealth);
        assertEquals(expResult, result, -1.0);
    }
}
