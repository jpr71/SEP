/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep3;

/**
 *
 * @author Joshua
 */
public class IsPrime {
    
    public static boolean IsPrime(int x){
        if (x%2==0){ //checks for even numbers
            return false;
        }
        for (int i=3;i*i<=x;i+=2){ //checks if it's divisible by 3 and all odd numbers until the square root of that number since all divisors are up to the square root. Since even numbers case are handled previously we only deal with odd numbers.
            if(x%i==0)
                return false;
        }
        return true;// if both previous cases fail, then the number is prime.
    }
}
