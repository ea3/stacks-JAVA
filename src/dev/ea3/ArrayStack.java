package dev.ea3;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee [] stack;
    private int top;

    public ArrayStack(int capacity) {
        this.stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(this.top == this.stack.length){
            // need to resize the backing array

            Employee [] newArray = new Employee[2 * this.stack.length] ;
            System.arraycopy(this.stack, 0, newArray, 0, this.stack.length);
            this.stack = newArray;
        }

        this.stack[top++] = employee;
    }


    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = this.stack[--top];
        this.stack[top] = null;
        return employee;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return this.stack[top - 1];
    }


    public int size(){
        return this.top;
    }

    public void printStack(){
        for(int i = top -1; i >= 0; i-- ){
            System.out.println(this.stack[i]);
        }
    }



    public boolean isEmpty(){
        return this.top == 0;
    }
}
