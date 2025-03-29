package org.java.modifiers;

class Parent {
    protected Parent() {  // Protected constructor
        System.out.println("Protected Constructor");
    }
}


class ch extends Parent {
     ch() {
        super(); // Allowed in subclass
    }
}

public class Child{
    public static void main(String[] args) {
        Parent p1 = new Parent();// it can be instiantiated
        Parent p2 = new ch(); // parent can we instiated this way as well

    }
}

