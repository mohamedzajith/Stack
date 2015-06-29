package com.mohamed.examples;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dba on 6/29/15.
 */
public class TheStack {
    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    //constructor
    public TheStack(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Stack Size : ");
        int size = sc.nextInt();
        this.stackSize = size;
        this.stackArray = new String[size];
        Arrays.fill(stackArray,"-1");
    }
    //constructor
    public TheStack(int size){
        this.stackSize = size;
        this.stackArray = new String[size];
        Arrays.fill(stackArray,"-1");
    }

    public void push(String input){
        if (!IsFull()){
            topOfStack++;
            stackArray[topOfStack] = input ;
            System.out.println(input+" was Added to the Stack");
        }else{
            System.out.println("Sorry but the Stack is full");
        }
    }

    public void pushMeny(String multipleValue){
        String[] tempValue = multipleValue.split(",");
        for (int i = 0; i < tempValue.length; i++) {
            push(tempValue[i]);
        }
    }
    public int pop(){
        if (IsEmpty()){
            System.out.println("Stack is Empty !! ");
        }else {
            System.out.println(stackArray[topOfStack]+" is remove from Stack");
        }
        return topOfStack--;
    }

    public void peek(){
        if (IsEmpty()){
            System.out.println("Stack is Empty !!");
        }else {
            System.out.println("Top Element is : "+stackArray[topOfStack]);
        }
    }
    public boolean IsEmpty(){
        return topOfStack == -1;
    }

    public boolean IsFull(){
        return topOfStack == stackSize-1;
    }

    public void DisplayTheStack() {
        if (IsEmpty()){
            System.out.println("Stack is Empty !!");
        }else{
            for (int i = 0; i <= topOfStack ; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        TheStack st = new TheStack();
        st.push("mohaned");
        st.push("nusra");
        st.pushMeny("nasrin,siraj,nimishan,miller");
        st.DisplayTheStack();
    }
}
