package com.codingblocks.lecture_15.stack_queue;

import java.util.Stack;

public class QueueUsingStackInsert {

    private Stack<Integer> stack = new Stack<>();

    public void add(int item){
        stack.push(item);
    }

    public Integer remove(){
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }

        int val = temp.pop();
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }

        return val;
    }

    public boolean isEmpty(){
        return stack.empty();
    }

    public Integer front(){
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }

        int val = temp.peek();

        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }

        return val;
    }
}
