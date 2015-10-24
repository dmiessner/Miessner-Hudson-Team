/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mitchell
 */
public class BackpackControlTest {
    
    public BackpackControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of packWeight method, of class BackpackControl.
     */
    @Test
    public void testPackWeight() {
        System.out.println("packWeight");
        double packWeight = 0.0;
        double carrySkill = 0.0;
        double speedStat = 0.0;
        double speedBattle = 0.0;
        BackpackControl instance = new BackpackControl();
        double expResult = 0.0;
        double result = instance.packWeight(packWeight, carrySkill, speedStat, speedBattle);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
