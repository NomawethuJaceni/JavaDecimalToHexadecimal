/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaceni_n;

/**
 *
 * @author LUBANZI ORATILWE
 */

import java.io.*;

public class Jaceni_N {

    /**
     * @param args the command line arguments
     */
    
    
    // function to convert decimal to hexadecimal
    static void decToHexa(int n)
    {
        // char array to store hexadecimal number
        char[] hexaDeciNum = new char[100];
 
        // counter for hexadecimal number array
        int i = 0;
        while (n != 0) {
            // temporary variable to store remainder
            int temp = 0;
 
            // storing remainder in temp variable.
            temp = n % 16;
 
            // check if temp < 10
            if (temp < 10) {
                hexaDeciNum[i] = (char)(temp + 48);
                i++;
            }
            else {
                hexaDeciNum[i] = (char)(temp + 55);
                i++;
            }
 
            n = n / 16;
        }
 
        // printing hexadecimal number array in reverse
        // order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(hexaDeciNum[j]);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 1000;
        decToHexa(n);
    }
    
}
