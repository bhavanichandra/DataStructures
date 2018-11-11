package com.company;

import com.company.doublylinkedlist.DoublyLinkedList;
import com.company.singlylinkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

//      SinglyLinkedList linkedList = new SinglyLinkedList();
//      linkedList.insertAtTail(5);
//      linkedList.insertAtTail(21);
//      linkedList.insertAtTail(4);
//      linkedList.insertAtHead(9);
//      linkedList.print();
//      System.out.println("-----------------");
//      linkedList.removeData(21);
//      linkedList.print();
//      System.out.println("-----------------");
//      linkedList.insertAtPosition(21, 1);
//      linkedList.print();
//      System.out.println(linkedList.search(21) + " was found in linked list");

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertInOrder(3);
        doublyLinkedList.insertInOrder(5);
        doublyLinkedList.insertInOrder(4);
        doublyLinkedList.insertInOrder(3);
        doublyLinkedList.print();


    }
}
