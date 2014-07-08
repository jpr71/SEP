/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep3;
import static sep3.IsPrime.IsPrime;
/**
 *
 * @author Joshua
 */
public class SEP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double x = 600851475143L;
         int greatest=2;
         int nuevo;
         for (int n=2;n<=x;n++)
             if (IsPrime(n)==true){
                 if ((x/n)%1==0){
                     nuevo = n;
                     x = x/n;
                     if(nuevo>greatest){
                         greatest = nuevo;
                     }
                 }
                n++; 
             }
         System.out.println(greatest);
        }   
    }