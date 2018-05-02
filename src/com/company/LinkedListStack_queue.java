package com.company;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinkedListStack_queue {
    Scanner scan = new Scanner(System.in);
    private LinkedList<String> stack_quue = new LinkedList<>();
    private String tempRemoveCopy;
    private String tempAddCopy;
    private String getTempAddCopy;

    public void push() {
        System.out.println("enter string");
        String userIn = scan.nextLine();
        stack_quue.add(userIn);
    }

    public void setAddCopy(String userIn) {
        this.tempAddCopy = userIn;
    }

    public void Copy() {
        stack_quue.add(tempAddCopy);

    }

    public void setTempRemoveCopy(String userIn) {
        this.tempRemoveCopy = userIn;

    }

    public void remove() {
        if (stack_quue.size() >= 10) {
            System.out.println("your list is too big make it smaller");
        } else {
            try {
                System.out.println("remove string");
                setTempRemoveCopy(stack_quue.getLast());
                stack_quue.removeLast();
            } catch (NoSuchElementException e) {
                System.out.println("emoty list please addstring first.");
            }

        }
    }

    public void undo() {
        if (!stack_quue.isEmpty() || !tempRemoveCopy.isEmpty()) {
            stack_quue.add(tempRemoveCopy);
        } else {
            System.out.println("empty list please add string first");
        }
    }

    public void printList() {
        System.out.println(stack_quue);
    }
}
