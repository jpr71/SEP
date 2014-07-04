/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep2;

/**
 *
 * @author Joshua
 */
public class Fibonacci {
	public static int fibonacci(int n) {
                if (n < 2) {
                   return n;
                }
                else {
		   return fibonacci(n - 1) + fibonacci(n - 2);
                   
                }
	}
    
}
