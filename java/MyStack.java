package com.stack;

import java.sql.SQLOutput;

public class MyStack {

    int myStack[];
    int top;

    MyStack(){
        myStack = new int[10];
        top = -1;
    }

    public boolean push(int newElement){
        if (top >= myStack.length - 1){
            System.out.println("Stack is overFlow");
            return false;
        }
        else{
            top++;
            myStack[top]= newElement;
            return true;
        }
    }

    public boolean isEmpty(){
        if (top < 0 ){
            return true;
        }
        else{
            return false;
        }
    }

    public int pop(){
        if( top < 0){
            System.out.println("Stack is underFlow");
            return 0;
        }
        else{
            int newTop = myStack[top];
            top--;
            return newTop;
        }
    }

    public int peek(){
        if( top < 0) {
            System.out.println("Stack is underFlow");
            return 0;
        }
        else {
            return myStack[top];
        }
    }

    public void print(){

        for(int i=0; i <= top; i++){
            System.out.println(myStack[i]+ " , ");
        }
    }
}
