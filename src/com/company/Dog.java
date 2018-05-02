package com.company;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class Dog implements Pet {
    @Override
    public void beFriendly() {
        System.out.println("loyal and never betrays unlike human beings");
    }

    @Override
    public void play() {
        System.out.println("likes to play frizby");
    }
}
