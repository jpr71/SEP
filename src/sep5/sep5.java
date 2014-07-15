/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep5;


import static sep5.Divisible.Divisible;

/**
 *
 * @author Joshua
 */
public class sep5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double smallest=20; 
        int i = 2;
        for (double x =19; x>=1;x--){
            if(!((smallest/x)%1==0)){ // Get all the numbers that don't fit in the current product.
                smallest *= x;  
            }
        }
        boolean bool = true;
        while (Divisible(smallest)== bool && i<21){
            smallest=smallest/i; // divide by 2,3... until the smallest is not divisible by all the numbers from 1 to 20.
            int tracker = i; 
            if (Divisible(smallest) == false){ // In case it's not divisible by a bigger number but it still might be divisible by a smaller number multiple times.
                smallest = smallest*i;
                i=1; // restart from 2 since i is increased at the end of the loop, you set i=1, so it starts again with 2 after its incremented. 
                bool=true; // set bool = true to retry with the smaller number.
            }
             i++;
             if (tracker == i){ // In case it's not divisible and i has alread been tested. Jumps out of the loop. Program is over.
                    i = 22;
                }
        }  
    System.out.println(smallest);
    }  
}
