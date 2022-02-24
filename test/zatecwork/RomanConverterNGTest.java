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
public class RomanConverterNGTest {
    
    public RomanConverterNGTest() {
    }


   
    @Test
    public void testRomanToInteger() {
        String roman = "XCI";
        RomanConverter instance = new RomanConverter();
        int expResult = 91;
        int result = instance.romanToInteger(roman);
        assertEquals(result, expResult);
    }

    
    @Test
    public void testIntegerToRoman() {
        int num = 2022;
        RomanConverter instance = new RomanConverter();
        String expResult = "MMXXII";
        String result = instance.integerToRoman(num);
        assertEquals(result, expResult);
    }
    
}
