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
        if (x%2==0){
            return false;
        }
        for (int i=3;i*i<=x;i+=2){
            if(x%i==0)
                return false;
        }
        return true;
    }
}
