/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep1;

/**
 *
 * @author Joshua
 */


public class SEP1 {

   
   
    
    public static void main(String[] args) {
        int hold = 0;
        for ( int x = 0; x < 1000; x++){
	            if ((x%3==0)|(x%5==0)){// every number divisible by 5 or 3, it's mod will equal 0.
                hold += x;
            }
        }
        System.out.println(hold);
    }

}
