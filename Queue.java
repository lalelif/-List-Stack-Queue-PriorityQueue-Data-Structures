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
class Queue
{
    private int maxSize;
    private Mahalle[] queArray;
    private int front;
    private int rear;
    private int nItems;
//--------------------------------------------------------------
    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = new Mahalle[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
//--------------------------------------------------------------
    public void insert(Mahalle j) // put item at rear of queue
    {
        if(rear == maxSize-1) // deal with wraparound
            rear = -1;
        queArray[++rear] = j; // increment rear and insert
        nItems++; // one more item
    }
//--------------------------------------------------------------
    public Mahalle remove() // take item from front of queue
    {
        Mahalle temp = queArray[front++]; // get value and incr front
        if(front == maxSize) // deal with wraparound
        front = 0;
        nItems--; // one less item
        return temp;
    }
//--------------------------------------------------------------
    public Mahalle peekFront() // peek at front of queue
    {
        return queArray[front];
    }
//--------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    {
        return (nItems==0);
    }
//--------------------------------------------------------------
    public boolean isFull() // true if queue is full
    {
        return (nItems==maxSize);
    }
//--------------------------------------------------------------
    public int size() // number of items in queue
    {
        return nItems;
    }
//--------------------------------------------------------------
} // end class Queue
