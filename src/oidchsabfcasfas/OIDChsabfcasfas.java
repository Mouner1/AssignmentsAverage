/*
Mouner Dabjan
29 October 2018
This program is created to calculate the average of a student 
 */

package oidchsabfcasfas;
import java.util.Scanner; 

/**
 *
 * @author modab5310
 */
public class OIDChsabfcasfas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner keyedInput = new Scanner(System.in);
        double average = 0; 
        double sum = 0;
        double [] marks = new double [5]; 
        
        System.out.println("Enter your marks in the last  5 assignments:");
        for (int i = 0; i<=4; i++)
        {
            marks[i] = keyedInput.nextDouble(); 
        }
       
        for (int i = 0 ; i<=4; i++)
        {
            sum = marks[i] +sum;
        }
        
        System.out.println("The sum of your marks is:");
        System.out.println(sum);
        
        for (int i = 0; i<=4 ; i++)
        {
            average = sum/5; 
        }
        
        System.out.println("Here is your average:");
        System.out.println(average);
    }
    
}
