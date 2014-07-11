/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sep4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/**
 *
 * @author Joshua
 */
public class IsPalindrome {
    
    public static boolean IsPalindrome(int n){
        Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> stack = new LinkedList<>(); 
        boolean palindrome = false;
        while (n > 0){
            queue.add(n%10);//Array because they would be in reverse order
            stack.push(n%10);//Stack because they would be in the correct order
            n= n/10;
        }
        while (!(queue.isEmpty() || stack.isEmpty())) {
            palindrome = Objects.equals(queue.remove(), stack.pop());// Since the stack filo and the array is fifo, if n is a palindrome they will be equal every time.
            if (palindrome == false){
                queue.clear();
            }
        }
        return palindrome;
    }
    
}
