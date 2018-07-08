package com.company.intensejavawithjrod;

public class Immutable {
    String s = new String();
    MutableObject mutableObject = new MutableObject();
    int someInt = mutableObject.x;

}
class MutableObject{
    public int x;
}