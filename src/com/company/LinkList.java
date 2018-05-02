package com.company;

import java.util.List;

public class LinkList {
    private Link first;
    private int data;

    public LinkList(int data) {
        this.data = data;
    }

    public boolean isEmpty() {//returns true if list is empty.
        return first == null;
    }

    public void insert(int data) {
        LinkList list = new LinkList(data);
        list.first = null;

        if (first != null){

        }
    }

    public Link delete() {
        Link temp = first;
        if (first == null) {
            return null;
        }
        first = first.nextLink;
        return temp;
}

    public void printList() {
        Link currentLink = first;
        System.out.println("List: ");
        while (currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println(" ");
    }

}
