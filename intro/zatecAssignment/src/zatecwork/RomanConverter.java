/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zatecwork;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author niyonkuru
 */
public class RomanConverter {

    public RomanConverter() {
    }

    public int romanToInteger(String roman) {
        Map<Character, Integer> romanSymbol = new HashMap<>();
        romanSymbol.put('I', 1);
        romanSymbol.put('V', 5);
        romanSymbol.put('X', 10);
        romanSymbol.put('L', 50);
        romanSymbol.put('C', 100);
        romanSymbol.put('D', 500);
        romanSymbol.put('M', 1000);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);

            if (i > 0 && romanSymbol.get(ch) > romanSymbol.get(roman.charAt(i - 1))) {
                result += romanSymbol.get(ch) - 2 * romanSymbol.get(roman.charAt(i - 1));
            } else if (i > 0 &&  i + 1 < roman.length()) {
                //This Condition is for checking two romans follow each other like 'IIX' wont take 1 + 9 but (1 -1)  + (10 -2) = 8  
                if (romanSymbol.get(roman.charAt(i - 1)) == romanSymbol.get(ch) && romanSymbol.get(roman.charAt(i + 1)) > romanSymbol.get(ch)) {
                    result = (result - romanSymbol.get(ch)) + (romanSymbol.get(roman.charAt(i + 1)) - 2 * romanSymbol.get(ch));
                    i++;
                } else {
                    result += romanSymbol.get(ch);
                }
            } else {
                result += romanSymbol.get(ch);
            }
        }

        return result;
    }

    public String integerToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

}
