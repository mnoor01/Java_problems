package com.company;

public class Link {
    public int data1;
    public double data2;
    public Link nextLink;
    public static void main(String[] args){

    }

    public Link(int data1, double data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void printLink() {
        System.out.println("{" + data1 + "," + data2 + "}");
    }
}
