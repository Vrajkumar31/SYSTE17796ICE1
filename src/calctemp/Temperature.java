/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calctemp;

import java.util.Scanner;

/**
 *
 * @author nilu
 */
public class Temperature {

    public static void main(String[] args) {

        int i;
        double total_temp = 0;
        System.out.println("Please enter 14 diffrent temperatures: ");

        double[] temp = new double[14];

        Scanner input = new Scanner(System.in);
        for (i = 0; i < temp.length; i++) {
            temp[i] += input.nextDouble();
            
            if(temp[i] < 50 && temp[i] > -50){
            total_temp += temp[i];
            }
            
            else 
                throw new IllegalArgumentException("Please enter the value between -50 to 50");
        }
        
        final int cons= 14;
        double calAvg= total_temp /cons;
        
        System.out.println("Total temperature= " + total_temp);
        System.out.println("Average of temperature= " + calAvg);
           
        double calcMax= temp[0];
        for(i=0; i < temp.length; i++){
            if(temp[0] > calcMax)
                System.out.println(calcMax);
        }
    }

}
