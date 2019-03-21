/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.math.BigDecimal;

/**
 *
 * @author vishnukdawah
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        staircase(6);
        
    }
    
    

    static void staircase(int n) {
        
        // n = 6
        
        int counter = 1;
        int spaceCounter = n;
        
        // for each line
        for(int i = counter; i<=n ; i++){
            
            // within each line, perform these actions:
            // 1) use a while loop to print out the amount of spaces first
            // 2) Then print out a hashtag outside the while but inside the inner for loop, so that 
            for(int j=0; j<counter; j++){
                while(spaceCounter>1){  // space counter starts at 6, so as long as it is greater than 1 it will print spaces until its not. So it will print spaces equal to what the space counter was minus 1, so 5 spaces the first loop
                    System.out.print(" ");
                    spaceCounter = spaceCounter-1;  // we decrement spaceCounter so in the next loop,we start off with 5, then the while loop will print out 4 spaces, which we need for line 2
                }
            System.out.print("#");
            }
            System.out.print("\n");
            spaceCounter=n-counter;
            counter++;

        }

    }
    
    
} 

