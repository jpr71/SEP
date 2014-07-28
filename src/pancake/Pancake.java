/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pancake;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import static pancake.Equals.Equals;
import static pancake.Equals.Max;
import static pancake.Equals.Move;

/**
 *
 * @author Joshua
 */
public class Pancake {

   
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Random rand = new Random();
        while (stack.size()<25){
            int p = rand.nextInt(100)+1; // Synthetic data I created to verify my algorithm works for different data samples
            if (!stack.contains(p)) {
                stack.push(p);
            }
        }
        System.out.println(stack);
        Stack<Integer> stack2 = (Stack<Integer>) stack.clone();
        Stack<Integer> stack3 = (Stack<Integer>) stack.clone();
        int i = 0;
        while (!stack2.isEmpty()){
            stack1.push(Max(stack2));// stack1 is what stack should look like after it's sorted. This is just for testing purposes.
        }
     while (!Equals(stack,stack1)){
            int index = stack3.size()-1;
            int max = Max(stack3);//Obtain the max of the clone so I can look for it in stack
            if (stack.get(i)==max){//Case 0) If the max is at the bottom then it's all good. 
            }
            else if (stack.peek() == max){// Case 1) If the max is at the top of the stack
                Move(stack,index,1);//The one is to indicate that it should flip the stack entirely
            }
            else{ //Case 2) the max is in between,
                int d = stack.indexOf(max);
                Move(stack,d,0);
                if (stack.peek() == max){
                    Move(stack,index,1);
            }
        }
            i++;
    }
        System.out.println(stack);
}
}

