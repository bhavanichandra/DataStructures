package com.company.doublylinkedlist;
/*
author: Bhavani Chandra
*/

public class Neighbour {

    private int data;
    private Neighbour next;
    private  Neighbour previous;

    public Neighbour(int data) {
        this.data = data;
    }

    public Neighbour getNext() {
        return next;
    }

    public void setNext(Neighbour next) {
        this.next = next;
    }

    public Neighbour getPrevious() {
        return previous;
    }

    public void setPrevious(Neighbour previous) {
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public void display(){
        System.out.println(data + " ");
    }
}
