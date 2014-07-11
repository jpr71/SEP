/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep4;
import static sep4.IsPalindrome.IsPalindrome;
        
/**
 *
 * @author Joshua
 */
public class sep4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int greatest = 0;
        for (int n = 999; n >= 100; n--){
            for (int hold = n; hold>=100; hold--){
                int product = n*hold;
                if (IsPalindrome(product) && product > greatest)
                    greatest = product;
                else
                    product = 0;
            }
        }
        System.out.println(greatest);
    }
    
}
