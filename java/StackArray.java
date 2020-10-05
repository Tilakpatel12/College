package com.stack;

public class StackArray {
    //decalre array size
    int stack [];

    //top of the stack
    int top;

    StackArray(){
        top = -1;
        stack = new int[10];
    }

    public boolean isEmpty(){
        boolean isEmpty = top < 0 ;
        return isEmpty;
    }

    public boolean push(int new_element){
        //check if the stack is overflow or not
        if (top >= stack.length - 1){
            System.out.println( " stack is Overfloa");
            return false;
        }else{
            top = top + 1;
            stack[top]  = new_element;
            System.out.println(new_element+" is pushed into stack");
            return true;
        }
    }

    public int pop(){
        //Check is the stack is empty
        boolean ans = isEmpty();
        if (ans){
            System.out.println("Stack is Underflow");
            return 0;
        }else{
            int top_element = stack[top];
            top = top - 1;
            return top_element ;
        }
    }
    public int peek(){
        //Check is the stack is empty
        boolean ans = isEmpty();
        if (ans){
            System.out.println("Stack is Underflow");
            return 0;
        }else{
            int top_element = stack[top];
            return top_element ;
        }
    }
    public void printStack (){

        for (int i= 0; i<= top ; i++){
            System.out.print(stack[i] + ", ");
        }
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray();

        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.push(60);

        stack.printStack();
    }
}
