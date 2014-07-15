/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep5;

/**
 *
 * @author Joshua
 */
public class Divisible {
    public static boolean Divisible(double n){
        boolean bool = true;
        for (double x = 20; x>=1;x--){
            if (bool==false){ // jumps out of the loop as soon it's not divisible by a number between 1-20.
                x=0; 
            }
            if ((n/x)%1==0 && bool==true){
                bool = true;
            }
            else
                bool = false;
        }
       return bool;
    }
}

