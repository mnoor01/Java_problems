package com.company.intensejavawithjrod;

public class Donut {
    enum Flavor {JELLY, GLAZED}

    public static void main(String[] args) {
        Donut jelly;
        jelly = new Donut();
        Class<Donut> donutClass = Donut.class;
        jelly.getClass();//this is a call site
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {//this is a method declaration
        System.out.println("jsoceofv");
    }
    abstract class Shape{
        abstract double getArea();
    }
    class square extends Shape{

        private int length;

        @Override
        double getArea() {
            return length*length;
        }
    }
}
/*call stack is a series of program counter addresses representing
instructions from within the program. The first PC,called the
leaf PC, is at the bottom of the stack, and is the address of the next instruction to be
executed. The next PC is the address of the call to the
function containing th leaf PC.


*/