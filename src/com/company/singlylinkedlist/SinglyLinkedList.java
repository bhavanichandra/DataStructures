package com.company.singlylinkedlist;
/*
author: Bhavani Chandra
*/

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty(){
        return (head==null);
    }
    public void print(){
        display(head);
    }
    public void display(Node node){
        node.display();
        if(node.getNext()!=null){
            display(node.getNext());
        }
    }
    public void insertAtTail(int data){

        if(head == null){
            head = new Node(data);
        }else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(data));
        }
    }
    public void insertAtHead(int data){
        Node newHead = new Node(data);
        newHead.setNext(head);
        head = newHead;
    }

    public void remove(int data){
        if(isEmpty()){
            System.out.println("Linked list is empty");
        } else{
            Node current = head;
            while(current.getNext()!=null){
                if(current.getNext().getData() == data) {
                   current.setNext(current.getNext().getNext());
                    return;
                }
                current = current.getNext();
            }
        }
    }
    public void removeData(int data){
        if(!isEmpty()){
            Node current = head;
            Node previous = head;
            while(current.getData() != data){
                if(current.getNext()==null){
                    return;
                }else {
                    previous = current;
                    current = current.getNext();
                }
            }
            if(current == head){
                current.setNext(head);
            }else {
                previous.setNext(current.getNext());
            }
        }else {
            System.out.println("Linked List is empty");
        }
    }
    public Node search(int data){
        Node current = head;
        if(!isEmpty()){
            while (current.getData() != data){
                if(current.getNext() == null){
                    return null;
                }else {
                    current = current.getNext();
                }
            }
        }else {
            System.out.println("Linked List is Empty");
        }
        return current;
    }
    public void insertAtPosition(int data, int position){

        Node newNode = new Node(data);
        if(position == 0){
            insertAtHead(data);
        }
        else {
            Node current = head;
            Node previous = head;
            int i = 0;
            while (i < position) {
                previous = current;
                current = current.getNext();
                if (current == null) {
                    break;
                }
                i++;
            }
            newNode.setNext(current);
            previous.setNext(newNode);
        }
    }
}
