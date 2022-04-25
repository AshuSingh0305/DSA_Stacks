package DataStructure;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StackUsingArray{
    public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    System.out.println(stack.pop());
    System.out.println(Arrays.toString(stack.array));
    System.out.println(stack.isEmpty());
    System.out.println(stack.peek());
    }
}
class Stack{
    int array[] = new int[10];
    int count=0;
    public void push(int value){
        array[count]=value;
        count++;
    }
    public int pop(){
        int top = array[count-1];
        array[count-1] = 0;
        count--;
        return top;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public int peek(){
        return array[count-1];
    }

}
