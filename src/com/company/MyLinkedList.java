package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class MyLinkedList {
    private LinkedList<String> linkedList = new LinkedList<>();
    private String addStuff;
    private String removeStuff;

    public void push() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String userInput = scan.nextLine();
        linkedList.add(userInput);

    }

    public void setRemoveStuff(String userInput) {
        this.removeStuff = userInput;
    }

    public void remove() {
        if (linkedList.size() >= 10) {
            System.out.println("your list is too big pleas remove some elements");
        } else {

            setRemoveStuff(linkedList.getLast());
            linkedList.removeLast();
        }
    }

    public void undo() {//to bring back deleted elements
        if (!linkedList.isEmpty() && !removeStuff.isEmpty()) {
            linkedList.add(removeStuff);
        } else {
            System.out.println("your list is empty");
        }
    }

    public void printList() {
        System.out.println(linkedList);
    }

}

