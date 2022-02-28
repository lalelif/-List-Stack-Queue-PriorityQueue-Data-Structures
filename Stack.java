/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresproject2;

/**
 *
 * @author lalee
 */
public class Stack {
    private int maxSize; // size of stack array
    private Mahalle[] stackArray;
    private int top; // top of stack
//--------------------------------------------------------------
public Stack(int s) // constructor
{
	maxSize = s; // set array size
	stackArray = new Mahalle[maxSize]; // create array
	top = -1; // no items yet
}
//--------------------------------------------------------------
public void push(Mahalle j) // put item on top of stack
{
	stackArray[++top] = j; // increment top, insert item
}

//--------------------------------------------------------------
public Mahalle pop() // take item from top of stack
{
    return stackArray[top--]; 
// access item, decrement top
}
//--------------------------------------------------------------
public Mahalle peek() // peek at top of stack
{
    return stackArray[top];
}
//--------------------------------------------------------------
public boolean isEmpty() // true if stack is empty
{
    return (top == -1);
}
//--------------------------------------------------------------
public boolean isFull() // true if stack is full
{
    return (top == maxSize-1);
}
}
