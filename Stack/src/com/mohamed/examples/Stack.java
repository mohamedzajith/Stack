package com.mohamed.examples;

import java.util.Scanner;

/**
 * Created by dba on 6/29/15.
 */
public class Stack {
    private int[] Arr;
    private int len;
    int top = -1;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of stack : ");
        this.len = sc.nextInt();
        this.Arr = new int[len];
    }
    public void push(int x){
        if (Isfull()){
            System.out.print(x+" cannot be add because stack is FULL!!!\n");
        }else {
            top = top+1;
            Arr[top] = x;
            System.out.print(x+" add to stack\n");
        }
    }
    public int pop(){
        if (Isempty()){
            System.out.print("stack is EMPTY \n");
        }else {
            System.out.print(Arr[top]+" is remove from stack \n");
        }
        return top--;
    }
    public void peek(){
        if (Isempty()) {
            System.out.print("stack is EMPTY  ");
        }
        else {
            System.out.println("Top element is : " + Arr[top]);
        }
    }
    public void display(){
        if (Isempty()){
            System.out.print("stack is EMPTY  ");
        }else {
            for (int i = 0; i <= top; i++) {
                System.out.print(Arr[i] + "  ");
            }
        }
        System.out.println();
    }
    public boolean Isfull(){
        return top==len-1;
    }
    public boolean Isempty(){
        return top== -1;
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.read();
        //st.push(12);
        // st.display();
        //st.push(34);
        //st.display();
        st.push(23);
        //st.display();
        //st.pop();
        //st.display();
        st.peek();
        st.pop();
        st.push(34);
        st.push(34);
        st.push(34);
        st.display();
    }
}
