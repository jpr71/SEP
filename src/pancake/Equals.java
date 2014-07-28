/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pancake;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;


/**
 *
 * @author Joshua
 */
public class Equals {
    public static boolean Equals(Stack<Integer> s1, Stack<Integer> s2){
        if (s1 == s2){
            return true;
        }
        if (s1.size()!=s2.size()){
            return false;
        }
        if(s1 == null || s2 == null){
            return false;
        }
        
        for (int i = 0; i < s1.size(); i++){
            if(!Objects.equals(s1.get(i), s2.get(i))){
                return false;
            }
        }
        return true;
    }
    public static int Max (Stack<Integer> stack){// Play with the stack and queue to find and remove the max of the stack
        int max = Integer.MIN_VALUE;
        boolean counter = false;
        int oldmax = 0; // So it doesn't grab the same max twice 
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()){
            if (stack.peek()>max){
                if (counter==true){
                  if(oldmax != stack.peek())
                      oldmax = max;
                      queue.add(oldmax);
                }
                max = stack.pop();
                counter = true;
            }
            else 
                queue.add(stack.pop());
                counter = true;
        }
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        return max;
    }
    
    public static void Move (Stack<Integer> stack, int tillwhere, int counter){
        Queue<Integer> queue = new LinkedList<>(); //Same play of stack and queue
        int index1 = stack.size()-1;
        if (tillwhere != index1 && counter == 0){
            for (int index2 = index1 ; index2>=tillwhere; index2--){
                queue.add(stack.pop());
            }
            while (!queue.isEmpty()){
                stack.push(queue.remove());
            }
        }
        else
            for (int index = 0; index<=tillwhere; index++){
                queue.add(stack.pop());
        }
            while (!queue.isEmpty()){
                stack.push(queue.remove());
        }
    }
}
