/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zatecwork;

/**
 *
 * @author niyonkuru
 */
public class Operation {

    RomanConverter convert = new RomanConverter();
    public Operation() {
    }

    public String addRomans(String a, String b) {
        
        int result = 0;
        result = convert.romanToInteger(a) + convert.romanToInteger(b);
        return convert.integerToRoman(result);
    }

    

    public String multipyRomans(String a, String b) {
        int result = 0;
        result = convert.romanToInteger(a) * convert.romanToInteger(b);
        return convert.integerToRoman(result);
    }

    public String divideRomans(String a, String b) {
        int result = 0;
        result = convert.romanToInteger(a) / convert.romanToInteger(b);
        return convert.integerToRoman(result);
    }

    public String substractRomans(String a, String b) {
        int result = 0;
        result = convert.romanToInteger(a) - convert.romanToInteger(b);
        return convert.integerToRoman(result);
    }
}
