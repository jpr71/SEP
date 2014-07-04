/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep2;

import static sep2.Fibonacci.fibonacci;

/**
 *
 * @author Joshua
 */
public class SEP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int hold = 0;
       int n = 1;
        while (fibonacci(n)<4000000){
            int k = fibonacci(n);
            if (k%2 == 0){
               hold += k;
            }
            n++;
        }
        System.out.println(hold);    
    }

  }
    
