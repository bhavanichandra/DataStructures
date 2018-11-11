package com.company.doublylinkedlist;
/*
author: Bhavani Chandra
*/

public class DoublyLinkedList {

    private Neighbour firstLink;
    private Neighbour lastLink;

    public boolean isEmpty(){
        return (firstLink == null);
    }

    public void insertAtFirstPosition(int data){
        Neighbour newNeighbour = new Neighbour(data);
        if(isEmpty()){
            lastLink = newNeighbour;
        } else {
            firstLink.setPrevious(newNeighbour);
        }
        newNeighbour.setNext(firstLink);
        firstLink = newNeighbour;
    }

    public void insertAtLastPosition(int data){
        Neighbour newNeighbour = new Neighbour(data);
        if(isEmpty()){
            firstLink = newNeighbour;
        }else {
            lastLink.setNext(newNeighbour);
            newNeighbour.setPrevious(lastLink);
        }
        lastLink = newNeighbour;
    }
    public void print() {

        display(firstLink);
    }
    public void display(Neighbour firstLink){
        firstLink.display();
        if(firstLink.getNext() != null){
            display(firstLink.getNext());
        }
    }
    public void insertAfterKey(int data, int key){
        Neighbour newNeighbour = new Neighbour(data);

        Neighbour current = firstLink;
        while (current.getData() != key){
            current = current.getNext();
            if(current == null){
                return;
            }
        }
        if (current == lastLink){
            newNeighbour.setNext(null);
            lastLink = newNeighbour;
        }else {
            newNeighbour.setNext(current.getNext());
            current.getNext().setPrevious(newNeighbour);
        }
        newNeighbour.setPrevious(current);
        current.setNext(newNeighbour);
    }

    public void insertInOrder(int data) {
        Neighbour newNeighbour = new Neighbour(data);
        Neighbour previous = null;
        Neighbour current = firstLink;
        while ((current!=null) && (data > current.getData())){
            previous = current;
            current = current.getNext();
        }
        if(previous == null){
            firstLink = newNeighbour;
        }else {
            previous.setNext(newNeighbour);
        }
        newNeighbour.setNext(current);
    }
}
