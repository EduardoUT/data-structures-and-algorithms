package com.datastructures.linkedlist;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author eduar
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList sL = new SinglyLinkedList();
        sL.insertAtBeginning(3);
        sL.insertAtBeginning(3);
        sL.insertAtBeginning(1);
        sL.insertAtBeginning(1);
        /*
        Node firstNode = new Node(13);
        Node secondNode = new Node(23);
        Node thirdNode = new Node(56);
        Node fourthNode = new Node(100);
        
        sL.setHead(new Node(67));
        sL.getHead().setNext(firstNode);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(fourthNode);*/

 /*
        sL.insert(1, 23);
        sL.insert(1, 33);
        sL.insert(2, 11);
        sL.insert(4, 35);
         */
        //sL.deleteNodeAtPosition(2);
        sL.removeDuplicates();
        sL.printList();
        sL.insertInOrder(2);
        sL.printList();
        System.out.println(sL.length());
        //sL.reverse();
        //sL.printList();
        //System.out.println(sL.length());
        //System.out.println(sL.size());
        //System.out.println(sL.findNthValueFromEnd(4).getData());

        //LinkedList lista = new LinkedList();
        
        
        SinglyLinkedList listA = new SinglyLinkedList();
        SinglyLinkedList listB = new SinglyLinkedList();
        
        listA.insertAtLast(1);
        listA.insertAtLast(2);
        listA.insertAtLast(5);
        listA.insertAtLast(9);
        listA.printList();
        listB.insertAtLast(1);
        listB.insertAtLast(3);
        listB.insertAtLast(4);
        listB.insertAtLast(6);
        listB.insertAtLast(8);
        listB.insertAtLast(10);
        listB.insertAtLast(12);
        listB.printList();
        
        System.out.println(listA.getHead().getData() + " " + listB.getHead().getData());
        
        Node mergeWithDummyNode = SinglyLinkedList.mergeWithDummyNode(listA.getHead(), listB.getHead());
        SinglyLinkedList mergeWithDummyNodeList = new SinglyLinkedList();
        mergeWithDummyNodeList.setHead(mergeWithDummyNode);
        mergeWithDummyNodeList.printList();
        
    }
}
