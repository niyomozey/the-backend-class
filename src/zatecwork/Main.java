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
public class Main {
    public static void main(String args[])
 {
   RomanConverter convert = new RomanConverter();
   Operation op = new Operation();
   String romanNumber="II";
   int result = convert.romanToInteger(romanNumber);
   
   System.out.println("The Roman Number is: "+romanNumber);
   System.out.println("Its Integer Value is: "+result);
//   
//   System.out.println();
//   
//   romanNumber="DCCXCIX";
//   result = convert.romanToInteger(romanNumber);
//   
//   System.out.println("The Roman Number is: "+romanNumber);
//   System.out.println("Its Integer Value is: "+result);
//   
//    System.out.println("Adding : "+op.addRomans("X","IIX"));
 }
    
}
