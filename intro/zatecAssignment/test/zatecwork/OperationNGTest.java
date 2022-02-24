/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zatecwork;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author niyonkuru
 */
public class OperationNGTest {
    
    public OperationNGTest() {
    }

    /**
     * Test of addRomans method, of class Operation.
     */
    @Test
    public void testAddRomans() {
        String a = "X";
        String b = "XI";
        Operation instance = new Operation();
        String expResult = "XXI";
        String result = instance.addRomans(a, b);
        assertEquals(result, expResult);
    }

    /**
     * Test of multipyRomans method, of class Operation.
     */
    @Test
    public void testMultipyRomans() {
        String a = "M";
        String b = "II";
        Operation instance = new Operation();
        System.out.println(instance.multipyRomans(a, b));
        String expResult = "MM";
        String result = instance.multipyRomans(a, b);
        assertEquals(result, expResult);
    }

    /**
     * Test of divideRomans method, of class Operation.
     */
    @Test
    public void testDivideRomans() {
        String a = "M";
        String b = "X";
        Operation instance = new Operation();
        String expResult = "C";
        String result = instance.divideRomans(a, b);
        assertEquals(result, expResult);
    }

    /**
     * Test of substractRomans method, of class Operation.
     */
    @Test
    public void testSubstractRomans() {
        String a = "XC";
        String b = "XIX";
        Operation instance = new Operation();
        String expResult = "LXXI";
        String result = instance.substractRomans(a, b);
        assertEquals(result, expResult);
    }
    
}
